package Banking;

public class Bank {
    public void start_banking(){
        String asif_pin = "5566";
        String abdullah_pin="NULL"; // abdullah didn't set his pin, we consider it as NULL

        Account asif = new Account("Asif","0154500000",asif_pin);
        Account abdullah = new Account("Abdullah","0189742222",abdullah_pin); // abdullah opened account without pin

        System.out.println(asif); // showing account information of asif
        System.out.println(abdullah); // showing account information of abdullah

        asif.add_money(500);
        asif.cash_out(300,asif_pin);

        abdullah.add_money(1000);
        abdullah.cash_out(500,abdullah_pin); //this will ask you to set your pin as abdullah's pin is not initialize


        abdullah_pin =abdullah.set_new_pin(abdullah_pin); // setting abdullah's pin


        abdullah.cash_out(100,abdullah_pin);
        abdullah.cash_out(5000,abdullah_pin);

    }
}
