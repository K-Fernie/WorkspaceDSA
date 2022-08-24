import javax.xml.namespace.QName;

public class Dog extends Animal{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void animalSound() {
        System.out.println("The dog goes: 'Bark'");
    }
}
