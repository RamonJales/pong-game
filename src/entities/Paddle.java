package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Paddle extends Rectangle {
		
	int id;
	int yVelocity;
	int speed = 10;
	
	public Paddle(int x, int y, int paddleWidth, int paddleHeight, int id) {
		super(x, y, paddleWidth, paddleHeight);
		this.id = id;
	}

	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_A) {
				setYDirection(-speed);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				setYDirection(speed);
				move();
			}
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				setYDirection(-speed);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				setYDirection(speed);
				move();
			}
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_A) {
				setYDirection(0);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				setYDirection(0);
				move();
			}
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				setYDirection(0);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				setYDirection(0);
				move();
			}
			break;
		}
	}
	
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
	}
	
	public void move() {
		y = y + yVelocity;
	}
	
	public void draw(Graphics g) {
		if (id == 1) {
			g.setColor(Color.BLUE);
		}
		else {
			g.setColor(Color.RED);
		}
		g.fillRect(x, y, width, height);
	}
}
