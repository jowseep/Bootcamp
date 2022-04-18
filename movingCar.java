public class movingCar extends car {
    
    private double gas = 10d;
    private double distance;

    /*public movingCar(String name,String brand, String place, double distance){
        super(name, brand, place);
        this.distance = distance;
    }*/

    public movingCar(String place, String name, double distance) {
        super(place, name);
        this.distance = distance;
    }

    /*public movingCar(String name) {
        super(name);
    }*/

    public void travel() {
        System.out.println(getName() + " wants to travel to " + getPlace() + " and the distance is " + getDistance());
        System.out.println("If " + getName() + " arrives to the location, the remaining gas should be " + calculateGas(distance));
    }

    public double calculateGas(double distance) {
        gas -= (distance / 15.5);
        return gas;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


}
