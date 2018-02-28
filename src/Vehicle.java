public class Vehicle {
    private String owner;
    private int year;
    private String model;

    public Vehicle(String owner, int year, String model){
        this.owner=owner;
        this.year=year;
        this.model=model;
    }

    @Override
    public String toString() {
        String str = "Owner: " + this.owner + "\nYear: " + this.year + "\nModel: " + this.model;
        return str;
    }
}
