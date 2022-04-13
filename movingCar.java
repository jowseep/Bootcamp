public class movingCar extends car {
    
    double gas;
    double distance;

    public movingCar(String name,String brand, String model, String place, double gas, double distance){
        super(name,brand, model, place);
        this.gas = gas;
        this.distance = distance;
    }
}
