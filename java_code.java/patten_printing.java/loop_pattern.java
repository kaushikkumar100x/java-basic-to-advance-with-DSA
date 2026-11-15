// inverted start pattern

// import java.util.Scanner;
// class inverted{
//     public static void main(String args[]){
//         int n = 4;
//         for(int out = 1; out <=n; out++){

//             for(int inner = 1; inner <= out; inner++){
//                 System.out.print("*");
                 
//             }
//             System.out.println( " ");
//         }
//     }
// }


// inverted triangle

// import java.util.Scanner;
// class inverted_trainagle{
//     public static void main(String args[]){
//         int n = 4;
//         for(int out = 1; out<=n; out++){
//             for(int inner = 1; inner <= (n-out+1); inner++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//     }
// }

// half pyramid pattern

// import java.util.Scanner;
// class pyramid{
//     public static void main(String args[]){
//         int n = 4;
//         for(int out =1; out<=n;out++){
//             for(int inner = 1; inner <= out; inner++){
//                 System.out.print(inner);
//             }
//             System.out.println();
//         }
//     }
// }

// character pattern

// import java.util.Scanner;
// class charater{
//     public static void main(String args[]){
//         int n=4;
//         char ch = 'A';
//          for(int out=1; out<=n; out++){
//             for(int inner=1; inner<=out; inner++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//          }
//     }
// }

//hollow rectangle 

// import java.util.Scanner;
// class hollew_rectangle{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int row, col;
//         System.out.print("Enter the row :-");
//         row = sc.nextInt();
//         System.out.print("Enter the col :-");
//         col = sc.nextInt();

//         for(int out=1; out<=row; out++){
//             for(int inner =1; inner<=col; inner++){
//                 if(out == 1 || out == row || inner == 1 || inner == col){
//                     System.out.print("* ");
//                 }
//                 System.out.print(" ");
//             }System.out.println();
//         }
        
        
//     }
// }



// inverted & Rotated half pyramid


// import java.util.Scanner;
// class inverted_pyramid{
//     public static void main(String args[]){
//         int n = 4;

//         for(int out=1; out<=n; out++){
//             for(int inner=1; inner<=n-out; inner++){
//                 System.out.print(" ");
//             }
//             for(int inner1=1; inner1<=out; inner1++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// } 

// inerted half pyramid with number patter


// import java.util.Scanner;
// class number_inverted_pyramid{
//     public static void main(String args[]){
//         int n = 5;
//         for(int out=1; out<=n;out++){
//             for(int inner=1;inner<= (n-out+1);inner++){
//                 System.out.print(inner);
//             }
//             System.out.println();
//         }
//     }
// }
 

// import java.util.Scanner;
// class floyd_triangle{
//     public static void main(String args[]){
//         int n = 5;
//         int l = 1;
//         for(int out=1; out<=n; out++){
//             for(int inner=1; inner<=out; inner++){
//                 System.out.print(l +" ");
//                 l++;
//             }
//             System.out.println();
//         } 
//     }
// }

// 0-1 triangle pattern

import java.util.Scanner;
class binary_triangle{
    public static void main(String args[]){
        int n = 5;
        for(int out=1; out<=n; out++){
            for(int inner=1; inner<=out; inner++){
                System.out.print(Integer.toBinaryString(inner));
            }
            System.out.println();
        }
    }
}