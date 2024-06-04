// Un comments all variable to specify the mammal , bird and reptile
package Assingment;


class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }
}
// Mammal
class Mammal extends Animal {
    private String skinColor;

    public Mammal(String name, String species, int age) {
        super(name, species, age); // calling animal class constructor
//            this.skinColor = skinColor; // Setting skinColor only in mammal class because It belongs to mammal class
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
//            System.out.println("Mammal Fur Color: " );
    }
}
// Bird
class Bird extends Animal {
    private String featherColor;

    public Bird(String name, String species, int age) {
        super(name, species, age);
//            this.featherColor = featherColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
//            System.out.println("Bird Feather Color: " );
    }
}
// Reptile
class Reptile extends Animal {
    private String scaleType;

    public Reptile(String name, String species, int age) {
        super(name, species, age);
//            this.scaleType = scaleType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
//            System.out.println("Reptile Scale Type: " );
    }
}
//
// Example usage:
public class ZooExample {

    public static void main(String[] args) {
        Animal mammal = new Mammal("Tiger", "Mammal", 5);
        Animal bird = new Bird("Eagle", "Bird", 3 );
        Animal reptile = new Reptile("Snake", "Reptile", 2 );

        // Even though the Type of all three objects is Animal,
        // the displayInfo() method is called from respective child classes

        System.out.println("Mammal:");
        mammal.displayInfo();
        System.out.println("\nBird:");
        bird.displayInfo();
        System.out.println("\nReptile:");
        reptile.displayInfo();
    }


}
