import People.Dealer;
import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Car car_1;
    private HybridCar car_2;
    private Motor motor_1;
    private Tank tank_1;
    private Motor motor_2;
    private Tank tank_2;
    private Battery battery_2;

    @Before
    public void before(){
        dealer = new Dealer(52000);
        tank_1 = new Tank(50, 25);
        motor_1 = new Motor(1.80);
        car_1 = new Car(23000, "red", motor_1,"Mondeo", tank_1, vehicles.FuelType.DIESEL);
        tank_2 = new Tank(30, 20);
        motor_2 = new Motor(1.60);
        battery_2 = new Battery(100, 50);
        car_2 = new HybridCar(28000, "blue", motor_2,"Golf", FuelType.PETROL, battery_2, tank_2);
    }


    @Test
    public void hasMoney() {
        assertEquals(52000, dealer.getTill());
    }

    @Test
    public void hasEmptyCarCollectionToStart() {
        assertEquals(0, dealer.getDealerCollection());
    }

    @Test
    public void canAddCarToCollection() {
        dealer.addCarToDealerCollection(car_1);
        dealer.addCarToDealerCollection(car_2);
        assertEquals(2, dealer.getDealerCollection() );
    }

    @Test
    public void canRemoveCarFromCollection() {
        dealer.addCarToDealerCollection(car_1);
        dealer.addCarToDealerCollection(car_2);
        dealer.removeCarFromDealerCollection(car_1);
        assertEquals(1, dealer.getDealerCollection() );
    }
}
