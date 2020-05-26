import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int passengerCount() {
        return passengers.size();
    }


    public boolean checkCapacity() {
        if (passengerCount() < getCapacity()) {
            return true;
        } else {
            return false;
        }
    }

    public void addPassenger(Person person) {
        if (checkCapacity()){
            passengers.add(person);
        }
    }


    public void removePassenger(Person person) {
        if (passengers.contains(person)) {
            passengers.remove(person);
        }
    }

    public void pickUpPassenger(BusStop busStop) {
        Person person = busStop.removePerson();
        passengers.add(person);
    }
}
