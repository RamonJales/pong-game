package entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Score extends Rectangle {

	private static int game_widht;
	private static int game_height;
	
	private int player1;
	private int player2;
	
	public Score(int game_widht, int game_height) {
		Score.game_widht = game_widht;
		Score.game_height = game_height;
	}
	
	public static int getGame_widht() {
		return game_widht;
	}

	public static void setGame_widht(int game_widht) {
		Score.game_widht = game_widht;
	}

	public static int getGame_height() {
		return game_height;
	}

	public static void setGame_height(int game_height) {
		Score.game_height = game_height;
	}

	public int getPlayer1() {
		return player1;
	}

	public void setPlayer1(int player1) {
		this.player1 = player1;
	}

	public int getPlayer2() {
		return player2;
	}

	public void setPlayer2(int player2) {
		this.player2 = player2;
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("Consoles", Font.PLAIN, 60));
		g.drawLine(game_widht / 2, 0, game_widht / 2, game_height);
		g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (game_widht / 2) - 85, 50);
		g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (game_widht / 2) + 20, 50);
	}
}
