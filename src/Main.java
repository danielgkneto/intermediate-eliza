import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
//        HashMap<String, String> replacements = new HashMap<>();
        String answer;
        String[] splitAnswer;
        String therapist;

        /*replacements.put("i", "you");
        replacements.put("me", "you");
        replacements.put("my", "your");
        replacements.put("am", "are");*/


        System.out.println("\nWelcome to Intermediate Eliza");

        while (true) {
            System.out.println("\nWhat is your problem? ");
            answer = kb.nextLine();
            answer = answer.toLowerCase();
            if (answer.equals("q"))
                break;

            splitAnswer = answer.split(" ");

            for (int i = 0; i < splitAnswer.length; i++){
                /*if (replacements.containsKey(splitAnswer[i]))
                    splitAnswer[i] = replacements.get(splitAnswer[i]);*/

                if ((splitAnswer[i]).equals("i")){
                    splitAnswer[i] = "you";
                }
                if ((splitAnswer[i]).equals("me")){
                    splitAnswer[i] = "you";
                }
                if ((splitAnswer[i]).equals("my")){
                    splitAnswer[i] = "your";
                }
                if ((splitAnswer[i]).equals("am")){
                    splitAnswer[i] = "are";
                }
            }

            therapist = "Why do you say that ";
            for (String word : splitAnswer){
                therapist = therapist.concat(word + " ");
            }
            therapist = therapist.concat("?");
            System.out.println(therapist);
        }
        System.out.println("Bye");
    }
}