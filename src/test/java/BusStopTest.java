import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void setUp(){
        busStop = new BusStop("Hillhead");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Hillhead", busStop.getName());
    }

    @Test
    public void showsQueue(){
        assertEquals(0, busStop.showQueue());
    }

    @Test
    public void addPersonToTheQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.showQueue());
    }

    @Test
    public void removePersonFromTheQueue(){
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.showQueue());
    }
}
