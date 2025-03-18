package task2;

public class SearchTail {
    static int countAnimalsWithTail(Animal[] animals) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.isTail()) {
                count++;
            }
        }
        return count;
    }
}
