package src.gui;

import src.logic.Food;
import src.logic.Grid;
import src.logic.Point;
import src.logic.Snake;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static src.logic.Grid.SIZE;

public class Painter {


    public static void paint(Grid grid, GraphicsContext gc) {
        gc.setFill(Grid.COLOR);
        gc.fillRect(0, 0, grid.getWidth(), grid.getHeight());

        // Painter for the food
        gc.setFill(Food.COLOR);
        paintPoint(grid.getFood().getPoint(), gc);

        // Painter for the snake
        Snake snake = grid.getSnake();
        gc.setFill(Snake.COLOR);
        snake.getPoints().forEach(point -> paintPoint(point, gc));
        if (!snake.isSafe()) {
            gc.setFill(Snake.DEAD);
            paintPoint(snake.getHead(), gc);
        }

        // Painter for the Score
        gc.setFill(Color.WHITE);
        gc.fillText("Points : " + 1 * snake.getPoints().size(), 10, 490);
    }

    private static void paintPoint(Point point, GraphicsContext gc) {
        gc.fillRect(point.getX() * SIZE, point.getY() * SIZE, SIZE, SIZE);
    }
    // Display the reset message
    public static void paintResetMessage(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillText("Hit ENTER to reset.", 10, 20);
    }
}