class Ex_1_7 {
    final static int MAX_IDX = 9;
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        String mark;
        System.out.println(MAX_IDX + ": " + lo);
        for(int i=MAX_IDX-1; i>=1; i--) {
            if(hi % 2 == 0)
                mark = "*";
            else 
                mark = "";
            System.out.println(i + ": " + hi + mark);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
