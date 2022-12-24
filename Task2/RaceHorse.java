public class RaceHorse extends Horse{
    private int racesCompeted;

    public RaceHorse(String name, String color, int birthYear, int racesCompeted) {
        super(name, color, birthYear);
        this.racesCompeted = racesCompeted;
    }

    public int getRacesCompeted() {
        return racesCompeted;
    }

    public void setRacesCompeted(int racesCompeted) {
        this.racesCompeted = racesCompeted;
    }
}
