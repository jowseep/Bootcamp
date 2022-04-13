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
            System.out.println(place(i+1) + " name" + " is " + names[i]);
        }

        input.close();
    }

    public static String place(int i) {
        String placeNum = "Not valid, hoe.";

        switch(i) {
            case 1:
            placeNum = "First";
            break;
            case 2:
            placeNum = "Second";
            break;
            case 3:
            placeNum = "Third";
            break;
            case 4:
            placeNum = "Fourth";
            break;
            case 5:
            placeNum = "Fifth";
            break;
            default:
        }
        return placeNum;
    }

}
