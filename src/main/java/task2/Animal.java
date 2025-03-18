package task2;

abstract class Animal {
    private String name;
    private boolean tail;

    public Animal(String name, boolean tail) {
        this.name = name;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
