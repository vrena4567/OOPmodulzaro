package zoo;

public class Snake extends Animal implements Oviparous {
    public Snake(String name, int age) {
        super(name, age);
        super.type = Type.REPTILE;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Sz-sz-ssssz");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipus=" + type +
                '}';
    }
}
