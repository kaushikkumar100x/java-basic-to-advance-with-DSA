// class class1 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// } 



// print pattern of * in java
// import java.util.Scanner;
// class class1{
//     public static void main(String[] args) {
//         System.out.println("* * * * *");
//         System.out.println("* * * * *");
//         System.out.println("* * * * *");
//         System.out.println("* * * * *");
//         System.out.println("* * * * *");
//         System.out.println("* * * * *");

//         return;
//     }
// }

// variable in java

// class variable{
//     public static void main(String[] args){
//         // initialze variable 
//         int a;
//          // declare variable 

//          a = 5;
//          System.out.print("value of a is :" + a);


//     }
// }


//data type in java

// class dataType{
//     public static void main(String[] args){
//         int a = 10 ; // integer data type
//         float b = 10.5f; // float data type
//         double c = 10.5; // double data type
//         char d = 'K'; // character data type
//         boolean e = true; // boolean data type
//         System.out.println("Integer: " + a);        
//         System.out.println("Float: " + b);
//         System.out.println("Double: " + c);
//         System.out.println("Character: " + d);
//         System.out.println("Boolean: " + e);
//     }
// }


// sum of a and b in java

// class sum{
//     public static void main(String[] args){
//         int a = 5;
//         int b = 10;
//         int sum = a + b;
//         System.out.print("Sum of a and b is :" + sum);

//     }
// }


// input in java

// import java.util.Scanner;

// class input{
//     public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter your name: ");
//         String name = sc.nextLine();
//      System.out.print("Welcome to "+name);

//     }
// }


// sum of a & b in java using input
// import java.util.Scanner;
// class suminput{
  
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number :-");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :-");
//         float b = sc.nextFloat();
//         float sum = a+b;
//         System.out.print("Sum of a and b is :-" + sum);
//     }
// }


// product of a nad b in java using input
// import java.util.Scanner;
// class productinput{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number :-");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :-");
//         float b = sc.nextFloat();
//         float product = a*b;
//         System.out.print("Product of a and b is :-" + product); 
//     }

// }


// Area of cricle in java using input
// import java.util.Scanner;
// class areaofcircle{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of circle :-");
//         float r = sc.nextFloat();
//         float area = 3.14f *r*r;
//         System.out.print("Area of circle is :-" + area);
//     }
// }



// practice time

// in a program, input 3 numbers: A,B and C you have to opoput the average of these 3 numbers


// import java.util.Scanner;
// class avarage{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number :-");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number :-");
//         float b = sc.nextFloat();
//         System.out.print("Enter the third number :-");
//         float c = sc.nextFloat();
//         float average = (a+b+c)/3;
//         System.out.print("result of average of a,b and c is :-" + average);


//     }
// }



// in a program input the side of a square. you have to output the area of the square.


// import java.util.Scanner;
// class areaofsquare{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the side of square :-");
//         float a = sc.nextFloat();
//         float area =  a*a;
//         System.out.println("Area of square is :-" + area);




//     }
// }


// Enter cost of 3 item from the user (using float data type) a pencil,a pen and an eraser. you have to output the total cost of the items back to the user as their bill.
//(add on : you have to add 18% gst tax to the total cost and output the final bill to the user.)
import java.util.Scanner;
class bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil :-");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen :-");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser :-");
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        float gst = totalCost * 0.18f;
        float finalBill = totalCost + gst;
        System.out.println("Total cost of items is :-" + totalCost);
        System.out.print("Final bill after adding 18% gst is :-" + finalBill);
    }
}