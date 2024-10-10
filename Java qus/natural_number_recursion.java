public class natural_number_recursion {

   static  void number (int i , int n) {
    if (i<n)
    return;
    System.out.println(i);
    number(i-1, n);
   }
    public static void main(String[] args) {
        number(10, 1);
    }
    
}
