package Abc;

public class Contacts {
    private String name;
    private String number;
    private String group;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getGroup() {
        return group;
    }

    public Contacts(String name, String number, String group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }
}
