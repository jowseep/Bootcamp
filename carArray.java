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
            System.out.print("Enter car location: ");
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

            newMovingCar[i] = new movingCar(newLocation, newCar[i].getName(), distance);
        }

        for(int i=0;i<numCar;i++) {
            System.out.print("\n");
            newMovingCar[i].travel();
        }
        
        /*System.out.print("\n");
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
            System.out.print("Enter location to travel to: ");
            String currentLocation = input.nextLine();
            //System.out.print("Enter location to travel to: ");
            //String newLocation = input.nextLine();
            System.out.print("Enter distance: ");
            double carDistance = input.nextDouble();
            System.out.print("\n");
            
            newMovingCar[i] = new movingCar(newCarOwner, carBrand, currentLocation, carDistance);
        }*/

        

        input.close();
    }
}
