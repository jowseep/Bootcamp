public class fordCar extends car{
    
    double gasConsumption;
    String carSound;

    public fordCar(String name, String model,String brand, int year, String place, double gasConsumption, String carSound) {
        super(name, model, brand, year, place);
        this.gasConsumption = gasConsumption;
        this.carSound = carSound;
    }

    public void travel() {
        System.out.println(getName() + " is currently in " + getPlace() + " with his " + getBrand() + " " + getModel() + " " + getYear() + ".");
        System.out.println("Its noise is " + carSound + " " + " and it's gas consumption is " + gasConsumption);
    }
}
