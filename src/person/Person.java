package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private final Gender gender;
    private String hobbies;
    private List<String> friends;
    private static int populationCounter;

    public Person(String name, int age, Gender gender, String hobbies, List<String> friends) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.friends = new ArrayList<>(friends);
        populationCounter++;
    }

    public static int getPopulation() {
        return populationCounter;
    }
    public void addFriends(Person person) {
        this.friends.add(person.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies='" + hobbies + '\'' +
                ", friends=" + friends +
                '}';
    }
}
