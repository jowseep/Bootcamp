import java.util.Scanner;

public class carArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
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
            System.out.print("Enter car location: ");
            String carLocation = input.nextLine();
            System.out.print("\n");
            
            newCar[i] = new car(carOwner, carBrand, carModel, carYear, carLocation);
        }
        
        for(int i=0;i<numCar;i++) {
            newCar[i].travel();
        }

        System.out.print("Enter number of new cars: ");
        numCar = input.nextInt();
        input.nextLine();

        movingCar newMovingCar[] = new movingCar[numCar];

        for(int i=0;i<numCar;i++){

            System.out.print("\n");
            System.out.print("Enter car owner: ");
            String newCarOwner = input.nextLine();
            System.out.print("Enter car brand: ");
            String carBrand = input.nextLine();
            System.out.print("Enter car model: ");
            String carModel = input.nextLine();
            System.out.print("Enter car location: ");
            String carLocation = input.nextLine();
            System.out.print("Enter gas amount: ");
            double carGas = input.nextDouble();
            System.out.print("Enter distance: ");
            double carDistance = input.nextDouble();
            System.out.print("\n");
            
            newMovingCar[i] = new movingCar(newCarOwner,carBrand, carModel, carLocation, carGas, carDistance);
        }

        input.close();
    }
}
