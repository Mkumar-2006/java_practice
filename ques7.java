// Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. 
// If "abc" is true, the second number does not need to be larger than the first number.

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        System.out.println("Comparing three numbers with the help of boolean");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second number : ");
        int second = input.nextInt();
        System.out.print("Enter the Third number : ");
        int third = input.nextInt();
        System.out.print("Enter(True/False) : ");
        boolean abc = input.nextBoolean();
        boolean result = comparison( first,second,third, abc);
        System.out.println("The result is : " + result);
        input.close();
    }

        public static boolean comparison(int a ,int b, int c, boolean abc){
            if(abc){
            return c > b;
        }
        else{
            return c>b && b>a; 
    }
        }
    }

