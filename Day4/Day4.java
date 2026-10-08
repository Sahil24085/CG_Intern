///////////// 07/10/2026(wednesday)///////////////////////

// 1.Enter 3 numbers from the user & make a function to print their average
// import java.util.Scanner;

// public class Day4 {

   
//     static void average(int a, int b, int c) {
//         double avg = (a + b + c) / 3.0;
//         System.out.println("Average = " + avg);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         average(a, b, c);
//     }
// }


// 2. Write a function to print the sum of all odd numbers from 1 to n
// import java.util.*;

// public class Day4 {

//     static void oddSum(int n) {
//         int sum = 0;

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum = sum + i;
//             }
//         }

//         System.out.println("Sum = " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         oddSum(n);
//     }
// }


//3.Write a function which takes in 2 numbers and returns the greater of those two
// import java.util.*;

// public class Day4 {

//     static int greater(int a, int b) {
//         if (a > b)
//             return a;
//         else
//             return b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 2 numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("Greater = " + greater(a, b));
//     }
// }

//4.Write a function that takes in the radius as input and returns the circumference of a circle
// import java.util.*;

// public class Day4{

//     static double circumference(double r) {
//         return 2 * 3.14 * r;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter radius: ");
//         double r = sc.nextDouble();

//         System.out.println("Circumference = " + circumference(r));
//     }
// }


//5.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote

// import java.util.*;
// public class Day4{

//     static boolean eligible(int age) {
//         if (age >= 18)
//             return true;
//         else
//             return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         if (eligible(age))
//             System.out.println("Eligible to vote");
//         else
//             System.out.println("Not eligible to vote");
//     }
// }

//6. Write an infinite loop using do while conditions
// public class Day4 {
//     public static void main(String[] args) {

//         do {
//             System.out.println("Hello");
//         } while (true);

//     }
// }


//7.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.  
// import java.util.*;

// public class Day4{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int positive = 0;
//         int negative = 0;
//         int zero = 0;
//         char choice;

//         do {
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();

//             if (n > 0)
//                 positive++;
//             else if (n < 0)
//                 negative++;
//             else
//                 zero++;

//             System.out.print("Do you want to continue? (y/n): ");
//             choice = sc.next().charAt(0);

//         } while (choice == 'y' || choice == 'Y');

//         System.out.println("Positive numbers = " + positive);
//         System.out.println("Negative numbers = " + negative);
//         System.out.println("Zeros = " + zero);
//     }
// }


//8. Two numbers are entered by the user, X and N. Write a function to find 
// the value of one number raised to the power of another i.e. x power n

// import java.util.*;
// public class Day4{

//     static int pow(int x, int n){
//         int result=1;
//         for(int i=1;i<=n;i++){
//             result=result*x;
//         }return result;
//     }
//     public static void main(String[]args){
//         Scanner obj=new Scanner(System.in);
//         System.out.println("Enter the x: ");
//         int x=obj.nextInt();
//         System.out.println("Enter the n: ");
//         int n=obj.nextInt();

//         System.out.println("Answer= "+ pow(x, n));

//     }
// }



//9.Write a function that calculates the Greatest Common Divisor of 2 numbers.(BONUS) 
// import java.util.*;

// public class Day4{

//     static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 2 numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("GCD = " + gcd(a, b));
//     }
// }



