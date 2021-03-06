package People;

import vehicles.Car;
import vehicles.IDamage;
import vehicles.IDrive;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealer implements IBuy{
     private int till;
     private ArrayList<Vehicle> dealerCollection;

    public Dealer(int till) {
        this.till = till;
        this.dealerCollection = new ArrayList<Vehicle>();
    }

    public int getTill() {
        return till;
    }

    public void addMoneyToTill(int money) {
        this.till += money;
    }

    public int getDealerCollection() {
        return dealerCollection.size();
    }

    public void addCarToDealerCollection(Vehicle car) {
        this.dealerCollection.add(car);
    }

    public Vehicle removeCarFromDealerCollection(Vehicle car){
        this.dealerCollection.remove(car);
        return car;
    }

    public void buyCar(Vehicle car) {
        if(this.till > car.getPrice()){
            dealerCollection.add(car);
            this.till -= car.getPrice();
        }
    }

    public void sellCar(Customer customer, Vehicle car) {
        if(customer.getMoney() > car.getPrice()){
            this.till += car.getPrice();
            customer.removeMoney(car.getPrice());
            customer.addCarToCollection(removeCarFromDealerCollection(car));
        }
    }

    public void reduceVehiclePriceByDamageCost(Vehicle vehicle) {
        int reducedPrice = vehicle.getPrice() - vehicle.getTotalDamageCost();
        vehicle.setPrice(reducedPrice);
    }

    public void repairVehicle(Vehicle vehicle) {
        int priceToBeAdded = 0;
        for(IDamage damage : vehicle.getDamageList()){
            double repairCost = damage.damageCost() * 1.5;
            priceToBeAdded += repairCost;
        }vehicle.setPrice(vehicle.getPrice() + priceToBeAdded);
    }
}
