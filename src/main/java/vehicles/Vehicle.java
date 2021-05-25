package vehicles;

public abstract class Vehicle {

    private int price;
    private String colour;
    private Motor motor;
    private String model;

    public Vehicle(int price, String colour, Motor motor, String model) {
        this.price = price;
        this.colour = colour;
        this.motor = motor;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public double getMotor() {
        return motor.getMotorSize();
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String startEngine(){
        return "Engine started";
    }
}
