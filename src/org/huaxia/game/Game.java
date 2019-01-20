package org.huaxia.game;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	private static final int WIDTH = 640;
	private static final int HEIGHT = WIDTH / 12 * 9;

	public Game() {
		new Window(WIDTH, HEIGHT, "My Game", this);

	}

	public static void main(String[] args) {
		new Game();
	}

	public void start() {
		// TODO Auto-generated method stub

	}

	public void run() {

	}

}
