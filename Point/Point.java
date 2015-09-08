package Point;

public class Point {
    final int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Boolean isEqualTo(Point p2) {
        return this.x == p2.x && this.y == p2.y;
    }

    public Double distanceTo(Point p2) {
        return Math.sqrt((Math.pow(this.x - p2.x, 2))
                + Math.pow(this.y - p2.y, 2));
    }

    public Point move(Integer x, Integer y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point moveToXY(Integer x, Integer y) {
        return new Point(x, y);
    }

    public String toString() {
        return String.format("(%d,%d)", this.x, this.y);
    }
}
