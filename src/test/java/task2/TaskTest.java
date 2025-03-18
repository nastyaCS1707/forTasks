package task2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static task2.SearchTail.countAnimalsWithTail;

public class TaskTest {

    @Test
    public void searchTail() {
        Animal[] animals = {
                new Dog("Шарик"),
                new Cat("Барсик"),
                new Chimpanzee("Боня"),
                new Gorilla("Даша")};

        int count = countAnimalsWithTail(animals);

        Assertions.assertThat(count).isEqualTo(2);
    }
}
