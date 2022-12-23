public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private final double amountOfPurchase;
    private final boolean overLimit;
    public DebugCustomerMakingPurchase(int id,
       String name, double credit, double purchaseAmount) {
        super(id, name, credit);
        amountOfPurchase = purchaseAmount;
        overLimit = amountOfPurchase > this.credit;
    }
    @Override
    public void display() {
       super.display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit){
          System.out.println("****Credit denied - customer over limit");
       }
       else{
          System.out.println("Purchase Okay");
       }
    }
}
