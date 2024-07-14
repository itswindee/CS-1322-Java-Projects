import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Customer> customer = new ArrayList<Customer>();


    public static void menu(ArrayList<Customer> customer) {
        Scanner scan = new Scanner(System.in);
        int selection;
        do {
            System.out.println("1. Take test for new license\n" +
                    "2. Renew existing license\n" +
                    "3. Move from out of state\n" +
                    "4. Answer citation/suspended license\n" +
                    "5. See current queue\n" +
                    "6. Quit");
            selection = scan.nextInt();
            scan.nextLine();

            if (selection == 1) {
                System.out.println("What is your name?");
                String name = scan.nextLine();
                System.out.println("What is your date of birth?");
                String dateOfBirth = scan.nextLine();
                customer.add(new NewTest(name, dateOfBirth));
            }
            if (selection == 2) {
                System.out.println("What is your name?");
                String name = scan.nextLine();
                customer.add(new Renew(name));
            }
            if (selection == 3) {
                System.out.println("What is your name?");
                String name = scan.nextLine();
                System.out.println("What state did you move from?");
                String state = scan.nextLine();
                customer.add(new Move(name, state));
            }
            if (selection == 4) {
                System.out.println("What is your name?");
                String name = scan.nextLine();
                System.out.println("What violation did you commit?");
                String violation = scan.nextLine();
                customer.add(new Suspended(name, violation));
            }
            if (selection == 5) {
                for(int i = 0; i < customer.size(); i++) {
                    System.out.println(customer.get(i).getCustomerInfo());
                }
            }
        }
        while (selection != 6);
    }


    public static void main(String[] args) {
        menu(customer);
    }
}