//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
// Define the Dog class
class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class javaq2 {
    public static void main(String[] args) {
        // Create two instances of the Dog class and set their attributes using constructors
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Print initial values
        System.out.println("Initial values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify attributes using setter methods
        dog1.setName("Rocky");
        dog2.setBreed("Labrador");

        // Print updated values
        System.out.println("\nUpdated values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}

