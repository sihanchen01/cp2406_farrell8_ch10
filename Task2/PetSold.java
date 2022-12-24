public class PetSold extends ItemSold{
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    public PetSold(int invoiceNumber, String description, double price, boolean vaccinated, boolean neutered, boolean housebroken) {
        super(invoiceNumber, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHousebroken() {
        return housebroken;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }

    @Override
    public void showInfo() {
        String v, n, h;
        v = vaccinated ? "" : "not ";
        n = neutered ? "" : "not ";
        h = housebroken ? "" : "not ";
        System.out.printf("Pet %s (%s) sold at $%.2f - (%svaccinated, %sneutered and %shousebroken).",
                invoiceNumber, description, price, v, n, h);
    }
}
