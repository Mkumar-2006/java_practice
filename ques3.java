            // Write a Java program to input and display your password.

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of privacy...\n");
        System.out.print("Enter Your Password : ");
        String Pass = input.nextLine();
        String origpass = "Mohit@1234";
        
        while(!Pass.equals(origpass)){
                System.out.println("Password is incorrect,You cannot access things now!");
                System.out.print("Enter your Password : ");
                Pass = input.nextLine();
        

        if(!Pass.equals(origpass)){
            System.out.println("Try again");
        }

        }
        
        System.out.println("Password is correct,you can access thing now.");
        input.close();
    }
}


