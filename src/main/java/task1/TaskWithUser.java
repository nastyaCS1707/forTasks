package task1;

import com.github.javafaker.Faker;

import java.util.*;

public class TaskWithUser {
    private static Faker faker = new Faker(new Locale("ru"));

    public static String findDuplicate (List <User> users){
        for (int i = 0; i < users.size() - 1; i++) {
            for (int j = i + 1; j < users.size(); j++){
                if(users.get(i).getName().equals(users.get(j).getName()) && users.get(i).getAge().equals(users.get(j).getAge())){
                    return "haveDuplicate";
                }
            }
        }
        return "noDuplicate";
    }

    public static String findUserWithWhiskers (List <User> users){
        for (User user: users) {
            if(user.getDoc().contains(Documents.WHISKERS)){
                return "findUserWithWhiskers";
            }
        }return "noUserWithWhiskers";
    }
    public static List<User> createRandomUser (){
        Random random = new Random();
        List<User> randomUsers = new ArrayList<>();
        while (randomUsers.size() <100){
            randomUsers.add(new User(faker.name().firstName(),random.nextInt(100)));
        }
        return randomUsers;
    }

    public static User getJuniorUser (List <User> users) {
        User result = users.stream().filter(user -> user.getName().startsWith("В")).sorted(Comparator.comparingInt(u -> u.getAge())).findFirst().get();
        return result;
    }
}
