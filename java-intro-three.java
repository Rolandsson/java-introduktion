import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneList = new HashMap<>();
        boolean running = true;
        int operation;
        while(running) {
            String key;
            String value;
            operation = scanner.nextInt();
            scanner.nextLine();
            switch(operation) {
                case 0: // Create
                    key = scanner.nextLine();
                    value = scanner.nextLine();
                    phoneList.put(key, value);
                    break;
                case 1: // Update
                    key = scanner.nextLine();
                    value = scanner.nextLine();
                    phoneList.replace(key, value);
                    break;
                case 2: // Read
                    key = scanner.nextLine();
                    System.out.println(phoneList.get(key));
                    break;
                case 3: // Update
                    key = scanner.nextLine();
                    phoneList.remove(key);
                    break;
                case 4: // Delete
                    for(String x : phoneList.keySet()) {
                        System.out.println(x);
                        System.out.println(phoneList.get(x));
                    }
                    break;
                case 5:
                    running = false;
                    break;

            }
        }

        Map<String, List<String>> dictionary = new HashMap<>();

        dictionary.put("hej", Arrays.asList("hello", "hi", "hey"));
        dictionary.put("middag", Arrays.asList("dinner", "supper"));
        System.out.println(dictionary.get("middag").get(0));
    }
}