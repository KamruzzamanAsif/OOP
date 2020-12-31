package Banking;
import java.util.*;

public class Account {
     String account_holder_name;
    private String account_holder_phone_number;
    private String pin;
    private double balance;

    //    Making a constructor of Account class
    public Account(String name, String account_holder_phone_number, String pin){
        this.account_holder_name = name;
        this.account_holder_phone_number = account_holder_phone_number;
        this.pin = pin;
    }

    //To set pin if user didn't set pin while opening an account
    protected String set_new_pin(String pin){
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        pin = sc.nextLine();
        this.pin=pin; // updating/setting account_holder's pin
        System.out.println("Pin setting complete");
        return pin;  // we take a new pin from user to set his pin
    }

    // add_money method
    public void add_money(double amount){
        this.balance+=amount;
        System.out.println(account_holder_name +":\tAdd money: " + amount + "BDT\tPresent balance: "+balance+"BDT");
    }

    // cash_out method
    public void cash_out(double amount, String pin){
        if(pin=="NULL"){
            System.out.println(account_holder_name+" Pin is not set yet.Set your pin now");
        }
        else if(this.pin != pin){
            System.out.println(account_holder_name+" Pin doesn't match\tTry again");
        }
        else{
            if (balance >= amount){
                balance -= amount;
                System.out.println(account_holder_name +":\tCash out: " + amount + "BDT\t Present balance: "+balance+"BDT");
            }
            else {
                System.out.println(account_holder_name+" Failed to cash out due to low balance");
            }
        }
    }

    // used toString()[modified a little that's why @Override shown here] to show account holder information
    @Override
    public String toString() {
        return "Account Information: " +
                "Account Holder Name= " + account_holder_name  +
                ", Phone Number= " + account_holder_phone_number + ", Balance= " + balance;
    }


    // this functions were made to show the private info of the the account holder but as public toString used so
    //this don't need anymore.

/*    public String getAccount_holder_name(){
        return this.account_holder_name;
   }

    protected String getAccount_holder_phone_number(){
        return this.account_holder_phone_number;
    }

    protected double getBalance(){
        return this.balance;
    }
 */

}
