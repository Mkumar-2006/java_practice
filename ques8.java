    // Write a Java program to convert seconds to hours, minutes and seconds.

    import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int totalSec = input.nextInt();
        int hours = totalSec / 3600;
        int remainingSec = totalSec % 3600;
        int minutes = remainingSec / 60;
        int seconds = remainingSec % 60;
        System.out.println("Time is: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        input.close();
    }
}

