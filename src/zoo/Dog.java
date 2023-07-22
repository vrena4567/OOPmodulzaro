package zoo;

public class Dog extends Animal implements Vivipaorus {
    public Dog(String name, int age) {
        super(name, age);
        super.type = Type.MAMMAL;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Wuff");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
