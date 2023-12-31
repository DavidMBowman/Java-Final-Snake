package src.logic;

public class Point {
    private final int x;    // The X coordinate
    private final int y;    // The Y coordinate

    Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    // Returns X coordinate
    public int getX() {
        return x;
    }

    // Returns Y coordinate
    public int getY() {
        return y;
    }

    // dx is change in x and dy is change in y
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point)) return false;
        Point point = (Point) other;
        return x == point.x & y == point.y;
    }

    public String toString() {
        return x + ", " + y;
    }
}