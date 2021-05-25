import org.junit.Before;
import org.junit.Test;
import vehicles.Battery;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    private Battery battery_1;

    @Before
    public void before(){
        battery_1 = new Battery(100, 50);
    }

    @Test
    public void canChargeBattery() {
        battery_1.fillUpBattery();
        assertEquals(100, battery_1.getChargeLeft());
    }

    @Test
    public void canEmptyBattery() {
        battery_1.emptyBattery();
        assertEquals(0, battery_1.getChargeLeft());
    }
}
