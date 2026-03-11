public class Vehicle6 {
    public double current_speed;
    public double current_direction;
    public String owner_name;
    public int id;

    public static int next_id_number;

    Vehicle6() {
        id = next_id_number++;
    }

    Vehicle6(String ownwer_name) {
        this();
        this.owner_name = ownwer_name;
    }

    public static int get_max_id() {
        return next_id_number-1;
    }

    public String toString() {
        if(owner_name == null) {
            owner_name = "Missing Onwer Name";
        }
        String desc = id + "(" + owner_name + ")" ;
        return desc;
    }

    public static void main(String[] args) {
        Vehicle6 v1 = new Vehicle6("Daniel");
        Vehicle6 v2 = new Vehicle6();
        System.out.println("Vehicle " + v1);
        System.out.println("Vehicle " + v2);
    }
}   
