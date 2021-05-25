package vehiclesTests;

import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.FuelType;
import vehicles.Motor;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car_1;
    private Motor motor_1;

    @Before
    public void before(){
        motor_1 = new Motor(1.80);
        car_1 = new Car(23000, "red", motor_1,"Mondeo", 50, vehicles.FuelType.DIESEL);
    }

    @Test
    public void hasPrice(){
        assertEquals(23000, car_1.getPrice());
    }

    @Test
    public void hasColor() {
        assertEquals("red", car_1.getColour());
    }

    @Test
    public void hasMotor() {
        assertEquals(1.80, car_1.getMotor(), 0.00);
    }

    @Test
    public void hasModel() {
        assertEquals("Mondeo", car_1.getModel());
    }

    @Test
    public void hasTankSize() {
        assertEquals(50, car_1.getTankSize());
    }

    @Test
    public void hasFuelType() {
        assertEquals(vehicles.FuelType.DIESEL, car_1.getFuelType());
    }


}
