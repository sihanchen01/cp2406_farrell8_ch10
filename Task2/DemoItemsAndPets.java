public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item = new ItemSold(12345, "brand new macbook air", 1249);
        item.showInfo();
        PetSold pet = new PetSold(54321, "British short-hair", 899,
                false, true, false);
        pet.showInfo();
    }
}
