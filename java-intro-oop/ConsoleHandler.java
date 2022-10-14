import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHandler {
    Scanner scanner = new Scanner(System.in); // Bör instansieras i konstruktorn
    public String askUser(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    public int askForInteger(String query) {
        String string = askUser(query); // Snyggt att du återanvänder askUser metoden
        return Integer.parseInt(string); // Bra parsing, går det dock att kolla ifall det är en integer innan den parsas?
    }

    public List<String> askForList(String s) {
        System.out.println(s);
        String listItem;
        boolean running = true; // Då den endast frågar efter items i varje iteration kan referensen specificeras ytterligare med ex. "isAsking", "isDone" ...
        List<String> list = new ArrayList<>();
        while (running) {
            listItem = scanner.nextLine(); // Kan rimligen använda askUser här igen, med en tom fråga
            if(!listItem.equals("")) {
                list.add(listItem);
            } else {
                running = false;
            }
        }
        return list;
    }
}
