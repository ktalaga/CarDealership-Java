package vehicles;

import java.util.ArrayList;

public abstract class Vehicle implements IDamage {

    private int price;
    private String colour;
    private Motor motor;
    private String model;
    private ArrayList<IDamage> damageList;

    public Vehicle(int price, String colour, Motor motor, String model) {
        this.price = price;
        this.colour = colour;
        this.motor = motor;
        this.model = model;
        this.damageList = new ArrayList<IDamage>();
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

    public int damageCost() {
        return 0;
    }

    public void addDamageToDamageArrayList(IDamage damage){
        damageList.add(damage);
    }

    public ArrayList<IDamage> getDamageList() {
        return damageList;
    }

    public int getTotalDamageCost(){
        int totalDamageCost = 0;
        for(IDamage damage : getDamageList()){
            totalDamageCost += damage.damageCost();
        }return totalDamageCost;
    }
}
