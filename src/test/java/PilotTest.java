import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    Rank rank;

    @Before
    public void before() {
        pilot = new Pilot("Violet", rank.CAPTAIN, "754312F");
    }

    @Test
    public void pilotHasAName() {
        assertEquals("Violet", pilot.getName());
    }

    @Test
    public void pilotHasARank() {
        assertEquals(rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasALicence() {
        assertEquals("754312F", pilot.getPilotLicence());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("Vroom, Vroom", pilot.pilotFlyPlane());
    }


}
