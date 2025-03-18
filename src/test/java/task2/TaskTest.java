package task2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static task2.SearchTail.countAnimalsWithTail;

public class TaskTest {

    @Test
    public void searchTail() {
        Animal[] animals = {
                new Dog("Шарик",true),
                new Cat("Барсик", true),
                new Chimpanzee("Боня",false),
                new Gorilla("Даша",false)};

        int count = countAnimalsWithTail(animals);

        Assertions.assertThat(count).isEqualTo(2);
    }
}
