package HW6.Animals;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int swim) {
        if (swim > 10) {
            System.out.println(name + " не сможет столько проплыть!");
        }
        else {
            System.out.println(name + " проплыл " + swim + " метров.");
        }
    }

    @Override
    public void run(int run) {
        if (run > 500) {
            System.out.println(name + " не сможет столько пробежать!");
        } else {
            System.out.println(name + " пробежал " + run + " метров.");
        }
    }
}
