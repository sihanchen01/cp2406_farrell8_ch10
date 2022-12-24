public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle("white", 4.2);
        candle.showInfo();
        ScentedCandle scentedCandle = new ScentedCandle("red", 4.2);
        scentedCandle.showInfo();
    }
}
