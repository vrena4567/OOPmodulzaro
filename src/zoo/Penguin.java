package zoo;

public class Penguin extends Animal implements Oviparous{
    public Penguin(String name, int age) {
        super(name, age);
        super.type = Type.BIRDS;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("*motorindítóhangok*");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipus=" + type +
                '}';
    }
}
