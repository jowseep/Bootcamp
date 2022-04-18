import java.util.Scanner;

public class carArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter number of cars: ");
        int numCar = input.nextInt();
        input.nextLine();

        car newCar[] = new car[numCar];

        for(int i=0;i<numCar;i++){

            System.out.print("\n");
            System.out.print("Enter car owner: ");
            String carOwner = input.nextLine();
            System.out.print("Enter car brand: ");
            String carBrand = input.nextLine();
            System.out.print("Enter car model: ");
            String carModel = input.nextLine();
            System.out.print("Enter car year: ");
            int carYear = input.nextInt();
            input.nextLine();
            System.out.print("Enter current location: ");
            String carLocation = input.nextLine();
            System.out.print("\n");
            
            newCar[i] = new car(carOwner, carBrand, carModel, carYear, carLocation);
        }

        for(int i=0;i<numCar;i++) {
            newCar[i].travel();
        }
        
        movingCar newMovingCar[] = new movingCar[numCar];

        for(int i=0;i<numCar;i++) {
        
            System.out.print("\n");
            System.out.print("Enter the travel destination of " + newCar[i].getName() + "'s car: ");
            String newLocation = input.nextLine();
            System.out.print("Enter distance: ");
            double distance = input.nextDouble();
            input.nextLine();

            if(distance>155) {
                System.out.println("No enough gas for that distance.");
                System.exit(0);
            } else {
                newMovingCar[i] = new movingCar(newLocation, newCar[i].getName(), distance);
            }
        }

        for(int i=0;i<numCar;i++) {
            System.out.print("\n");
            newMovingCar[i].travel();
        }

        System.out.print("\n");

        System.out.print("Enter new name: ");
        String newFordName = input.nextLine();
        System.out.print("Enter new car model: ");
        String newFordModel = input.nextLine();
        System.out.print("Enter car brand: ");
        String newFordBrand = input.nextLine();
        System.out.print("Enter car year: ");
        int newFordYear = input.nextInt();
        input.nextLine();
        System.out.print("Enter current location: ");
        String newFordLocation = input.nextLine();
        System.out.print("Enter new gas consumption: ");
        double newFordGas = input.nextDouble();
        input.nextLine();
        System.out.print("Enter new card sound: ");
        String newFordSound = input.nextLine();

        fordCar newFordCar = new fordCar(newFordName, newFordModel, newFordBrand, newFordYear, newFordLocation, newFordGas, newFordSound);
        
        newFordCar.travel();

        System.out.print("\n");
        
        input.close();

        fordCar[] anotherNewFordCar = new fordCar[2];

        for(int i=0;i<anotherNewFordCar.length;i++) {

            System.out.print("Enter new name: ");
            String anotherNewFordName = input.nextLine();
            System.out.print("Enter new car model: ");
            String anotherNewFordModel = input.nextLine();
            System.out.print("Enter car brand: ");
            String anotherNewFordBrand = input.nextLine();
            System.out.print("Enter car year: ");
            int anotherNewFordYear = input.nextInt();
            input.nextLine();
            System.out.print("Enter current location: ");
            String anotherNewFordLocation = input.nextLine();
            System.out.print("Enter new gas consumption: ");
            double anotherNewFordGas = input.nextDouble();
            input.nextLine();
            System.out.print("Enter new card sound: ");
            String anotherNewFordSound = input.nextLine();

            anotherNewFordCar[i] = new fordCar(anotherNewFordName, anotherNewFordModel, anotherNewFordBrand, anotherNewFordYear, anotherNewFordLocation, anotherNewFordGas, anotherNewFordSound);
        }

        System.out.print("\n");

        for(int i=0;i<anotherNewFordCar.length;i++) {
            anotherNewFordCar[i].travel();
        }
        
        System.out.print("\n");
    }
}
