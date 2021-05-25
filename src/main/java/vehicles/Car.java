package vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car extends Vehicle implements IDrive{

    private Tank tank;
    private FuelType fuelType;

    public Car(int price, String colour, Motor motor, String model, Tank tank, FuelType fuelType) {
        super(price, colour, motor, model);
        this.tank = tank;
        this.fuelType = fuelType;
    }

    public int getTankSize() {
        return tank.getTankSize();
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String drive() {
        return "Press accelerator";
    }
}
