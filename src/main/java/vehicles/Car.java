package vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car extends Vehicle{

    private int tankSize;
    private FuelType fuelType;

    public Car(int price, String colour, Motor motor, String model, int tankSize, FuelType fuelType) {
        super(price, colour, motor, model);
        this.tankSize = tankSize;
        this.fuelType = fuelType;
    }

    public int getTankSize() {
        return tankSize;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
