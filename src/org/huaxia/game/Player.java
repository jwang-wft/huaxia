package org.huaxia.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	Random r = new Random();

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		x = Game.clamp(x, 0, Game.WIDTH - 32);
		y = Game.clamp(y, 0, Game.HEIGHT - 60);
	}

	@Override
	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.green);
		g2d.draw(getBounds());
//		if (id == ID.Player) {
//			g.setColor(Color.white);
//		} else {
//			g.setColor(Color.blue);
//		}
//		g.fillRect(x, y, 32, 32);
	}

}
