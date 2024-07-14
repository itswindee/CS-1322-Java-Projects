// Name:        Emily Zhu
// Class:       CS 3305/W04/
// Term:        Fall 2023
// Instructor:  Carla McManus
// Assignment:  04-Part-2-Palindromes

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //creating my 3 stacks here
        Stack<Character> Stack1 = new Stack<Character>();
        Stack<Character> Stack2 = new Stack<Character>();
        Stack<Character> Stack3 = new Stack<Character>();

        //asks user to enter a word to see if it's a palindrome
        System.out.println("Enter a word to see if it's a palindrome: ");

        String userInput2 = scan.nextLine();

        //this will run through each character of the word until it meets
        for(int i = 0; i < userInput2.length(); i++){
            Stack1.push(userInput2.charAt(i));
            Stack2.push(userInput2.charAt(i));
        }
        for(int i = 0; i < userInput2.length(); i++){ //this is where stack 1 will push onto stack 3
            Stack3.push(Stack1.pop());
        }
        boolean pal = true; //this is a palindrome
        for(int i = 0; i < userInput2.length(); i++){ //this will check if stack2 doesn't equal stack3, it will make the boolean false
            if(!Stack2.pop().equals(Stack3.pop()))
            {
                pal = false;
            }
        }
        if(pal){
            System.out.println("This is a palindrome."); //if the boolean pal is true, then it is a palindrome
        }
        else{
            System.out.println("This is not a palindrome."); //otherwise, it is not a palindrome
        }

    }
}