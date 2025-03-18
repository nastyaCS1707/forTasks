package task2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public boolean hasTail() {
        return true;
    }
}
