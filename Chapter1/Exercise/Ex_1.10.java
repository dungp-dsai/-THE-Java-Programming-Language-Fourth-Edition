class FibItem {
    int value;
    boolean is_even;
}

class Ex_1_10 {
    final static int MAX_IDX = 9;
    private static FibItem[] fibo_list = new FibItem[MAX_IDX];
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        FibItem first_item = new FibItem();
        first_item.value = lo;
        first_item.is_even = false;
        fibo_list[0] = first_item;

        for(int i=2; i<=MAX_IDX; i++) {
            FibItem next_item = new FibItem();
            if(hi % 2 == 0)
                next_item.is_even = true;
            else 
                next_item.is_even = false;
            next_item.value = hi;
            fibo_list[i-1] = next_item;
            hi = lo + hi;
            lo = hi - lo;
        }

        for(int i=0; i<fibo_list.length; i++) {
            FibItem item = fibo_list[i];
            System.out.println((i+1) + ": " + item.value + " " + "is_even: " + item.is_even);
        }
    }
}