import java.util.Scanner;

public class secondProgram {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("\n");
        System.out.print("Enter first integer number: ");
        int firstInt = input.nextInt();
        System.out.print("Enter second integer number: ");
        int secondInt = input.nextInt();

        System.out.print("Enter first double number: ");
        double firstDouble = input.nextDouble();
        System.out.print("Enter second double number: ");
        double secondDouble = input.nextDouble();

        System.out.print("Enter first float number: ");
        float firstFloat = input.nextFloat();
        System.out.print("Enter second float number: ");
        float secondFloat = input.nextFloat();

        int totalInt = firstInt + secondInt;
        double totalDouble = firstDouble + secondDouble;
        float totalFloat = firstFloat + secondFloat;

        System.out.println("\n");
        System.out.println("The total of two integer numbers is " + totalInt);
        System.out.println("The total of two double numbers is " + totalDouble);
        System.out.println("The total of two float numbers is " + totalFloat);
        System.out.println("\n");
        
        input.close();
    
    }
}