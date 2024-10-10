public class sum_print_recursion {

    static void add_series(int i ,  int sum) {

        if (i<1) {
            System.out.println(sum);
            return;
        }
            

            add_series(i-1, sum+i);

           

        

    }
    public static void main(String[] args) {
        add_series(4, 0);   
    }
}
