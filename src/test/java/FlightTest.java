import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
//
//    Pilot pilot;
//
//    Passenger passenger;
//
    Plane plane;

    @Before
    public void before() {
        flight = new Flight("JA7579", "EDI", "ORY", "11:00", plane.AIRBUS_A_380);
    }

    @Test
    public void flightHasNumber () {
        assertEquals("JA7579", flight.getFlightNumber());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDestinationAirport() {
        assertEquals("ORY", flight.getDestinationAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("11:00", flight.getDepartureTime());
    }

    @Test
    public void flightHasPlaneType() {
        assertEquals(plane.AIRBUS_A_380, flight.getPlaneType());
    }

    @Test
    public void flightHasCapacity() {
        assertEquals(500, flight.getPlaneType().getCapacity());
    }

    @Test
    public void flightHasWeight() {
        assertEquals(290000, flight.getPlaneType().getTotalWeight(),0.0);
    }


}
