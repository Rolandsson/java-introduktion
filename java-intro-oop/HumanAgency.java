import java.util.ArrayList;
import java.util.List;

public class HumanAgency {
    List<Human> temp;
    public HumanAgency(List<Human> humans) {
        this.temp = humans;

    }
    public List<Human> findHumansOnAddress(String address) {
        List<Human> found = new ArrayList<>();
        System.out.println("Looking for humans with the address: \"" + address + "\"");
        for(Human human: temp) {
            if(human.getAddress().equals(address)) {
                found.add(human);
            }
        }
        System.out.println("Found: " + found.size());
        return found;
    }

    public List<Human> findHumansWithPhoneNumber(String phoneNumber) {
        List<Human> found = new ArrayList<>();
        System.out.println("Looking for humans with the address: \"" + phoneNumber + "\"");
        for(Human human: temp) {
            if(human.getAddress().equals(phoneNumber)) {
                found.add(human);
            }
        }
        System.out.println("Found: " + found.size());
        return found;
    }
}
