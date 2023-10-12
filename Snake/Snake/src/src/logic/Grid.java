package src.logic;

import javafx.scene.paint.Color;
import java.util.Random;

public class Grid {
    // The length of the sides of each point in the grid.
    public static final int SIZE = 20;
    // Color of the background
    public static final Color COLOR = new Color(0, 0, 0, 1);

    // The number of columns
    private final int cols;
    // The number of rows
    private final int rows;

    private Snake snake;
    private Food food;

    public Grid(final double width, final double height) {
        rows = (int) width / SIZE;
        cols = (int) height / SIZE;

        // Starts the snake in the middle of the screen
        snake = new Snake(this, new Point(rows / 2, cols / 2));

        // Spawns food in random location
        food = new Food(getRandomPoint());
    }

    public Point wrap(Point point) {
        int x = point.getX();
        int y = point.getY();
        if (x >= rows) x = 0;
        if (y >= cols) y = 0;
        if (x < 0) x = rows - 1;
        if (y < 0) y = cols - 1;
        return new Point(x, y);
    }

    private Point getRandomPoint() {
        Random random = new Random();
        Point point;
        do {
            point = new Point(random.nextInt(rows), random.nextInt(cols));
        } while (point.equals(snake.getHead()));
        return point;
    }

    public void update() {
        if (food.getPoint().equals(snake.getHead())) {
            snake.extend();
            food.setPoint(getRandomPoint());
        } else {
            snake.move();
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public double getWidth() {
        return rows * SIZE;
    }

    public double getHeight() {
        return cols * SIZE;
    }

    public Snake getSnake() {
        return snake;
    }

    public Food getFood() {
        return food;
    }
}