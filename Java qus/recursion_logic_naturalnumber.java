public class recursion_logic_naturalnumber {

    static void logic_num(int i  , int n) {
        if (i>n)
        return;

        logic_num(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        logic_num(1, 4);
    }
    
}
