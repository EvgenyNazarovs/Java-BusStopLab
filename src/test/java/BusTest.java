import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("Maryhill", 25);
        person = new Person();
        busStop = new BusStop("Hillhead");
    }

    @Test
    public void hasDestination(){
        assertEquals("Maryhill", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(25, bus.getCapacity());
    }

    @Test
    public void canGetPassangers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checksCapacity(){
        assertEquals(true, bus.checkCapacity());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassenger(){
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }




}
