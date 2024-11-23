package Abc;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private String nama;
    private int age;
    private String CityName;

    public Human(String nama, int age, String CityName) {
        this.nama = nama;
        this.age = age;
        this.CityName = CityName;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }
}
