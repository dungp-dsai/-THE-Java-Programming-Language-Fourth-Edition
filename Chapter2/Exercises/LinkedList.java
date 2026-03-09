class Vehicle {
    public double current_speed;
    public double current_direction;
    public String ownwer_name;
    public int id;

    public static int next_id_number;
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

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        LinkedList n3 = new LinkedList(v3);
        LinkedList n2 = new LinkedList(v2, n3);
        LinkedList n1 = new LinkedList(v1, n2);
        

        System.err.println(n1.value);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;
    }
}
