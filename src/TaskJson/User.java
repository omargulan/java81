package TaskJson;
public class User {
    private int id;
    private String name;
    private int age;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id, String name, int age, String lastname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
