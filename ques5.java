        // Write a Java program to convert a string to an integer.

import java.util.Scanner;

public class ques5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number as a string : ");
    String str = input.nextLine();
    int num = Integer.parseInt(str);
    System.out.print("Converted it to an integer : " + num);
    input.close();
  }  
}
// Converting integer to String
// int num = 123;
// String str = Integer.toString(num);