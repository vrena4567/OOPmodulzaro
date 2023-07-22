package zoo;

public class Eagle extends Animal implements Oviparous, Flyable {
    public Eagle(String name, int age) {
        super(name, age);
        super.type = Type.BIRDS;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Víííí");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipus=" + type +
                '}';
    }
}
