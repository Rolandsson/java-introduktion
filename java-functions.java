import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String answer = askQuestion("How are you today?");
        String response = responseMood(answer);
        System.out.println(response);*/
        for (int i = 0; i < 10; i++) {
            String answer = askQuestion("How many sides does the dice have?");
            int answerToInt = Integer.parseInt(answer);
            System.out.println(throwDice(answerToInt));
        }
    }

    public static int throwDice(int sides) {
        Random random = new Random();
        if(sides >= 4 && sides <= 20 && sides % 2 == 0) {
            return (random.nextInt(sides) + 1);
        } else {
            return 0;
        }
    }
    public static String responseMood(String mood) {
        switch(mood) {
            case "Glad":
                return "Good to hear!";
            case "Sad":
                return "Who hurt you?";
            case "Confused":
                return "Who isn't?";
            default:
                return "I see.";
        }
    }

    public static String askQuestion(String question) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        String answer = scanner.nextLine();

        return answer;
    }
}