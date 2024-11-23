package hash_equals;

import java.util.Objects;

public class Human {
    private String city;
    private String name;
    private int age;

    public Human(String city, String name, int age){
        this.city=city;
        this.name=name;
        this.age=age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.city, this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return this.city.equals(human.city);
    }


}
