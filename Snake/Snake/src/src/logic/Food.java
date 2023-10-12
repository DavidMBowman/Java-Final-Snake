package src.logic;

import javafx.scene.paint.Color;

public class Food {
    // Color of the snake's food
    public static final Color COLOR = Color.RED;

    private Point point;

    Food(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
