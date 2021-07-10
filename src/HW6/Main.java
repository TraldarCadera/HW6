package HW6;

import HW6.Animals.Cat;
import HW6.Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", "Белый", 5);
        Dog dog = new Dog("Bobik", "black", 3);

        dog.run(300);
        cat.run(300);

        dog.swim(5);
        cat.swim(5);
    }
}
