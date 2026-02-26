class Ex_1_9 {
    final static int MAX_NUM = 9;
    private  static int[] fibo_list = new int[MAX_NUM];
    public static void main(String[] args) {
        int low = 1;
        int high = 1;
        fibo_list[0] = low;
        for(int i=2; i<=MAX_NUM; i++) {
            fibo_list[i-1] = high;
            high += low;
            low = high - low;
        }
        
        for(int i=0; i<fibo_list.length; i++) {
            System.out.println((i+1) + ": " + fibo_list[i]);
        }
    }
}