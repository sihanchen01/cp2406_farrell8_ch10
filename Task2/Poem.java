public class Poem {
    protected final String name;
    protected final int numberOfLines;

    public Poem(String name, int numberOfLines) {
        this.name = name;
        this.numberOfLines = numberOfLines;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void showInfo() {
        System.out.printf("This is a poem named \"%s\", with %s lines.\n", name, numberOfLines);
    }
}
