import java.util.ArrayList;
import java.util.Scanner;

public class Object {
    private static ArrayList<Object> instances = new ArrayList<Object>();
    private static Scanner input = new Scanner(System.in);

    private String name;
    private String longName;
    private String description;

    private Boolean isTakeable;
    private Boolean inInventory;
    // private Room room; // this is what room the item is in // not being used yet

    // !--------------- thses are all the Object methods ------------------
    public static ArrayList<Object> getInstances() {
        return instances;
    }

    public static Object getByName(String nameToFind) {

        ArrayList<Object> items = new ArrayList<Object>();
        for (Object object : instances) {
            if (
                object.getName(true).equals(nameToFind) ||
                object.getLongName(true).equals(nameToFind)
            ) {
                items.add(object);
            }
        }

        if (items.size() == 1) {
            return items.get(0);
        } else if (items.size() > 1) {
            Helper.print("Which did you mean? ");

            for (Object o : items) {
                Helper.print(o.getLongName());
            }
            System.out.print(">> ");
            String choice = input.nextLine();

            try {
                // 
            } catch 
        }

        return null;
    }

    public static boolean takeObject(Object objectToTake) {
        if (objectToTake.getInInventory()) {
            Helper.print(objectToTake.getLongName(false) + " is already in your inventory");
        } else {
            if (!objectToTake.getIsTakeable()) {
                Helper.print("You are unable to pick up " + objectToTake.getLongName(false));
            } else {
                objectToTake.setInInventory(true);
                Helper.print("You have picked up " + objectToTake.getLongName(false));
            }
        }
        return false;
    }

    public static void seeInventory() {
        Helper.print("Your inventory consists of: ");
        for (Object object : instances) {
            Helper.print(object.getLongName(false));
        }
    }

    // *------------------ instance methods + constructor --------------------

    public Object(
        String nameToBe,
        String longNameToBe,
        String descriptionToBe,
        
        Boolean isTakeableToBe,
        Boolean inInventoryToBe
    ) {
        name = nameToBe;
        longName = longNameToBe;
        description = descriptionToBe;

        isTakeable = isTakeableToBe;
        inInventory = inInventoryToBe;

        instances.add(this);
    }

    public String getName(boolean forceLowercase) {
        if (forceLowercase) {
            return name.toLowerCase();
        }
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLongName(boolean forceLowercase) {
        if (forceLowercase) {
            return this.longName.toLowerCase();
        }
        return this.longName;
    }
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public Boolean getIsTakeable() {
        return isTakeable;
    }
    public void setIsTakeable(Boolean newIsTakeable) {
        isTakeable = newIsTakeable;
    }

    public Boolean getInInventory() {
        return inInventory;
    }
    public void setInInventory(Boolean newInInventory) {
        inInventory = newInInventory;
    }

    public void printData() {
        System.out.println(this.name + this.longName);
    }
}
