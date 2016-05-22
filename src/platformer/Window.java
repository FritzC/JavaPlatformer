package platformer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	private JFrame frame;
	private JPanel panel;

	public Window() {
		frame = new JFrame("Platformer");
		panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				draw((Graphics2D) g);
			}
		};
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 500));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.drawRect(10, 10, 100, 100);
	}
	
}
