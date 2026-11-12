// print the largest of 2 numbers


// import java.util.Scanner;
// class largest1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
       
//         System.out.print("Enter the first numbers :");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :");
//         float b = sc.nextFloat();


//         if(a>b){
//             System.out.println("The largest number is : " + a);
//         }
//         else{
//             System.out.println("The largest number is : " + b);
//         }
//     }
// }



// print if number is odd and even

// import java.util.Scanner;
// class odd_even{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int a = sc.nextInt();

//         if(a%2 == 0){
//             System.out.print("This numbers is Even" +" " + a);

//         }
//         else{
//             System.out.print("This number is odd"+ " "+ a);
//         }
//     }
// }



// income tax calculator

// import java.util.Scanner;
// class income_tax{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your income :");
//         float income = sc.nextFloat();

//         if(income<=250000){
//             System.out.println("No tax");
//             System.out.println("pay all amount enployer ");


//         }else if(income>250000 && income <= 500000){
//             System.out.println("Tax is 5% of income");
//             float tax = income *0.05f;
//             System.out.println("Tax amount is : " + tax);
//         }else if(income>500000 && income <= 1000000){
//             System.out.println("Tax is 20% of income");
//             float tax = income *0.2f;
//             System.out.println("Tax amount is : " + tax);
//         }else{
//             System.out.println("Tax is 30% of income");
//             float tax = income *0.3f;
//             System.out.println("Tax amount is : " + tax);
//         }
//     }
// }


// print the largest of 3 numbers

// import java.util.Scanner;
// class largest{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number :");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :");
//         float b = sc.nextFloat();
//         System.out.print("Enter the third number :");
//         float c = sc.nextFloat();

//         if(a>b && a>c){
//             System.out.println("the largest numbers is :" + " " + a);

//         }
//         else if(b>a && b>c){
//             System.out.println("the largest numbers is :" + " " + b);
//         }
//         else{
//             System.out.println("the largest numbers is :" + " " + c);
//         }
//     }
// }


// ternary operator

// import java.util.Scanner;
// class ternary{
//     public static void main(String[] args){


//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number ;");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :");
//         float b = sc.nextFloat();

//         float largest = (a>b)? a:b;
//         System.out.print("The largest number is : " + largest);
//     }
// }


// odd even using ternary operator

// import java.util.Scanner;
// class odd_even_ternary{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         float a = sc.nextFloat();
        

//         float result = (a%2 == 0)? a:0;
//      if(result == 0){
//         System.out.println("This number is odd : " + a);
//      }
//      else{
//         System.out.println("This number is even : " + a);
//      }
//     }
// }


// check if a student is pass or fail using ternary operator

// import java.util.Scanner;
// class pass_fail{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the marks :");
//         float marks = sc.nextFloat();

//         float result = (marks>=40)? marks:0;
//       if(result == 0){
//         System.out.println("This student is fail : " + marks);
//       }
//       else{
//         System.out.println("This student is pass : " + marks);
//       }

//     }
// }


// switch Statement

// import java.util.Scanner;
// class switch_statement{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the day number :");
//         int day = sc.nextInt();
//         switch(day){
            
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day number");
//         }
        
//     }
// }


// calculator


// import java.util.Scanner;
// class calculator{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number :");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :");
//         float b = sc.nextFloat();
//         System.out.print("Enter the operator (+,-,*,/):");
//         char operator = sc.next().charAt(0);

//         switch(operator){
//             case '+':
//                 System.out.println("The sum is : " + (a+b));
//                 break;
//             case '-':
//                 System.out.println("The difference is : " + (a-b));
//                 break;
//             case '*':
//                 System.out.println("The product is : " + (a*b));
//                 break;
//             case '/':
//                 if(b!=0){
//                     System.out.println("The quotient is : " + (a/b));
//                 }
//                 else{
//                     System.out.println("Division by zero is not allowed");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//         }
//     }
// }


// Write a java program to get a number from the user and print whether if is  positive or negative.


// import java.util.Scanner;
// class positive_negative{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the numbers ;");
//         float a = sc.nextFloat();
//         if(a>0){
//             System.out.print("its is postive number :" +" " +a);

//         }
//         else if(a<0){
//             System.out.print("its a negative number :" + " "+a);
//         }
//     }
// }


//  you have a fever if you temperature is above 100 and otherwise prints you don't have a fever.

// import java.util.Scanner;
// class fever{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the temperature :");
//         float a = sc.nextFloat();
//         if(a>100){
//             System.out.println("you have a fever :" + " "+ a);

//         }else{
//             System.out.print("You have not fever :"+ " "+ a);
//         }
//     }
// }



// write a java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;
class leap_year{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the years :");
    int a = sc.nextInt();
    if(a%400 == 0 || (a%4 == 0 && a%100 != 0)){
        System.out.println("its a leap year" + " "+ a);
    }else{
        System.out.print("its not a leap year"+ " "+ a);
    }
}
}