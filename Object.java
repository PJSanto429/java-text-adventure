import java.util.ArrayList;

public class Object {
    private static ArrayList<Object> instances = new ArrayList<Object>();

    private String name;
    private String longName;
    private String description;

    private Boolean isTakeable;
    private Boolean inInventory;
    // private Room room; // this is what room the item is in // not being used yet

    public static ArrayList<Object> getInstances() {
        return instances;
    }

    public Object() {}

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

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getLongName() {
        return longName;
    }
    public void setLongName(String newLongName) {
        longName = newLongName;
    }

    public String getDescription() {
        return description;
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
