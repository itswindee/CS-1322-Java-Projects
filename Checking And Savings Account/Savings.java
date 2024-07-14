import java.util.Scanner;

public class Savings extends Account {


    public Savings(){
        super();
    }
    public Savings( double accountBalance){
        super( accountBalance);
    }



    //add an interest method
    public void addInterest () {
        double interestRate = .015;
        double interest = accountBalance * interestRate;

        System.out.println("Customer earned " + interest + " in interest.");
        accountBalance = accountBalance + interest;

        accountBalance = Math.round(accountBalance*100.0)/100.0;
    }


    //withdrawal method
    @Override
    public void withdrawal ( double amount){
        if ((accountBalance - amount) < 500) {
            System.out.println("Charging an overdraft fee of $10 because account is below $500.");
            super.withdrawal(amount+10);
        }
        else {
            super.withdrawal(amount);
        }
    }


    //deposit method
    int count = 0;
    @Override
    public void deposit(double amount) {

        count++;
        if (count <= 5) {

            System.out.println("This is your " + count + " deposit.");
            super.deposit(amount);
        } else {

            System.out.println("This is your " + count + " deposit.");
            System.out.println("Charging a fee of $10");
            super.deposit(amount - 10);
        }
    }
}