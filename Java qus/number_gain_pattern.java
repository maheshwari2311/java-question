public class number_gain_pattern {



    static void  number (int n){
        int numb =1; 
       
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                
              System.out.print(numb+ " ");
              numb = numb+1;
            

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n=5;

        number(n);
    }
}
