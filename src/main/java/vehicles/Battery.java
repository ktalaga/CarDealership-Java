package vehicles;

public class Battery {

    private int batterySize;
    private int chargeLeft;

    public Battery(int batterySize, int chargeLeft) {
        this.batterySize = batterySize;
        this.chargeLeft = chargeLeft;
    }

    public int getBatterySize() {
        return batterySize;
    }


    public int getChargeLeft() {
        return chargeLeft;
    }

    public void setChargeLeft(int chargeLeft) {
        this.chargeLeft = chargeLeft;
    }

    public void fillUpBattery(){
        setChargeLeft(batterySize);
    }

    public void emptyBattery(){
        setChargeLeft(0);
    };
}
