public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("No Man Is An Island", 15);
        poem.showInfo();
        Couplet couplet = new Couplet("Good night (Romeo and Juliet)");
        couplet.showInfo();
        Limerick limerick = new Limerick("There Was an Old Man with a Beard");
        limerick.showInfo();
        Haiku haiku = new Haiku("Lighting One Candle");
        haiku.showInfo();
    }
}
