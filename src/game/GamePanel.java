package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {


    // Some key variables
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    /**
    * Creates the basic game panel and launches 'startGame' method.
    *  */
    GamePanel() {

        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }

    /**
     * Starts the base game functions:
     * apples, 'running' boolean, and a timer.
     *  */
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    /**
     * Paints the panel and launches 'draw' method.
     *  */
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
    }

    /**
     * Draw objects on the panel:
     * Optional grid, apples
     *  */
    public void draw(Graphics graphics) {

        for (int i=0; i<SCREEN_HEIGHT/UNIT_SIZE; i++) {
            graphics.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            graphics.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
        graphics.setColor(Color.RED);
        graphics.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
    }

    /**
     * Creates new apples
     *  */
    public void newApple() {
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE) * UNIT_SIZE);
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE) * UNIT_SIZE);
    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics graphics) {

    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent event) {

        }
    }
}
