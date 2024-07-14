public class Move extends Customer {

    public String name;
    public String state;

    public Move(String name, String state) {
        super('C');
        this.name = name;
        this.state = state;
    }

    @Override
    public String getCustomerInfo() {
        return "Moved from " + state + ". Ticket Number: " + getTicketNumber() + ". Name: " + name;
    }
}