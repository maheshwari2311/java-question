public class hallow_pattern {



    static void recct (int rows ,int cols){
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=cols; j++) {
                if (i==1 || i==rows || j==1 || j==cols) {
                    System.out.print("4" + " ");
                }else {
                    System.out.print("3" + " ");
                }

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        recct(6, 6);
        
    }
    
}
