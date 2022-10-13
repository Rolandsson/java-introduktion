import java.util.List;

public class HumanConsoleWriter {
    public void writeNames(List<Human> humanList) {
        for(Human human : humanList) {
            System.out.println(human.getName());
        }
    }

    public void writeAll(List<Human> humanList) {
        for(Human human : humanList) {
            System.out.println(human.getAll());
        }
    }
}
