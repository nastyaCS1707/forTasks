package task1;

import java.util.List;

public class User {
    private String name;
    private Integer age;
    private List <Documents> doc;


    public User(String name, Integer age,List <Documents> doc) {
        this.name = name;
        this.age = age;
        this.doc = doc;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public List<Documents> getDoc() {
        return doc;
    }

}
