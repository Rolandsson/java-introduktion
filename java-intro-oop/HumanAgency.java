import java.util.ArrayList;
import java.util.List;

public class HumanAgency {
    List<Human> temp; // Ifall du ser denna som en temporärlista som hanteras av human agency så bör den skickas som en parameter till respektive metod
    
    /**
    En alternativ lösning är att hantera HumanAgency som en repository, dvs. den har en instans av en lista med humans och innehåll CRUD metoder.
    */
    
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
