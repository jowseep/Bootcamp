public class car {

    private String name;
    private String model;
    private String brand;
    private int year;
    private String place;

    public car(String name, String model,String brand, int year, String place) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.place = place;
    }
    
    // constructor for movingCar    
    public car(String place, String name) {
        this.place = place;
        this.name = name;
    }

    public void travel() {
        System.out.println(name + " is currently in " + place + " with his "+ year + " " + model + " " + brand + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    
}
