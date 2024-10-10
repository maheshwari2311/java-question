public class number_pattern {

    public static void main(String[] args) {
        int n =5;
       int start;


        for (int i=1; i<=n; i++) {
            if (i%2==0) {
               System.out.print(start  =1);
                
            }else {
             System.out.print(start = 0);
            }


            for (int j=1 ; j<=i; j++) {
               
                start = 1-start;
                System.out.print(start);
            }
            System.out.println();
        }
    }
    
}
