public class Name_recursion_print {



    static  void  name(int i , int n) {
        if  (i> n) 
        return;

        System.out.println("kunal");

        name(i +1, n);
    }

    public static void main(String[] args) {
        name(0, 3);
    }
    
}
