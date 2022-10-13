import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        String adress = consoleHandler.askUser("Where do you live?");
        int age = consoleHandler.askForInteger("How old are you?");
        List<String> items = consoleHandler.askForList("What items do you wish to add?");
        System.out.println("So you're " + age + " old and you live at " + adress + "?");
        for(String x : items) {
            System.out.println("Item: " + x);
        }
        Dice dice = new Dice();
        dice.setMinSize(5);
        dice.setMaxSize(10);

        dice.throwDice(15); // Should be maximum 10
        List<Integer> result = dice.throwDices(3);
        System.out.println(result);

        List<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Test 1", "Home", "070 123 12 12"));
        humans.add(new Human("Test 2", "Far Away", "070 321 12 12"));
        humans.add(new Human("Test 3", "Far Far Away", "070 213 12 12"));
        humans.add(new Human("Test 4", "Home", "070 123 21 21"));
        humans.add(new Human("Test 5", "Far Far Far Away", "070 312 12 12"));
        for(Human human : humans) {
            human.show();
        }

        HumanConsoleWriter humanConsoleWriter = new HumanConsoleWriter();
        humanConsoleWriter.writeNames(humans);
        humanConsoleWriter.writeAll(humans);

        HumanAgency humanAgency = new HumanAgency(humans);
        List<Human> foundAddress = humanAgency.findHumansOnAddress("Home");
        List<Human> foundPhone = humanAgency.findHumansOnAddress("070");
        for(Human human : foundAddress) {
            human.getName();
        }

        for(Human human : foundPhone) {
            human.show();
        }
    }
}