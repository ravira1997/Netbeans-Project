
package bank;


public class Account {
    public static String bankname = "RAVIBANK";
    public String name;
    public double balance;
    
    Account(String name)
    {
        this.name=name;
        
    }
    public void deposit(double amount)
    {
        this.balance= this.balance+amount;
        System.out.println("After Deposit Balance is: "+this.balance);
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Sorry... Insufficient Funds");
            System.exit(0);
        }
        else
        {
            this.balance= this.balance-amount;
            System.out.println("After Withdraw the Balance: "+this.balance);
        }
    }
    
}
