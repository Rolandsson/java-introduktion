import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(menu() != -1) {
        }
    }

    public static int menu() {
        printMenu();
        int running = 0;
        Scanner sc = new Scanner(System.in);
        char cmd = sc.nextLine().charAt(0);
        switch (cmd) {
            case '1':
                System.out.print("Första talet: ");
                int a = sc.nextInt();
                sc.nextLine();
                System.out.print("Andra talet: ");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.print("Summan är: ");
                System.out.println(addTwoNum(a, b));
                break;
            case '2':
                System.out.print("Ange ordet du vill leta i: ");
                String searchString = sc.nextLine();
                System.out.println("Ange bokstaven du vill leta efter: ");
                char searchChar = sc.nextLine().charAt(0);
                int searchFound = returnNinString(searchString, searchChar);
                System.out.println("Det finns " + searchFound + " \'" + searchChar + "\' i \"" + searchString + "\".");
                break;
            case '3':
                System.out.println("Skriv in en sträng: ");
                String str = reverseString(sc.nextLine());
                System.out.println(str);
                break;
            case '4':
                System.out.print("Skriv in en sträng med siffror: ");
                int num = addNumFromString(sc.nextLine());
                System.out.println("Slutsiffran är: " + num);
                break;
            case 'e':
                running = -1;
                System.out.println("Hej då!");
                break;
        }
        return running;
    }

    public static void printMenu() {
        System.out.println("Vad vill du göra?");
        System.out.println("1. Addera två tal");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng");
        System.out.println("4. Summera alla tal i en sträng");
        System.out.println("e. Avsluta");
    }

    public static int addTwoNum(int a, int b) {
        return a + b;
    }

    public static int returnNinString(String str, char chr) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == chr)
                x++;
        }
        return x;
    }

    public static String reverseString(String str) {
        int tempNameLength = str.length();
        char[] tempStr = str.toCharArray();
        for (int i = 0; i <= str.length() / 2 -1; i++) {
            char tempLetter = tempStr[i];
            tempStr[i] = tempStr[tempNameLength-1];
            tempStr[tempNameLength-1] = tempLetter;
            tempNameLength--;
        }
        return new String(tempStr);
    }

    public static int addNumFromString(String str) {
        char[] temp = str.toCharArray();
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            int tempNum = Character.getNumericValue(temp[i]);
            if(tempNum >= 0 && tempNum <= 9) {
                n += tempNum;
            }
        }
        return n;
    }
}