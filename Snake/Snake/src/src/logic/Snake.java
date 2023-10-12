package src.logic;

import javafx.scene.paint.Color;
import java.util.LinkedList;
import java.util.List;

public class Snake {
    // Color of the snake
    public static final Color COLOR = Color.BLUE;
    // Color of the head of the snake when it runs into itself
    public static final Color DEAD = Color.RED;
    private Grid grid;
    private int length;
    private boolean safe;
    private List<Point> points;
    private Point head;
    private int xVelocity;
    private int yVelocity;

    public Snake(Grid grid, Point initialPoint) {
        length = 1;
        points = new LinkedList<>();
        points.add(initialPoint);
        head = initialPoint;
        safe = true;
        this.grid = grid;
        xVelocity = 0;
        yVelocity = 0;
    }

    private void growTo(Point point) {
        length++;
        checkAndAdd(point);
    }

    private void shiftTo(Point point) {
        // The head of the snake moves to the new location
        checkAndAdd(point);
        // The last position is removed
        points.remove(0);
    }

    // Checks if the new point is safe
    private void checkAndAdd(Point point) {
        point = grid.wrap(point);
        safe &= !points.contains(point);
        points.add(point);
        head = point;
    }

    // The points occupied by the snake
    public List<Point> getPoints() {
        return points;
    }

    // Returns true if that snake hasn't run into itself yet
    public boolean isSafe() {
        return safe || length == 1;
    }

    // Retuens the location of the snake's head
    public Point getHead() {
        return head;
    }

    private boolean isStill() {
        return xVelocity == 0 & yVelocity == 0;
    }

    // Make the snake move one square in it's current direction
    public void move() {
        if (!isStill()) {
            shiftTo(head.translate(xVelocity, yVelocity));
        }
    }

    // Make the snake extend to the square where it's headed
    public void extend() {
        if (!isStill()) {
            growTo(head.translate(xVelocity, yVelocity));
        }
    }

    public void setUp() {
        if (yVelocity == 1 && length > 1) return;
        xVelocity = 0;
        yVelocity = -1;
    }

    public void setDown() {
        if (yVelocity == -1 && length > 1) return;
        xVelocity = 0;
        yVelocity = 1;
    }

    public void setLeft() {
        if (xVelocity == 1 && length > 1) return;
        xVelocity = -1;
        yVelocity = 0;
    }

    public void setRight() {
        if (xVelocity == -1 && length > 1) return;
        xVelocity = 1;
        yVelocity = 0;
    }
}