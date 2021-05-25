package vehicles;

public class ElectricCar extends Vehicle implements IDrive{

    private Battery battery;

    public ElectricCar(int price, String colour, Motor motor, String model, Battery battery) {
        super(price, colour, motor, model);
        this.battery = battery;
    }

    public String drive() {
        return "Press accelerator";
    }
}
