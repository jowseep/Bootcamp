public class mainCar {
    
    public static void main(String[] args) {
        
        car newCar = new car("Joseph", "Bronco", "Ford", 2022, "Davao City");

        System.out.print("\n");

        System.out.println(newCar.getName()+ " is currently in " + newCar.getPlace() + ".");

        newCar.setPlace("Cebu City");

        System.out.print("\n");

        newCar.travel();

        System.out.println("\n");
    }
}
