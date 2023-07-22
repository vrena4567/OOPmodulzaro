package zoo;

public class Main {
    public static void main(String[] args) {
        Cat macska = new Cat("Macsek", 2);
        Cat garfield = new Cat("Garfield", 12);
        Dog nagyPiros = new Dog("Nem tudom a nevét", 3);
        Snake kigyo = new Snake("kígyó", 5);
        macska.makeSound();

        Zoo allatkert = new Zoo();
        allatkert.addAnimalToList(macska);
        allatkert.addAnimalToList(garfield);
        allatkert.addAnimalToList(nagyPiros);
        allatkert.addAnimalToList(kigyo);

        allatkert.listAnimals();
        allatkert.removeAnimal(macska);
        allatkert.listAnimals();
        System.out.println(macska.getType());
        System.out.println(allatkert.listMammals());
        System.out.println(allatkert.listReptile());
    }
}
