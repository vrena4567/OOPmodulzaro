package person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person anna = new Person("Anna", 2, Gender.FEMALE, "barbik", List.of("Lea"));
        Person lea = new Person("Lea", 2, Gender.FEMALE, "autók", List.of("Polli"));
        System.out.println(Person.getPopulation());
        lea.addFriends(anna);
        System.out.println(lea.toString());
    }
}
