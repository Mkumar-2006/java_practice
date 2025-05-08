//  Write a Java program to calculate the sum of two integers and return true 
//  if the sum is equal to a third integer.

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        System.out.print("Welcome to the world of Comparison of two number to the third.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter Second number : ");
        int b = input.nextInt();
        System.out.print("Enter Third number : ");
        int c = input.nextInt(); 
        compare1to3(a, b, c);
        input.close();

    }

    public static boolean compare1to3(int a, int b, int c){
        if( a + b == c){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
        return false;
    }
}
