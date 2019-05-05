
package bank;
import java.util.Scanner;

public class Customer {

 
    public static void main(String[] args) {
       
        System.out.println("Welcome to "+Account.bankname);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.next();
        Account A1 = new Account(name);
        System.out.println("Hello "+A1.name+" Your Account Created");
        while(true)
        {
        System.out.println("Choose Your Option to Perform");
        System.out.println("D-Deposit\nW-WithDraw \nE-Exit");
        String option = sc.next();
        if(option.equalsIgnoreCase("D"))
        {
            System.out.println("Enter Amount");
            double amount = sc.nextDouble();
              A1.deposit(amount);
           }
        else if(option.equalsIgnoreCase("W"))
        {
            System.out.println("Enter Amount to Withdraw:");
            double amount = sc.nextDouble();
            A1.withdraw(amount);
        }
        
        else if(option.equalsIgnoreCase("E"))
        {
            System.out.println("Thanks For Banking...");
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Option... Plz Choose Valid Option");
        }
        
        }
    }
    
}
