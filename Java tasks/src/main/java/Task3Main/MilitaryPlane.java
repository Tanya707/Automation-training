package Task3Main;

public class MilitaryPlane extends Plane{

    private int maxSpeed;
    private int maxLoadCapacity;
    private int passengersCapacity;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity, double
            fuelConsumption) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.maxSpeed = maxSpeed;
        this.maxLoadCapacity = maxLoadCapacity;
        this.passengersCapacity = passengersCapacity;
      }

      public int getMaxSpeed() {
        return maxSpeed;
       }

       public int getMaxLoadCapacity() {
        return maxLoadCapacity;
       }

       public int getPassengersCapacity() {
        return passengersCapacity;
       }
    }

