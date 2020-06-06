package Task3Main;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164, 2.13),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192, 2.77),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242, 2.65),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188, 2.43),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222,3.11),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64, 3.82),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140, 3.59),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196,2.79),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000,6, 2.81),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, 4, 3.12),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, 6, 3.11),
            new MilitaryPlane("F-15", 1500, 12000, 10000, 10, 2.59),
            new MilitaryPlane("F-22", 1550, 13000, 11000, 10, 2.63),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, 12, 2.74)
    );
    public static void main(String[] args) {
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPassengerPlane());
        System.out.println("Airport sorted by max distance: " + airport
                .sortByMaxDistance()
                .toString());
        System.out.println("Military plane with max speed: " + militaryAirport.getMilitaryPlaneWithMaxSpeed());
        System.out.println("Total load capacity: " + (militaryAirport.getMilitaryPlaneTotalLoadCapacity()+passengerAirport.getPassengerPlaneTotalLoadCapacity()));
        System.out.println("Total passengers capacity: " + (militaryAirport.getMilitaryPlaneTotalPassengersCapacity()+passengerAirport.getPassengerPlaneTotalPassengersCapacity()));

    }
}
