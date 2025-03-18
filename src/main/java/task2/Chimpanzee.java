package task2;

public class Chimpanzee extends Animal {
    public Chimpanzee(String name) {
        super(name);
    }

    @Override
    public boolean hasTail() {
        return false;
    }
}
