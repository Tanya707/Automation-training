package Task3Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Airport {
    private List<? extends Plane> planes;



    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlane = new ArrayList<PassengerPlane>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlane.add((PassengerPlane) plane);}
        }
        return passengerPlane;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<MilitaryPlane>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public MilitaryPlane getMilitaryPlaneWithMaxSpeed() {
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        MilitaryPlane planeWithMaxSpeed = militaryPlanes.get(0);
        for (int i = 0; i < militaryPlanes.size(); i++) {
            if (militaryPlanes.get(i).getMaxSpeed() > planeWithMaxSpeed.getMaxSpeed()) {
                planeWithMaxSpeed = militaryPlanes.get(i);
            }
        }
        return planeWithMaxSpeed;
    }

    public int getPassengerPlaneTotalLoadCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        int passengerPlaneTotalLoadCapacity = 0;
        for (int i = 0; i < passengerPlanes.size(); i++) {
            passengerPlaneTotalLoadCapacity = passengerPlaneTotalLoadCapacity + passengerPlanes.get(i).getMaxLoadCapacity();
        }
        return passengerPlaneTotalLoadCapacity;
    }


    public int getMilitaryPlaneTotalLoadCapacity() {

        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        int militaryPlaneTotalLoadCapacity = 0;
        for (int i = 0; i < militaryPlanes.size(); i++) {
            militaryPlaneTotalLoadCapacity = militaryPlaneTotalLoadCapacity + militaryPlanes.get(i).getMaxLoadCapacity();
        }
        return militaryPlaneTotalLoadCapacity;
    }

    public int getPassengerPlaneTotalPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        int passengerPlaneTotalPassengersCapacity = 0;
        for (int i = 0; i < passengerPlanes.size(); i++) {
            passengerPlaneTotalPassengersCapacity = passengerPlaneTotalPassengersCapacity + passengerPlanes.get(i).getPassengersCapacity();
        }
        return passengerPlaneTotalPassengersCapacity;
    }

    public int getMilitaryPlaneTotalPassengersCapacity() {

        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        int militaryPlaneTotalPassengersCapacity = 0;
        for (int i = 0; i < militaryPlanes.size(); i++) {
            militaryPlaneTotalPassengersCapacity = militaryPlaneTotalPassengersCapacity + militaryPlanes.get(i).getPassengersCapacity();
        }
        return militaryPlaneTotalPassengersCapacity;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.GetMaxFlightDistance() - o2.GetMaxFlightDistance();
            }
        });
        return this;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }
}
