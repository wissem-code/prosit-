public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean ismammal;

    public Animal(String family, String name, int age, boolean ismammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.ismammal = ismammal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{family=" + family + ", name=" + name + ", age=" + age + ", ismammal=" + ismammal + "}";
    }
}
