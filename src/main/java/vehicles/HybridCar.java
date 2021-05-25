package vehicles;

public class HybridCar extends Vehicle implements IDrive{

    private Battery battery;
    private Tank tank;
    private FuelType fuelType;

    public HybridCar(int price, String colour, Motor motor, String model, FuelType fuelType, Battery battery, Tank tank) {
        super(price, colour, motor, model);
        this.fuelType = fuelType;
        this.battery = battery;
        this.tank = tank;
    }

    public String drive() {
        return "Press accelerator";
    }

}
