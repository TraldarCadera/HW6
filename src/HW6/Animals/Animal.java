package HW6.Animals;

abstract class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    abstract void run(int run);

    abstract void swim(int swim);
}
