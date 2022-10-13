import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHandler {
    Scanner scanner = new Scanner(System.in);
    public String askUser(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    public int askForInteger(String query) {
        String string = askUser(query);
        return Integer.parseInt(string);
    }

    public List<String> askForList(String s) {
        System.out.println(s);
        String listItem;
        boolean running = true;
        List<String> list = new ArrayList<>();
        while (running) {
            listItem = scanner.nextLine();
            if(!listItem.equals("")) {
                list.add(listItem);
            } else {
                running = false;
            }
        }
        return list;
    }
}
