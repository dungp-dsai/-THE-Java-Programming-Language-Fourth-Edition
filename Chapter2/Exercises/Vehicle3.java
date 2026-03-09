public class Vehicle3 {
    public double current_speed;
    public double current_direction;
    public String ownwer_name;
    public int id;

    public static int next_id_number;

    public static void main(String[] args) {
        Vehicle3 v1 = new Vehicle3();
        v1.current_speed = 120.5;
        v1.current_direction = 211.0;
        v1.ownwer_name = "Daniel";
        v1.id = Vehicle3.next_id_number++;

        System.out.println("Vehicle 1");
        System.out.println("Current Speed: " + v1.current_speed);
        System.out.println("ID: " + v1.id);


        Vehicle3 v2 = new Vehicle3();
        v2.current_speed = 222.5;
        v2.current_direction = 234.0;
        v2.ownwer_name = "Daniel";
        v2.id = Vehicle3.next_id_number++;

        System.out.println("Vehicle 2");
        System.out.println("Current Speed: " + v2.current_speed);
        System.out.println("ID: " + v2.id);
    }
}