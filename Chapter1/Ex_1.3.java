class Ex_1_3 {
    public static void main(String[] args) {
        int exponent = 2;
        int base = 1;
        while(base < 10) {
            int result = 1;
            int count = 0;
            while(count < exponent) {
                result *= base;
                count++;
            }
            System.out.println(result);
            base++;
        }
    }
}