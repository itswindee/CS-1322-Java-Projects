import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checking account = new Checking(0);
        Savings account2 = new Savings(0);
        int selection = 0;
        do {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");
            selection = scan.nextInt();

            if (selection == 1) {
                System.out.println("Enter the amount you want to withdraw");
                double amount = scan.nextDouble();
                account.withdrawal(amount);
            }
            else if (selection == 2) {
                System.out.println("Enter the amount you want to withdraw");
                double amount = scan.nextDouble();
                account2.withdrawal(amount);
            }
            else if (selection == 3) {
                System.out.println("Enter the amount you want to deposit");
                double amount = scan.nextDouble();
                account.deposit(amount);
            }
            else if (selection == 4) {
                System.out.println("Enter the amount you want to deposit");
                double amount = scan.nextDouble();
                account2.deposit(amount);
            }
            else if (selection == 5) {
                System.out.println("Your balance for account " + account.getAccountNumber() + " is " + account.getAccountBalance());
            }
            else if (selection == 6) {
                System.out.println("Your balance for account " + account2.getAccountNumber() + " is " + account2.getAccountBalance());
            }
            else if (selection == 7) {
                account2.addInterest();
            }

        } while(selection != 8);
    }

}