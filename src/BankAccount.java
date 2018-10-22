public class BankAccount {
    protected String name;
    protected int accnum;

    public BankAccount()
    {
        this.name = "No Name";
        this.accnum = 0;
    }
    public BankAccount(String name,int accnum)
    {
        this.name = name;
        this.accnum = accnum;
    }

}
