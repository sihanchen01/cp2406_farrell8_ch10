public class ScentedCandle extends Candle{
    public ScentedCandle(String color, double height) {
        super(color, height);
        this.price = height * 3;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        this.price = height * 3;
    }
}
