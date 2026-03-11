class Vehicle {
    public double current_speed;
    public double current_direction;
    public String ownwer_name;
    public int id;

    public static int next_id_number;

    Vehicle() {
        id = next_id_number++;
    }

    Vehicle(String owner_name) {
        this();
        this.ownwer_name = owner_name;
    }

    public String toString() {
        String desc;
        desc = "(" + ownwer_name + ")";
        return desc;
    }
}


public class LinkedList {
    public Object value;
    public LinkedList next;

    LinkedList(Object value) {
        this.value = value;
        this.next = null;
    }

    LinkedList(Object value, LinkedList next) {
        this.value = value;
        this.next = next;
    }

    public String toString() {
        String desc;
        if(next == null) {
            desc = "Current value: " + value + " point to: " + "Null";
        } else {
            desc = "Current value: " + value + " point to: " + next.value;
        }
        return desc;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Daniel");
        Vehicle v2 = new Vehicle("Queen");
        Vehicle v3 = new Vehicle("Haha");

        LinkedList n3 = new LinkedList(v3);
        LinkedList n2 = new LinkedList(v2, n3);
        LinkedList n1 = new LinkedList(v1, n2);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
