public class NewTest extends Customer {

    public String name;
    public String dateOfBirth;

    public NewTest(String name, String dateOfBirth) {
        super('A');
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String getCustomerInfo() {
        return "New Drivers License. Ticket Number: " + getTicketNumber() + ". Name: " + name + " DOB: " + dateOfBirth;
    }
}