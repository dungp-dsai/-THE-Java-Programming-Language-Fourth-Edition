class Vehicle4 {
    public double current_speed;
    public double current_direction;
    public int id;
    public String owner_name;

    public static int next_id_number;

    Vehicle4() {
        id = next_id_number++;
    }

    Vehicle4(String inital_owner_name) {
        this();
        owner_name = inital_owner_name;
    }

    public static void main(String[] args) {
        Vehicle4 v1 = new Vehicle4("Daniel");
        Vehicle4 v2 = new Vehicle4();

        System.out.println("Vehicle 1");
        System.out.println("Owner name: " + v1.owner_name);
        System.out.println("ID: " + v1.id);
        System.out.println("================");
        System.out.println("Vehicle 2");
            System.out.println("Owner name: " + v2.owner_name);
        System.out.println("ID: " + v2.id);
    }
}