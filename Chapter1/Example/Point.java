class Point {
    double x, y;
    public static Point origin = new Point();
}

class PointMain{
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 20;
        p1.y = 11;
        System.out.println(p1);
        System.out.println("This is origin's x: " + p1.origin.x);
        System.out.println("This is origin's y: " + p1.origin.y);
    }
} 