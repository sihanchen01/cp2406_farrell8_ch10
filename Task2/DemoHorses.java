public class DemoHorses {
    public static void main(String[] args) {
        Horse horse = new Horse("horsy", "brown", 2016);
        System.out.printf("This %s horse's name is %s, it is born in %s\n",
                horse.getColor(), horse.getName(), horse.getBirthYear());

        RaceHorse raceHorse = new RaceHorse("horsy", "brown", 2016, 5);
        System.out.printf("This %s horse's name is %s, it is born in %s. It competed in %s races.\n",
                raceHorse.getColor(), raceHorse.getName(), raceHorse.getBirthYear(), raceHorse.getRacesCompeted());
    }
}
