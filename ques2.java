        // Write a Java program to count letters, spaces, numbers and other characters in an input string.

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter anything you want to write : ");
        String cam = input.nextLine();

        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int others = 0;

        for(int i=0;i<cam.length();i++){
            char ch = cam.charAt(i);

        if(Character.isLetter(ch)){
            letters++;
        }
        else if(Character.isDigit(ch)){
            digits++;
        }
        else if(Character.isWhitespace(ch)){
            spaces++;
        }
        else{
            others++;
        }

        }
        System.out.println("Letters are : " + letters);
        System.out.println("digits are : " + digits);
        System.out.println("Spaces are : " + spaces);
        System.out.println("others are : " + others);
    
        input.close();
    

    }
}
