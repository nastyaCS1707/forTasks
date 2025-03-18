package task1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static task1.TaskWithUser.*;

public class TaskTest {
    List<User> users = new ArrayList<>();
    List<User> usersWithDoc = new ArrayList<>();


    @Test
    public void duplicateTest() {

        users.add(new User("Коля", 19));
        users.add(new User("Ваня", 15));
        users.add(new User("Саша", 22));
        users.add(new User("Ваня", 15));
        users.add(new User("Дима", 37));

        String result = findDuplicate(users);

        Assertions.assertThat(result).isEqualTo("haveDuplicate");
    }

    @Test
    public void noDuplicateTest() {
        users.add(new User("Коля", 19));
        users.add(new User("Ваня", 15));
        users.add(new User("Саша", 22));
        users.add(new User("Паша", 17));
        users.add(new User("Дима", 37));

        String result = findDuplicate(users);

        Assertions.assertThat(result).isEqualTo("noDuplicate");
    }

    @Test
    public void userWithWhiskers() {
        usersWithDoc.add(new User("name", 16, List.of(Documents.PAWS)));
        usersWithDoc.add(new User("name", 17, List.of(Documents.PAWS, Documents.TAIL, Documents.WHISKERS)));

        String result = findUserWithWhiskers(usersWithDoc);

        Assertions.assertThat(result).isEqualTo("findUserWithWhiskers");
    }

    @Test
    public void noUserWithWhiskers() {
        usersWithDoc.add(new User("name", 16, List.of(Documents.PAWS)));
        usersWithDoc.add(new User("name", 17, List.of(Documents.PAWS, Documents.TAIL)));

        String result = findUserWithWhiskers(usersWithDoc);

        Assertions.assertThat(result).isEqualTo("noUserWithWhiskers");
    }

    @Test
    public void createRandomUsersList() {
        List<User> randomUser = createRandomUser();
        for (User users : randomUser) {
            System.out.println(users.getName() + " - " + users.getAge());
        }

        Integer sizeList = randomUser.size();

        Assertions.assertThat(sizeList).isEqualTo(100);
    }

    @Test
    public void getJuniorUserWithB() {
        List<User> randomUser = createRandomUser();

        User result = getJuniorUser(randomUser);
        System.out.println(result.getName() + " - " + result.getAge());

        Assertions.assertThat(result.getName()).startsWith("В");
    }
}
