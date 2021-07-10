package HW6.Animals;

public class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int swim) {
        System.out.println("Коты не любят плавать!");
    }

    public void run(int run) {
        if (run >= 200) {
            System.out.println(name + " не может столько пробежать!");
        }
        else {
            System.out.println(name + " пробежал " + run + " метров.");
        }
    }
}
