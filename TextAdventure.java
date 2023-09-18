// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        createObjects();

        boolean running = true;
        while (running) {
            getInput(input);
        }

        input.close();
        // selectionSortTesting();
    }

    // public static void selectionSort(int[] elements) {
    //     int numCounter = 0;
    //     for (int j = 0; j < elements.length; j++) {
    //         int minIndex = 1;

    //         for (int a = j + 1; a < elements.length; a++) {
    //             numCounter++;
    //             if (elements[a] < elements[minIndex]) {
    //                 minIndex = a;
    //                 numCounter++;
    //             }
    //         }
    //         int temp = elements[j];
    //         elements[j] = elements[minIndex];
    //         elements[minIndex] = temp;
    //     }
    //     System.out.println("count amt ==> " + numCounter);
    //     System.out.println(elements.toString());
    // }

    // public static void selectionSortTesting() {
    //     int[] arr1 = {5, 3, 2, 1, 4};
    //     System.out.println(arr1.toString());
    //     selectionSort(arr1);
    // }

    public static void getInput(Scanner input) {
        System.out.print(">> ");

        String unParsedInputV1 = input.nextLine().toLowerCase();
        String[] parsedInputV1 = unParsedInputV1.split(" ");
        ArrayList<String> parsedInput = new ArrayList<String>();
        for (String word : parsedInputV1) {
            parsedInput.add(word);
        }

        if (parsedInput.get(0).equals("look")) {
            unParsedInputV1 = unParsedInputV1.replace("look", "").strip();
            unParsedInputV1 = unParsedInputV1.replace("at", "").strip();

            Object objectFound = Object.getByName(unParsedInputV1);
            if (objectFound != null) {
                Helper.print(objectFound.getDescription());
            } else {
                Helper.print("Hmmm, I can't see that.");
            }

        }
        else if (parsedInput.get(0).equals("take")) {
            // print("you are trying to take something");
            unParsedInputV1 = unParsedInputV1.replace("take", "").strip();
            // 

        } else
        if (parsedInput.get(0).equals("drop")) {
            Helper.print("dropping something");
        }
        else {
            Helper.print("Hmmm, I don't understand you");
        }
    }

    /*
     * creates all objects required for the game
     */
    public static void createObjects() {
        new Object("key", "Large Gold Key", "This is a large gold key", true, false);
        new Object("table", "Tiny Wooden Table", "This is a tiny wooden tabl where ethan gets beaten up on", false, false);
    }
}
