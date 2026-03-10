public class Vehicle5 {
    public double current_speed;
    public double current_direction;
    public String owner_name;
    public int id;

    public static int next_id_number;

    Vehicle5() {
        id = next_id_number++;
    }

    Vehicle5(String owner_name) {
        this();
        this.owner_name = owner_name;
    }

    public static int return_max_id() {
        return (next_id_number - 1);
    }

    public static void main(String[] args) {
        Vehicle5 v1 = new Vehicle5("Daniel");
        Vehicle5 v2 = new Vehicle5("Dung");
        Vehicle5 v3 = new Vehicle5("Queen");

        System.out.println("V1's ID: " + v1.id);
        System.out.println("V2's ID: " + v2.id);
        System.out.println("V3's ID: " + v3.id);

        System.out.println("Max ID: " + Vehicle5.return_max_id());
    }
}
