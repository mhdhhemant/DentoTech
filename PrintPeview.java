import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 * PrintPeview.java - Simple Java Print Preview
 * A simple GUI previewer for Pageable objects. See the LICENSE string for license terms.
 * 
 * @author Isaac Schemm
 *
 * @version 2012-02-16
 */
public class PrintPeview extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public static final String LICENSE = "Simple Java Print Preview (2012-02-16)\n" +
			"Copyright (C) 2012 Isaac Schemm\n\n" +
			"Permission is hereby granted, free of charge, to any person obtaining a\n" +
			"copy of this software and associated documentation files (the \"Software\"),\n" +
			"to deal in the Software without restriction, including without limitation the\n" +
			"rights to use, copy, modify, merge, publish, distribute, sublicense, and/or\n" +
			"sell copies of the Software, and to permit persons to whom the Software is\n" +
			"furnished to do so, subject to the following conditions:\n\n" +
			"The above copyright notice and this permission notice shall be included in all\n" +
			"copies or substantial portions of the Software.\n\n" +
			"THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,\n" +
			"INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR\n" +
			"PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE\n" +
			"LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT\n" +
			"OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE\n" +
			"OR OTHER DEALINGS IN THE SOFTWARE.";
	
	private PageFormat pf;
	private Pageable pg;
	private int pageIndex;
	private int totalPages;
	private double scaler;
	
	private String title;
	private JTextField pageInput;
	private JTextField zoomInput;
	private PreviewPanel pp;
	private JLabel statusBar;
	
	public PrintPeview(String title, Pageable pg, int pageIndex) {
		this.title = title;
		setTitle(title + " - Print Preview");
		scaler = .5;
		this.pg = pg;
		this.pageIndex = pageIndex;
		this.totalPages = pg.getNumberOfPages();
		pf = pg.getPageFormat(pageIndex);
		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		setLayout(new BorderLayout());
		pp = new PreviewPanel();
		add(new JScrollPane(pp), BorderLayout.CENTER);
		
		JPanel topBar = new JPanel();
		topBar.setLayout(new BorderLayout());
		add(topBar, BorderLayout.NORTH);
		JPanel leftTop = new JPanel();
		JPanel rightTop = new JPanel();
		topBar.add(leftTop, BorderLayout.WEST);
		topBar.add(rightTop, BorderLayout.EAST);
		
		leftTop.add(new JLabel("Page:"));
		Insets pageButtonInsets = new Insets(0, 2, 0, 2);
		JButton pageBack = new JButton("<");
		pageBack.setMargin(pageButtonInsets);
		pageBack.setActionCommand("back");
		pageBack.addActionListener(this);
		JButton pageForward = new JButton(">");
		pageForward.setMargin(pageButtonInsets);
		pageForward.setActionCommand("forward");
		pageForward.addActionListener(this);
		pageInput = new JTextField(Integer.toString(pageIndex+1));
		pageInput.setPreferredSize(new Dimension(30, 20));
		pageInput.setActionCommand("page");
		pageInput.addActionListener(this);
		leftTop.add(pageBack);
		leftTop.add(pageInput);
		leftTop.add(pageForward);

		rightTop.add(new JLabel("Zoom:"));
		zoomInput = new JTextField((int)(scaler*100)+"%");
		zoomInput.setPreferredSize(new Dimension(30, 20));
		rightTop.add(zoomInput);
		JButton zoomSet = new JButton("Set");
		zoomSet.setMargin(new Insets(0, 0, 0, 0));
		zoomSet.setPreferredSize(new Dimension(30, 20));
		rightTop.add(zoomSet);
		zoomSet.setActionCommand("zoom");
		zoomSet.addActionListener(this);
		
		JPanel lowerBar = new JPanel();
		lowerBar.setLayout(new BorderLayout());
		lowerBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		statusBar = new JLabel("Ag"); // temporary label for setting size of status bar
		lowerBar.add(statusBar, BorderLayout.CENTER);
		add(lowerBar, BorderLayout.SOUTH);
		
		JButton license = new JButton("<html>&copy;</html>");
		license.setActionCommand("license");
		license.setMargin(new Insets(0, 0, 0, 0));
		license.addActionListener(this);
		lowerBar.add(license, BorderLayout.WEST);
		
		JButton print = new JButton("Print...");
		print.setActionCommand("print");
		print.setMargin(new Insets(4, 0, 4, 0));
		print.addActionListener(this);
		lowerBar.add(print, BorderLayout.EAST);

		pack();
	}
	
	private void updateStatusBar() {
		updateStatusBar("Page " + (pageIndex+1) + " of " + totalPages);
	}
	private void updateStatusBar(String s) {
		updateStatusBar(s, Color.black);
	}
	private void updateStatusBar(String s, Color c) {
		statusBar.setText(s);
		statusBar.setForeground(c);
	}
	
	private void print() {
		PrinterJob pj = PrinterJob.getPrinterJob();
		pj.setPageable(pg);
		pj.setJobName(title);
		if (pj.printDialog()) {
			try {
				pj.print();
			} catch (PrinterException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Could not print.\nSee the Java error console for details.", "error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private class PreviewPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		public PreviewPanel() {
			resetPreferredSize();
		}
		
		public void resetPreferredSize() {
			setPreferredSize(new Dimension((int)(pf.getWidth()*scaler), (int)(pf.getHeight()*scaler)));
		}
		
		public void paintComponent(Graphics g1) {
			Graphics2D g = (Graphics2D)g1;
			g.setColor(Color.black);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.white);
			g.fillRect(0, 0, (int)(pf.getWidth()*scaler), (int)(pf.getHeight()*scaler));
			g.setColor(Color.black);
			try {
				g.scale(scaler, scaler);
				pg.getPrintable(pageIndex).print(g, pf, pageIndex);
//				g.rotate(Math.PI);
//				g.translate(-pf.getWidth(), -pf.getHeight());
//				pg.getPrintable(pageIndex).print(g, pf, pageIndex);
				updateStatusBar();
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				g.setFont(new Font("Helvetica", Font.ITALIC, 30));
				g.drawString("Page index out of range", 10, 30);
				updateStatusBar("Page index out of range", Color.red);
			} catch (PrinterException e) {
				e.printStackTrace();
				g.setFont(new Font("Helvetica", Font.ITALIC, 30));
				g.drawString("Printer error", 10, 30);
				updateStatusBar("Printer error", Color.red);
			}
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("page")) {
			// change page
			try {
				pageIndex = Integer.parseInt(pageInput.getText())-1;
				pp.repaint();
			} catch (NumberFormatException e) {
				// do nothing if the entry is not a number
			}
		} else if (arg0.getActionCommand().equals("back")) {
			if (pageIndex > 0) {
				pageIndex--;
				pageInput.setText(Integer.toString(pageIndex+1));
				pp.repaint();
			}
		} else if (arg0.getActionCommand().equals("forward")) {
			if (pageIndex < totalPages - 1) {
				pageIndex++;
				pageInput.setText(Integer.toString(pageIndex+1));
				pp.repaint();
			}
		} else if (arg0.getActionCommand().equals("zoom")) {
			// change zoom setting
			try {
				scaler = Double.parseDouble(zoomInput.getText().replaceAll("%", "")) / 100.0;
				pp.resetPreferredSize();
				pp.revalidate();
				pp.repaint();
			} catch (NumberFormatException e) {
				// do nothing if the entry is not a number
			}
		} else if (arg0.getActionCommand().equals("license")) {
			JOptionPane.showMessageDialog(this, LICENSE);
		} else if (arg0.getActionCommand().equals("print")) {
			print();
		}
	}

}