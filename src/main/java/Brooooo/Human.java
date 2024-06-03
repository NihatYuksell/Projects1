package Brooooo;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }    public String toString() {
        return "Human{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }

}
