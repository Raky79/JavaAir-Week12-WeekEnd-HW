public class CabinCrewMember extends Person{

    private Rank rank;
    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String talks() {
        return String.format("Welcome to this JavaAir Flight");
    }


}
