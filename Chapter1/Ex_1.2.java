class Ex_1_2 {
    public static void main(String[] args) {
        int low = 1, high = 1;
        System.out.println("This is the Fibo program");
        System.out.println(low);
        while(high < 50) {
            System.out.println(high);
            high = low + high;
            low = high - low;
        }
    }
}