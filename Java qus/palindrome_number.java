

import java.util.Scanner;

public class palindrome_number {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
    
    //     Scanner sc = new Scanner (System.in);

    //      int n = sc.nextInt();

    //      int reversenum = 0;


    //      int dup =n;
    //        while (n>0){
    //         int lastdigit = n%10;
    //         reversenum = (reversenum*10)+lastdigit;
    //         n=n/10;
    //         if (dup== reversenum) {
    //             System.out.println("it is a palindrome  number");
    //         }else {
    //             System.out.println("it is a not palindrome number");
    //         }
    //        }
    // }

    @SuppressWarnings("resource")
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b= sc.nextInt();

    int swap = a;
     a =b;
     b = swap;
     System.out.println("The value of a =  " + a);
     System.out.println("The value of b =" + b);

    }
    
}
