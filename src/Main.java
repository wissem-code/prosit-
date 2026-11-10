import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("belvedere", "tunis");

        Animal lion = new Animal("cats", "lion", 5, true);
        Animal tiger = new Animal("cats", "tiger", 3, true);
        Animal eagle = new Animal("birds", "eagle", 2, false);
        Animal bear = new Animal("bears", "bear", 7, true);
        Animal snake = new Animal("reptiles", "snake", -1, false);

        Animal[] toAdd = {lion, snake, tiger, eagle, bear};

        for (Animal animal : toAdd) {
            try {
                zoo.addAnimal(animal);
                System.out.println(animal.getName() + " added.");
            } catch (ZooFullException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {

                System.out.println("Number of animals : " + zoo.getNbrAnimals());
            }
        }

        System.out.println(zoo);
    }
}
