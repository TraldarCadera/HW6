package HW6;

// Импортируем кота и собаку
import HW6.Animals.Cat;
import HW6.Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "white", 5);
        Dog dog = new Dog("Bobik", "black", 4);

        dog.run(250);
        cat.run(350);

        dog.swim(6);
        cat.swim(3);
    }
}
