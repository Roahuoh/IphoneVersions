import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Phone which contains the basic properties for a phone
abstract class Phone {
    String model;
    String storage;
    String color;

    // Abstract method which will be implemented in subclasses
    abstract void displayDetails();
}

// Subclass iPhone which inherits from Phone class
class iPhone extends Phone {
    String version;
    String camera;
    String processor;
    String battery;
    String display;

    // Constructor for iPhone class which initializes the properties
    iPhone(String model, String storage, String color, String version, String camera, String processor, String battery,
           String display) {
        this.model = model;
        this.storage = storage;
        this.color = color;
        this.version = version;
        this.camera = camera;
        this.processor = processor;
        this.battery = battery;
        this.display = display;
    }

    // Overriding the displayDetails method to display the properties of iPhone
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage);
        System.out.println("Color: " + color);
        System.out.println("Version: " + version);
        System.out.println("Camera: " + camera);
        System.out.println("Processor: " + processor);
        System.out.println("Battery: " + battery);
        System.out.println("Display: " + display);
    }
}

public class IPhoneVersions {
    public static void main(String[] args) {
        // Creating an ArrayList of iPhone objects
        ArrayList<iPhone> iphones = new ArrayList<>();
        iphones.add(new iPhone("iPhone 12", "128GB", "Black", "A2403", "12MP dual camera", "A14 Bionic chip", "2815mAh",
                "6.1-inch Super Retina XDR display"));
        iphones.add(new iPhone("iPhone 12 Pro", "512GB", "Gold", "A2407", "12MP triple camera", "A14 Bionic chip",
                "2815mAh", "6.1-inch Super Retina XDR display"));
        iphones.add(new iPhone("iPhone 12 Pro Max", "256GB", "Silver", "A2410", "12MP triple camera", "A14 Bionic chip",
                "3687mAh", "6.7-inch Super Retina XDR display"));

        // Print the menu of available phones

        for (int i = 0; i < iphones.size(); i++) {
            System.out.println((i + 1) + ". " + iphones.get(i).model);
        }
        // Take input from user
        System.out.print("Select a phone: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("---------------------");
        // Display the details of the selected phone based on user's input
        switch (choice) {
            case 1 -> iphones.get(0).displayDetails();
            case 2 -> iphones.get(1).displayDetails();
            case 3 -> iphones.get(2).displayDetails();
            default -> System.out.println("Invalid choice!");
        }
    }
}
