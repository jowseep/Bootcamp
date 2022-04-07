import java.util.Scanner;

public class basicArray {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        for(int j=0;j<names.length;j++) {
            System.out.print("Enter a name: ");
            names[j] = input.nextLine();
        }

        System.out.println("\n");
        
        for(int i=0;i<names.length;i++) {
            System.out.println("Name " + (i+1) + " is " + names[i]);
        }

        input.close();
    }

}
