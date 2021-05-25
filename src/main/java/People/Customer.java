package People;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy{

    private int money;
    private ArrayList<Vehicle> carCollection;

    public Customer(int money) {
        this.money = money;
        this.carCollection = new ArrayList<Vehicle>();
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public int getCarCollection() {
        return carCollection.size();
    }

    public void addCarToCollection(Vehicle car) {
        this.carCollection.add(car);
    }

    public void buyCar(Vehicle car) {
        if(this.money > car.getPrice()){
            carCollection.add(car);
            this.money -= car.getPrice();
        }
    }

    public void removeMoney(int money) {
        this.money -= money;
    }
}
