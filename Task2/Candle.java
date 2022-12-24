public class Candle {
    protected String color;
    protected double height;
    // height in inches
    protected double price;

    public Candle(String color, double height) {
        this.color = color;
        this.height = height;
        this.price = height * 2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2;
    }

    public double getPrice() {
        return price;
    }

    public void showInfo() {
        System.out.printf("This is a %s %.2f inch candle, with price of $%.2f\n", color, height, price);
    }
}
