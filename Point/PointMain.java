package Point;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        if (p1.isEqualTo(p2)) {
            System.out.println("The two points are equal");
        }

        double dist = p1.distanceTo(p2);
        System.out.println("Point Distance: "+dist);

        System.out.println(p2.move(5, -2));

        System.out.println(p1.moveToXY(8,2));
        System.out.println(p1);
    }
}
