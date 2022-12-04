public class Flight {

    private String flightNumber;
    private String departureAirport;

    private String destinationAirport;

    private String departureTime;

    private Plane plane;


    public Flight(String flightNumber, String departureAirport, String destinationAirport, String departureTime, Plane plane) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane getPlaneType() {
        return this.plane;
    }
}
