package task2;

public class Gorilla extends Animal {
    public Gorilla(String name) {
        super(name);
    }

    @Override
    public boolean hasTail() {
        return false;
    }
}
