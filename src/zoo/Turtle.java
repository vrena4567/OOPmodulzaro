package zoo;

public class Turtle extends Animal implements Oviparous {
    public Turtle(String name, int age) {
        super(name, age);
        super.type = Type.REPTILE;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Makes no sound apparetnly");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipus=" + type +
                '}';
    }
}
