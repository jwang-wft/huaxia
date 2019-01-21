package org.huaxia.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 515207149561806841L;
	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH / 12 * 9;
	private Thread thread;
	private boolean running = false;
	private Handler handler;
	private Random r = new Random();
	private HUD hud;
	private Spawn spawner;

	public Game() {
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));
		hud = new HUD();

		new Window(WIDTH, HEIGHT, "梓琦游戏", this);
		handler.addObject(new Player(WIDTH / 2 - 32, HEIGHT / 2 - 32, ID.Player, handler));
		for (int i = 0; i < 5; i++)
			handler.addObject(new BasicEnemy(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.BasicEnemy, handler));
	}

	public static void main(String[] args) {
		new Game();
	}

	public void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running) {
				try {
					render();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			frames++;
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				// System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
		for (int i = 0; i < handler.object.size(); i++) {
			handler.object.get(i).setVelX(0);
			handler.object.get(i).setVelY(0);
		}
	}

	private void tick() {
		handler.tick();
		hud.tick();
	}

	private void render() throws Exception {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		handler.render(g);
		hud.render(g);
		g.dispose();
		bs.show();
	}

	public static int clamp(int var, int min, int max) {
		if (var >= max)
			return var = max;
		else if (var <= min)
			return var = min;
		else
			return var;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

}
