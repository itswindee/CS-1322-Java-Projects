import java.util.*;

public class Main {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        do {
            System.out.println("What would you like to do?\n" +
                    "1. Add a question to the quiz\n" +
                    "2. Remove a question from the quiz\n" +
                    "3. Modify a question in the quiz\n" +
                    "4. Take the quiz\n" +
                    "5. Quit\n");
            selection = scan.nextInt();

            if(selection == 1) {
                quiz.add_question();
            }
            else if(selection == 2) {
                quiz.remove_question();
            }
            else if(selection == 3) {
                quiz.modify_question();
            }
            else if(selection == 4) {
                quiz.give_quiz();
            }

        } while(selection != 5);


    }
}