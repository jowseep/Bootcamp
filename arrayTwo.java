import java.util.Scanner;

public class arrayTwo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        int[] age = new int[5]; 

        for(int j=0;j<names.length;j++) {
            System.out.print("Enter a name: ");
            names[j] = input.nextLine();
            System.out.print("Enter the age: ");
            age[j] = input.nextInt();
            input.nextLine();
        }

        System.out.println("\n");
        
        for(int i=0;i<names.length;i++) {
            System.out.println("My name is " + names[i] + " and I am " + age[i] + " years old");
        }


        input.close();
    }
    
}
