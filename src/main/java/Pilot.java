public class Pilot extends CabinCrewMember{

    private String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence) {
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public String pilotFlyPlane() {
        return String.format("Vroom, Vroom");
    }
}

