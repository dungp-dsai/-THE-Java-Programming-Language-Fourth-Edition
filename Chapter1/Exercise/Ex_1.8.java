class Point {
    double x, y;
    public void set_new_coordinates(Point that) {
        this.x = that.x;
        this.y = that.y;
    }
}

class Ex_1_8 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 10;
        p1.y = 20;

        p2.x = 30;
        p2.y = 40;

        System.out.println("Before set new coordinates");
        System.out.println("p1'x: " + p1.x);
        System.out.println("p1'y: " + p1.y);

        p1.set_new_coordinates(p2);

        System.out.println("After set new coordinates");
        System.out.println("p1'x: " + p1.x);
        System.out.println("p1'y: " + p1.y);

    }
}