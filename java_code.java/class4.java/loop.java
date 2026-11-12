// class loop{
//     public static void main(String args[]){
//         System.out.println("Loop start : -");
//         int a = 1;
//         while(a<10){
//             System.out.println(a);
//             a++;
//         }

//         System.out.print("loop finish");
//     }

// }

// print numbers from 1 to n

// import java.util.Scanner;
// class loop{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the last number of counting :-");
//         int a = sc.nextInt();
//         int i = 1;
//         while(i<=a){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// Sum of first N natural number

// import java.util.Scanner;
// class N_number{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :-");
//         int a = sc.nextInt();

//         int i = 1;
//         int sum = 0;
//         while(i<=a){
//             sum = sum+i;
//             System.out.println(sum);
//             i++;

//         }
//         System.out.println("Total Sum :-"+ sum);

//         sc.close();
//     }
// }


//for loop

// import java.util.Scanner;
// class for_loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last number :-");
//         int a = sc.nextInt();


//         for(int i=1; i<=a; i++){
//             System.out.println(i);

//         }
//         System.out.println("loop finish");

//     }
// }


// print Square pattern


// import java.util.Scanner;
// class Square{
//     public static void main(String args[]){
//         for(int i =1;i<=4; i++){
//             System.out.println("****");
//         }
//         System.out.println("Loop finish");
//     }
// }


///print reverse of a numbers
/// 

// import java.util.Scanner;
// import java.math.*;
// class reverse{
//     public static void main(String args[]){
//         int a = 4579;
//         int size = String.valueOf(a).length();
//         int sum = 0;

//         for(int i=1; i<=(size-1); i++){
//             int rem = a%10;
//             sum = (sum*10) + rem;
//             a = a/10;

            

//         }
//         System.out.println("Result :-"+sum);
//     }
// }



//reverse the given numbers

import java.util.Scanner;
import java.math.*;
class reverse_input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int a = sc.nextInt();
        int size = String.valueOf(a).length();
        int rev =0;


        for(int i=0; i<=size-1; i++){
            int rem = a % 10;
            rev = (rev*10)+rem;
            a = a/10;


        }
        System.out.println("Reverse number :-"+rev);
    }
}