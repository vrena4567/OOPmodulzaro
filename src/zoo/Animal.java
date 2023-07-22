package zoo;

public abstract class Animal {
    String name;
    int age;
    Type type;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
    }

    public Type getType() {
        return type;
    }
}
