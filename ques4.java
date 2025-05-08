    // Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.


public class ques4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Divisible of numbers..\n");
        System.out.println("Divisible by 3 between 1 to 100  ");
        for(int i=1;i<100;i++){
            if(i%3==0)
                System.out.print(i + " ");
            
        }
        System.out.println("\n\nDivisible by 5 between 1 to 100 ");
        for(int i=1;i<100;i++){
            if(i % 5 == 0)
            System.out.print(i + " ");
        
    }
        System.out.println("\n\nDivisible by 3 & 5 between 1 to 100 ");
        for(int i=1;i<100;i++){
            if(i % 3 == 0 && i % 5 == 0)
            System.out.print(i + " ");
        }
    }

}
