package zoo;

public class Cat extends Animal implements Vivipaorus{

    public Cat(String name, int age) {
        super(name, age);
        super.type = Type.MAMMAL;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Purr");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipus=" + type +
                '}';
    }
}
