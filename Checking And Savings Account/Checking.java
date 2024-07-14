import java.util.Scanner;

public class Checking extends Account {


    public Checking ()
    {
        super();
    }
    public Checking(double accountBalance) {
        super(accountBalance);
    }

    @Override
    public void withdrawal(double amount){

        if((accountBalance - amount) < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            super.withdrawal(amount+20);
        }
        else {
            System.out.println("Amount withdrawn successfully!");
            super.withdrawal(amount);
        }

    }

}