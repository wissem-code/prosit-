import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class Zoo {

    public static final int NBR_CAGES = 3;

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.nbrAnimals = 0;
    }


    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Invalid age for " + animal.getName() + " : " + animal.getAge());
        }
        if (nbrAnimals == NBR_CAGES) {
            throw new ZooFullException("The zoo " + name + " is full, cannot add " + animal.getName());
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    @Override
    public String toString() {
        return "Zoo{name=" + name + ", city=" + city + ", nbrCages=" + NBR_CAGES + ", nbrAnimals=" + nbrAnimals + "}";
    }
}
