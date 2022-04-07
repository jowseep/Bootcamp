public class firstProgram {

    public static void main (String[] args) {

        /* String s = "Hello world";
        System.out.print(s);*/

        // first set of numbers
        int firstInt = 3;
        double firstDouble = 3.13;
        float firstFloat = 3.00f;

        // second set of numbers
        int secondInt = 4;
        double secondDouble = 4.14;
        float secondFloat = 4.00f;

        // total of int, double, float
        int totalInt = firstInt + secondInt;
        double totalDouble = firstDouble + secondDouble;
        float totalFloat = firstFloat + secondFloat;

        // printing out the total of each data type
        System.out.println("Total Integer: " + totalInt);
        System.out.println("Total Double: " + totalDouble);
        System.out.println("Total Float: " + totalFloat);
      
    }
}