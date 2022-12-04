import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    Rank rank;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Anna", rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasAName() {
        assertEquals("Anna", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasARank() {
        assertEquals(rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberTalks(){
        assertEquals("Welcome to this JavaAir Flight", cabinCrewMember.talks());
    }



}




