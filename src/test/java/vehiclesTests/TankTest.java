package vehiclesTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class TankTest {

    private Tank tank_1;

    @Before
    public void before(){
        tank_1 = new Tank(40, 20);
    }

    @Test
    public void hasSize() {
        assertEquals(40, tank_1.getTankSize());
    }

    @Test
    public void hasFuelLeft() {
        assertEquals(20, tank_1.getFuelLeft());
    }

    @Test
    public void canFillUpTank() {
        tank_1.fillUpTank();
        assertEquals(40, tank_1.getFuelLeft());
    }

    @Test
    public void canEmptyTank() {
        tank_1.emptyTank();
        assertEquals(0, tank_1.getFuelLeft());
    }
}
