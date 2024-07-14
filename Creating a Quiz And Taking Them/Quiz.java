import java.util.*;

public class Quiz {

List<Question> questionList = new ArrayList<>();

  public void add_question(){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the question?");
    String text = scan.nextLine();

    System.out.println("What is the answer?");
    String answer = scan.nextLine();

    System.out.println("How Difficult (1-3)?");
    int difficulty = scan.nextInt();

    questionList.add(new Question(text, answer, difficulty));
  }

  public void remove_question(){
    ListIterator<Question> listIterator = questionList.listIterator();
    int counter = 1;
    while(listIterator.hasNext()){
      System.out.print(counter +" ");
      System.out.println(listIterator.next().getText());
      counter++;
    }
    System.out.println("Choose the question to remove?");
    Scanner scan = new Scanner(System.in);
    int selection = scan.nextInt();
    questionList.remove(selection-1);
  }

  public void modify_question(){
    ListIterator<Question> listIterator = questionList.listIterator();
    int counter = 1;
    while(listIterator.hasNext()){
      System.out.print(counter +" ");
      System.out.println(listIterator.next().getText());
      counter++;
    }
    System.out.println("Choose the question to modify?");
    Scanner scan = new Scanner(System.in);
    int selection = scan.nextInt();
    scan.nextLine();
    System.out.println("What is the new question?");
    String question = scan.nextLine();
    questionList.get(selection-1).setText(question);

    System.out.println("What is the answer?");
    String answer = scan.nextLine();
    questionList.get(selection-1).setAnswer(answer);

    System.out.println("How Difficult (1-3)");
    int difficulty = scan.nextInt();
    questionList.get(selection-1).setDifficulty(difficulty);

  }

  public void give_quiz(){
    ListIterator<Question> listIterator = questionList.listIterator();
    Scanner scan = new Scanner(System.in);

    int numQuestions = 0;
    int numCorrect = 0;

    while(listIterator.hasNext()) {
      numQuestions++;

      System.out.println(listIterator.next().getText());
      String answer = scan.nextLine();

      if(questionList.get(numQuestions-1).getAnswer().equals(answer)) {
        numCorrect++;
      }
    }
    double grade = (double)numCorrect/numQuestions;
    System.out.println("Total grade: " + grade*100 + "%");
  }

}