import java.util.Scanner;

public class basicLoops {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        /* System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();
        System.out.print("Enter the number of steps: ");
        int steps = input.nextInt();
         
        if((steps==0) || (steps>upperLimit)) {
            System.out.println("Please enter step from 1 upwards or make sure the number of steps won't exceed the upper limit");
        } else {
            for(int i=steps;i<=upperLimit;i+=steps) {
                System.out.println("Number: " + i);
            }
        } */

    
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age<=0) {
            System.out.println("Please enter valid age");
        } else {
            if(age<18) {
                System.out.println("You are a minor. Don't rush everything.");
            } else if((age>=18) && (age<60)) {
                System.out.println("You are an adult. Be responsible");
            } else if((age>=60) && (age<=130)) {
                System.out.println("You are a senior. It's not too late to start anew.");
            } else {
                System.out.println("Damn. We got a vampire in the house!");
            }
        }

        input.close();

        // < 18 minor
        // > 18 || < 60 adult
        // > 60 senior
    }
}
