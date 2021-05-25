package People;

import com.sun.xml.internal.bind.v2.model.core.ID;
import vehicles.IDrive;

import java.util.ArrayList;

public class Dealer {
     private int till;
     private ArrayList<IDrive> dealerCollection;

    public Dealer(int till) {
        this.till = till;
        this.dealerCollection = new ArrayList<IDrive>();
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

    public void addCarToDealerCollection(IDrive car) {
        this.dealerCollection.add(car);
    }

    public IDrive removeCarFromDealerCollection(IDrive car){
        this.dealerCollection.remove(car);
        return car;
    }
}
