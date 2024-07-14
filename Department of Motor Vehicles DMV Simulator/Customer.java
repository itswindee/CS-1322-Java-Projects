public abstract class Customer {

    private char letter;
    private int number;

    static int A = 1;
    static int B = 1;
    static int C = 1;
    static int D = 1;

    public Customer() {
        this.letter = 'X';
        this.number = 0;
    }

    public Customer(char letter) {
        switch (letter) {
            case 'A' -> {
                this.letter = 'A';
                this.number = A++;
            }
            case 'B' -> {
                this.letter = 'B';
                this.number = B++;
            }
            case 'C' -> {
                this.letter = 'C';
                this.number = C++;
            }
            case 'D' -> {
                this.letter = 'D';
                this.number = D++;
            }
            default -> {
                this.letter = 'X';
                this.number = 0;
                System.out.println("Error, letter must be A, B, C or D");
            }
        }
    }


    protected String getTicketNumber(){
        return letter + "" + number;
    }

    public abstract String getCustomerInfo();

}