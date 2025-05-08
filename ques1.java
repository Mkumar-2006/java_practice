            //Ques1 -  Write a Java program to reverse a string.

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of reverse....\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Write anything in words : ");
        char[] str1 = input.nextLine().toCharArray();
        String rev = revstr(new String(str1));
        System.out.print("Reversed word is : " + rev);
        input.close();;
    }

    public static String revstr(String str1){
        String reversed = "";
        for(int i = str1.length()-1; i>=0; i--){
             reversed = reversed + str1.charAt(i);
        }
        return reversed;
    }


}

    //  charAt(i) - It returns the character at the specified index i in a string.
    // toCharArray() - Converts the String into an array of characters (char[]).
    // "hello".toCharArray() results in: ['h', 'e', 'l', 'l', 'o']