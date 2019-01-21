package org.huaxia.game;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	public static int HEALTH = 100;
	private int greenValue = 255;
	
	private int score = 0;
	private int level = 1;
	private Game game;
	
	public void tick() {
//		HEALTH--;
//		HEALTH = Game.clamp(HEALTH, 0, 100);
		greenValue = HEALTH*2;
		greenValue = Game.clamp(greenValue, 0, 255);
	}

	public void render(Graphics g) throws Exception{
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);
		g.setColor(new Color(75, greenValue, 0));
		g.fillRect(15, 15, HEALTH * 2, 32);
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);
		
		g.drawString("Score: " + score, 10, 64);
		g.drawString("Level: " + level, 10, 80);
	}
}
