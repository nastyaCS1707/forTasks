package task2;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean hasTail();
}
