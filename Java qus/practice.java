

public class practice {

    







    //   *
    //   * *
    //   * * *
    //   * * * *
    //   * * * * *

    // static void star (int n) {
    //     for (int i=1; i<=n; i++) {
    //         for (int j=1; j<=i; j++) {
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n=5;
    //     star(n);
    // }








    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // static void reverse_star (int n) {

    //     for (int i=1; i<=n; i++) {
    //         for (int j=0; j<=n-i ; j++) {
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     reverse_star(5);
        

    // }

    







    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    // static void number_pattern (int n ) {
    //     for (int i=1; i<=n; i++) {
    //         for (int j=1; j<=i; j++) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {

    //     number_pattern(5);









    // }


    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5


    // static void similler_pattern (int n) {
    //     for (int i=1; i<=n; i++) {
    //         for (int j=1; j<=i; j++) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     similler_pattern(5);








    
    // }
            //      *
            //     * *
            //    * * *
            //   * * * *
            //  * * * * *
            //  * * * * *
            //   * * * *
            //    * * *
            //     * *
            //      *


    // static  void pyramid (int n) {
    //     for (int i=1 ; i<=n ; i++) {
    //         for (int j=1 ; j<=n-i ; j++) {
    //             System.out.print(" ");
    //         }
    //         for  (int j=1 ; j<=i; j++){
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println();
            
    //     }
    //     for (int i=n ; i>=1; i--) {
    //         for (int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j=1; j<=i; j++) {
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println();
    //     }
       
       
        
    // }


    // public static void main(String[] args) {
    //     pyramid(5);

        
    // }









    // static void number_copy (int n) {
    //     for (int i=1; i<=n; i++) {

    //         for (int j=1; j<=i; j++) {
    //             System.out.print(j + " ");
    //         }
    //         for (int j=1; j<=2*(n-i); j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j=i; j>=1; j--) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();

    //     }
    // }

    // public static void main(String[] args) {
    //     number_copy(5);

    // }
    




    //        A
    //        A B 
    //        A B C
    //        A B C D
    //        A B C D E



    // static  void alpha (int n) {
    //     for (int i=1; i<=n; i++) {
    //         for (char ch ='A'; ch<'A' + i; ch++) {
    //             System.out.print(ch + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     alpha(5);
    // }





    // A 
    // B B
    // C C C
    // D D D D
    // E E E E E
    // static void reverse_alpha (int n) {


    //     for (int i=0; i<n; i++) {
    //       for (int j=0; j<=i; j++) {
    //         System.out.print((char) ((int) ('A'+i)) + " " );
    //       }
    //         System.out.println();
    //     }

    // }

    // public static void main(String[] args) {
    //     reverse_alpha(5);
    // }




    // static  void triao (int n) {
    //     char ch ='A';
        
      
    //     for  (int i=0; i<=n; i++) {
    //         for  (int j=1; j<=n-i-1; j++) {
    //             System.out.print(" ");
    //         }
    //         int breakpoint = (2*i+1)/2; 
          
    //         for  (int j=1; j<=(2*i+1); j++) {
    //             System.out.print(ch);
    //             if (j<= breakpoint) {
    //                 ch++;

    //             }else {
    //                 ch--;
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     triao(5);

    // }



// * * * * * * 
// *         *
// *         *
// *         *
// *         *
// * * * * * *

//     static void hallow (int cols , int rows) {
//         for  (int i=1; i<=rows; i++) {
//             for (int j=1; j<=cols; j++) {
//                 if (i==1 || i==rows || j==1 || j==cols) {
//                     System.out.print("*" + " ");
//                 }else {
//                     System.out.print(" " + " ");
//                 }
                

//             }
//             System.out.println();

//         }
//     }

//     public static void main(String[] args) {
//         hallow(6, 6);


//     }





// 4 4 4 4 4 
// 4 3 3 3 4
// 4 3 3 3 4 
// 4 3 3 3 4
// 4 4 4 4 4



// static void number_hallow (int cols , int rows) {


//     for (int i=1; i<=rows; i++) {
//         for (int j=1 ; j<=cols ; j++) {
//             if (i==1 || i==rows || j==1 || j==cols) {
//                 System.out.print("4" + " ");
//             }else {
//                 System.out.print("3" + " ");
//             }

//         }
//         System.out.println();
//     }
// }
 
// public static void main(String[] args) {
//     number_hallow(5, 5);

// }


// *           *
// **         **
// ***       ***
// ****     ****
// *****   *****
// ****** ******
// ****** ******
// *****   *****
// ****     ****
// ***       ***
// **         **


// static void butterfly (int n) {
//     for (int i=0 ; i<=n; i++  ) {
//         for ( int j=0 ; j<=i; j++) {
//             System.out.print( "*");
//         }
//         for (int j=0; j<=2*(n-i); j++) {
//             System.out.print(" ");
//         }
//         for (int j=0 ; j<=i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();

//     }

//     for (int i=n; i>=1; i--){
//         for (int j=0; j<=i; j++) {
//             System.out.print("*");
//         }
//         for (int j=0 ;j<=2*(n-i); j++) {
//             System.out.print(" ");
//         }
//         for (int j=0; j<=i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();

//     }
// }



// public static void main(String[] args) {
//     butterfly(5);

    

// }



// public static void main(String[] args) {


//     int n =7789;
//     System.out.println(n);
   

//     while  (n>0) {
//         int lastdigit = n%10;
//         System.out.println(lastdigit);
//         n = n/10;
//         System.out.println(n);
//     }
// }



//  reverse a array of numbers 7789


public static void main(String[] args) {
    int n =7789;
    int reverse =0;


    while (n>0) {
        
        
       int   lastdigit = n%10;
          
       reverse = (reverse*10) + lastdigit;
       n =n/10;
         
       System.out.println(reverse);
        
    }
}

}
