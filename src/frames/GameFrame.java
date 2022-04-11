package frames;

import java.awt.Color;

import javax.swing.JFrame;

import panels.GamePanel;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
		
	public GameFrame() {
		this.add(new GamePanel());
		this.setTitle("Pong Game");
		this.setBackground(Color.BLACK);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
