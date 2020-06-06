import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import Planes.experimentalPlane;
import models.ExperimentalTypes;


import static models.ClassificationLevel.*;
import static models.MilitaryType.*;
import static org.junit.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;



import org.junit.Test;



import java.util.Arrays;
import java.util.List;


;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, TRANSPORT),
            new experimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, SECRET),
            new experimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, TOP_SECRET)
    );

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport= new Airport(planes);
        List<MilitaryPlane> expectedMilitaryPlane = airport.getTransportMilitaryPlanes();
        assertThat(expectedMilitaryPlane).extracting(MilitaryPlane::getType).contains(TRANSPORT);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(planes);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }

    @Test
    public void testSortByMaxLoadCapacity() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        assertThat(planesSortedByMaxLoadCapacity).extracting(Plane::getMinLoadCapacity).isSorted();
    }

    @Test
    public void testGetBomberMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> expectedBomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        assertThat(expectedBomberMilitaryPlanes).extracting(MilitaryPlane::getType).contains(BOMBER);
        }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<experimentalPlane> expectedExperimentalPlanes = airport.getExperimentalPlanes();
        assertThat(expectedExperimentalPlanes).extracting(experimentalPlane::getClassificationLevel).doesNotContain(UNCLASSIFIED);
    }
}
