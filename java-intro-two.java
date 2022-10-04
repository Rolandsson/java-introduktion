import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /***
         * NAMNLISTA
         */

        /* Hämta antal namn som ska hamna i listan. */
        System.out.println("How many names do you want? 0-100");
        String[] names = new String[100];
        Scanner typeName = new Scanner(System.in);
        int numOfNames = typeName.nextInt();
        typeName.nextLine();

        /* Ta emot namn för varje antal som valts */
        for (int i = 0; i < numOfNames; i++) {
            System.out.print("Name " + (i+1) + " ");
            names[i] = typeName.nextLine();
            System.out.println();
        }

        /* Skriv ut alla namn i listan */
        for (int i = 0; i < numOfNames; i++) {
            System.out.println(names[i]);
        }

        System.out.println("- - - - - - - - - -");

        /* Vänd på listan */
        for(int i = 0; i <= numOfNames / 2 - 1; i++) {
            String temp = names[i];
            names[i] = names[numOfNames-i-1];
            names[numOfNames-i-1] = temp;
        }
        String[] namesReversed = new String[100];
        /* Vänd på namnet i listan */
        for (int i = 0; i < numOfNames; i++) {
            int tempNameLength = names[i].length();
            char[] tempName = names[i].toCharArray();
            for (int j = 0; j <= names[i].length() / 2 -1; j++) {
                char tempLetter = tempName[j];
                tempName[j] = tempName[tempNameLength-1];
                tempName[tempNameLength-1] = tempLetter;
                tempNameLength--;
            }
            namesReversed[i] = new String(tempName);
        }
        for (int i = 0; i < numOfNames; i++) {
            System.out.println(namesReversed[i]);
        }

        /***
         * STRÄNGAR
         */
        /* Substring exempel */
        String subStringName = "Eriksson, Kerstin";
        int tempSubString = subStringName.indexOf(", ");
        String firstname = subStringName.substring(tempSubString+2, subStringName.length());
        String lastname = subStringName.substring(0, tempSubString);
        System.out.println(subStringName);
        System.out.println(firstname + " " + lastname);

        System.out.println("- - - - - - - - - -");

        /* Om programmet hittar namn i ett specifikt format så ändrar den det. [surname, firstName] -> [firstName surname] */
        for (int i = 0; i < numOfNames; i++) {
            tempSubString = names[i].indexOf(", ");
            if(tempSubString != -1) {
                String temp = names[i].substring(tempSubString+2, names[i].length()) + " " + names[i].substring(0, tempSubString);
                names[i] = temp;
            }
            System.out.println(names[i]);
        }

        /***
         * MATLISTA
         */
        boolean matListFilled = false;
        String[] matList = new String[10];
        int items = 0;
        Scanner matInput = new Scanner(System.in);
        while(!matListFilled) {
            if(items < 10) {
                System.out.print("Add item to shopping list: " + (items+1) + " ");
                String tempString = matInput.nextLine();
                if(tempString.toLowerCase().equals("done")) {
                    matListFilled = true;
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + ". " + matList[i-1]);
                    }
                } else {
                    matList[items] = tempString;
                    if(items != 10) {
                        items++;
                    }
                }
            } else {
                for (int i = 1; i <= 10; i++) {
                System.out.println(i + ". " + matList[i-1]);
                }
                System.out.println("Too many items in shopping list, which item would you like to replace? 0 to exit");

                int matReplace = matInput.nextInt();
                if(matReplace == 0) {
                    matListFilled = true;
                } else {
                    matInput.nextLine();
                    String matTemp = matList[matReplace - 1];
                    System.out.print("Replace with: ");
                    matList[matReplace - 1] = matInput.nextLine();
                    System.out.println("Replaced \"" + matTemp + "\" with \"" + matList[matReplace - 1] + "\".");
                }
            }
        }
    }
}