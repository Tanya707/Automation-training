package Task3Main;

public class PassengerPlane extends Plane{

    private int maxLoadCapacity;
    private int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity, double
            fuelConsumption) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.maxLoadCapacity = maxLoadCapacity;
        this.passengersCapacity = passengersCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }
}


