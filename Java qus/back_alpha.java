


public class back_alpha {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<=n; i++) {
            for (char ch = (char) (int ) ('A'+ n-i-1) ; ch <= (char)(int) ('A'+n-1); ch++) {
                System.out.print( ch + " ");
            }
            System.out.println();
        }
    }
}
