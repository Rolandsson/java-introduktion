import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String address;
    private String phone;

    public Human(String name, String address, String phone) {
        this.address = address;
        this.phone = phone;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAll() {
        return this.name + "\n\t" + this.address + "\n\t\t" + this.phone;
    }

    // Vi har inte gått igenom detta men tekniskt så kan denna metod ersättas med en override av toString.
    // Fördelen är då att du kan skriva "System.out.println(human)" istället för "human.show()"
    public void show() { 
        System.out.println(this.name + "\n\t" + this.address + "\n\t\t" + this.phone);
    }
    
    @Override
    public String toString() {
        return this.name + "\n\t" + this.address + "\n\t\t" + this.phone
    }
}
