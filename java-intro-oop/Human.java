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

    public void show() {
        System.out.println(this.name + "\n\t" + this.address + "\n\t\t" + this.phone);
    }
}
