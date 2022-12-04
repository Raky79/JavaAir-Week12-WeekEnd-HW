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
//    Plane plane;

    @Before
    public void before() {
        flight = new Flight("JA7579", "EDI", "ORY", "11:00");
    }

    @Test
    public void flightHasNumber () {
        assertEquals("JA7579", flight.getFlightNumber());
    }

    @Test
    public void flightHasdepartureAirport() {
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


}
