package People;

import vehicles.IDrive;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<IDrive> carCollection;

    public Customer(int money) {
        this.money = money;
        this.carCollection = new ArrayList<IDrive>();
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money = money;
    }

    public int getCarCollection() {
        return carCollection.size();
    }

    public void addCarToCollection(IDrive car) {
        this.carCollection.add(car);
    }
}
