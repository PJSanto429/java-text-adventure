// import java.util.ArrayList;
import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // getInput();
        boolean running = true;
        while (running) {
            getInput(input);
        }

        // createObjects();
        // for (Object thing : Object.getInstances()) {
        //     thing.printData();
        // }

        input.close();
    }

    public static void getInput(Scanner input) {
        System.out.print(">> ");
        // String unparsedUserInput = input.nextLine();

        String[] parsedInput = input.nextLine().split(" ");
        
        if (parsedInput[0].equals("look")) {
            System.out.println("you are trying to look at something");
        } else 
        if (parsedInput[0].equals("take")) {
            System.out.println("you are trying to take something");
        } else
        if (parsedInput[0].equals("drop")) {
            System.out.println("dropping something");
        }
        else {
            System.out.println("Hmmm, I don't understand you");
        }
    }

    public static void handleLook(String fullInput) {
        // 
    }

    /*
     * creates all objects required for the game
     */
    public static void createObjects() {
        new Object("key", "Large Gold Key", "This is a large gold key", true, false);
        new Object("table", "Tiny Wooden Table", "This is a tiny wooden table", false, false);
    }
}
