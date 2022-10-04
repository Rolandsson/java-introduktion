import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Hello world!");
        boolean runMain = true;
        int excercies = -1;
        while(runMain) {
            System.out.println("1. In och utmatning med konsolen, uppgift 1");
            System.out.println("2. In och utmatning med konsolen, uppgift 2");
            System.out.println("3. Villkorssatser, uppgift 1");
            System.out.println("4. Villkorssatser, uppgift 2");
            System.out.println("5. Villkorssatser, uppgift 3");
            System.out.println("6. Villkorssatser, uppgift 4");
            System.out.println("7. Villkorssatser, uppgift 5");
            System.out.println("Choose what excercies you want to run: (Or exit with 0)");
            excercies = choice.nextInt();
            choice.nextLine();
            switch(excercies) {
                case 1:
                    System.out.println("Type in your name: ");
                    String name = choice.nextLine();
                    System.out.println(name);
                    System.out.println("Hey " + name);
                    System.out.println(name + " is a beautiful name");
                    break;
                case 2:
                    System.out.println("Type in your name: ");
                    String nameAgain = choice.nextLine();
                    System.out.println("Type in your adress: ");
                    String adress = choice.nextLine();
                    System.out.println("Type in your phone number: ");
                    String phone = choice.nextLine();
                    System.out.println("Name: " + nameAgain + "\n" + "Adress: " + adress + "\n" + "Phone number: " + phone);
                    break;
                case 3:
                    double sum = 0;
                    //Famn (längdmått till sjöss). En svensk famn är 6 fot = 3 alnar = 1,78 meter.
                    System.out.print("Type a length in famnar: ");
                    double calcFamnar = choice.nextDouble();
                    choice.nextLine();
                    //Aln 1 aln = 2 fot = 4 kvarter = 59,4 cm.
                    System.out.println("Alnar: ");
                    double calcAlnar = choice.nextDouble();
                    choice.nextLine();
                    //Tum 1 tum = 1/24 aln = 1/12 fot = 1/6 kvarter = 2,54 cm, indelat i 12 verklinjer.
                    System.out.println("Tum: ");
                    double calcTum = choice.nextDouble();
                    choice.nextLine();
                    //Fot 6 fot = 1 famn, 1 fot = 1/2 aln = 2 kvarter = 12 tum (verktum) = 29,69 cm.
                    System.out.println("Fot: ");
                    double calcFot = choice.nextDouble();
                    choice.nextLine();
                    sum = (calcFamnar * 1780) + (calcAlnar * 59.4) + (calcTum * 2.54) + (calcFot * 29.69);
                    System.out.println("That converts to " + sum + "cm.");
                    break;
                case 4:
                    System.out.println("Check if a year is a leap year?\nType year:");
                    int year = choice.nextInt();
                    choice.nextLine();
                    if(year % 4 == 0) {
                        System.out.println("The year " + year + " is a leap year!");
                    } else {
                        System.out.println("I'm sorry, the year " + year + " is not a leap year!");
                    }
                    break;
                case 5:
                    String personNummer;
                    System.out.println("Skriv personnummer: (10 siffror, inget bindestreck)");
                    int sumCheck = 0;
                    int lastDigit = 0;
                    personNummer = choice.nextLine();
                    long checkPersonNummer = Long.parseLong(personNummer);
                    if(checkPersonNummer < 9912319999L && checkPersonNummer > 0001010000L) {
                        for (int i = 0; i < personNummer.length() - 1; i++) {
                            int number = Integer.parseInt(String.valueOf(personNummer.charAt(i)));
                            if(i % 2 == 0) {
                                number = number * 2;
                            }
                            number = (number + number/10) % 10;
                            sumCheck += number;
                        }
                        lastDigit = (10 - (sumCheck % 10)) % 10;
                        if(lastDigit == Integer.parseInt(String.valueOf(personNummer.charAt(9)))) {
                            System.out.println("Person nummer stämmer!");
                        } else {
                            System.out.println("Something went wrong!");
                        }
                    } else {
                        System.out.println("Error! Try again.");
                    }
                    break;
                case 6:
                    for (int i = 1; i <= 100; i++) {
                        if(i % 3 == 0 && i % 5 == 0){
                            System.out.println(i + " - FizzBuzz");
                        } else if (i % 5 == 0) {
                            System.out.println(i + " - Buzz");
                        } else if (i % 3 == 0) {
                            System.out.println(i + " - Fizz");
                        }
                    }
                    break;
                case 7:
                    boolean gameLoop = true;
                    int gameTries = 0;
                    int gameChoice;
                    System.out.println("Would you like to play a game?");
                    System.out.println("Type 1 for easy, 2 for medium, 3 for hard.");
                    int gameChoiceDifficulty = choice.nextInt();
                    int[] gameLevels = {10, 100, 1000};
                    choice.nextLine();
                    int gameRandomWinner = 1;
                    Random gameRand = new Random();
                    switch (gameChoiceDifficulty) {
                        case 1 -> gameRandomWinner += gameRand.nextInt(gameLevels[0]);
                        case 2 -> gameRandomWinner += gameRand.nextInt(gameLevels[1]);
                        case 3 -> gameRandomWinner += gameRand.nextInt(gameLevels[2]);
                        default -> gameLoop = false;
                    }
                    if(gameLoop) { System.out.println("A number has been chosen between 1 and " + gameLevels[gameChoiceDifficulty - 1] + ", try and guess: (0 to give up)"); }
                    while(gameLoop) {
                        gameTries++;
                        gameChoice = choice.nextInt();
                        choice.nextLine();
                        if(gameChoice == gameRandomWinner) {
                            if(gameTries > 1) {
                                System.out.println("You've guessed correct! It took you: " + gameTries + " tries.");
                            } else {
                                System.out.println("You're incredible, it only took you 1 try!!!");
                            }
                            gameLoop = false;
                        } else if(gameChoice > gameRandomWinner) {
                            System.out.println("You guessed to high! Try again.");
                        } else if (gameChoice < gameRandomWinner && gameChoice > 0) {
                            System.out.println("You guessed to low! Try again.");
                        } else {
                            System.out.println("You gave up, you tried guessing " + gameTries + " time(s). Correct answer was: " + gameRandomWinner);
                            gameLoop = false;
                        }
                    }
                    break;
                case 0:
                    runMain = false;
                    break;
            }
            excercies = -1;
        }
    }
}
