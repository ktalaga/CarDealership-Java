package vehicles;

public class Tank {

    private int tankSize;
    private int fuelLeft;

    public Tank(int tankSize, int fuelLeft) {
        this.tankSize = tankSize;
        this.fuelLeft = fuelLeft;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public int getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(int fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public void fillUpTank(){
        setFuelLeft(this.tankSize);
    }

    public void emptyTank(){
        setFuelLeft(0);
    }
}
