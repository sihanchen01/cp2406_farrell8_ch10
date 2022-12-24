public class ItemSold {
    protected int invoiceNumber;
    protected String description;
    protected double price;

    public ItemSold(int invoiceNumber, String description, double price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInfo() {
        System.out.printf("Item %s (%s) sold at $%.2f\n", invoiceNumber, description, price);
    }
}
