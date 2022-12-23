public class DebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double credit;
    public DebugCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       this.credit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + credit);
    }
}
