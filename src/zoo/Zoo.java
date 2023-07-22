package zoo;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> allatkertLista = new ArrayList<>();

    public void addAnimalToList(Animal animal) {
        allatkertLista.add(animal);
    }

    public void listAnimals() {
        System.out.println("The list of the Zoo: ");
        for (Animal actual : allatkertLista) {
            System.out.println("- " + actual);
        }
    }

    public void removeAnimal(Animal animal) {
        System.out.println("Sad to say goodbye from: " + animal);
        allatkertLista.remove(animal);
    }

    public List<Animal> listMammals() {
        System.out.println("Mammals in the zoo: ");
        List<Animal> result = new ArrayList<>();
        for (Animal actualAnimal : allatkertLista) {
            if (actualAnimal.getType().equals(Type.MAMMAL)) {
                result.add(actualAnimal);
            }
        }
        return result;
    }

    public List<Animal> listBirds() {
        System.out.println("Birds in the zoo: ");
        List<Animal> result = new ArrayList<>();
        for (Animal actualAnimal : allatkertLista) {
            if (actualAnimal.getType().equals(Type.BIRDS)) {
                result.add(actualAnimal);
            }
        }
        return result;
    }

    public List<Animal> listReptile() {
        System.out.println("Reptiles in the zoo: ");
        List<Animal> result = new ArrayList<>();
        for (Animal actualAnimal : allatkertLista) {
            if (actualAnimal.getType().equals(Type.REPTILE)) {
                result.add(actualAnimal);
            }
        }
        return result;
    }
}
