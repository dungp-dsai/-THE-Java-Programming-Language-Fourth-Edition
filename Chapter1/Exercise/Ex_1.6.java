class Ex_1_6 {
    final static String program_title = "This is fibonacy program";
    final static int MAX = 50;
    public static void main(String[] args) {
        int low = 1;
        int high = 2;
        System.out.println(program_title);
        System.out.println(low);
        while(high < MAX) {
            System.out.println(high);
            high += low;
            low = high - low;
        }
    }
}