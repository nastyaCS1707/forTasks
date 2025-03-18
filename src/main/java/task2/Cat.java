package task2;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean hasTail() {
        return true;
    }
}
