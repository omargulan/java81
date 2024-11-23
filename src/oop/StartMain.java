package oop;

public class StartMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 25);
        //person1.name = "Ivan";
        //person1.setName("Ivan");
        //person1.age = 25;
        //person1.setAge(25);
        Person person2 = new Person("Petr", 20);
        //person2.name="Petr";
        //person2.setName("Petr");
        //person2.age =20;
        //person2.setAge(20);
        Person person3 = new Person("Will", 30);
        //person3.name = "Will";
        //person3.setName("Will");
        //person3.age=30;
        //person3.setAge(30);


        /*
        City city = new City("Astana", new Person[]{person1, person2, person3});
        //city.name="Astana";
        //city.setName("Astana");
        //city.people = new Person[]{person1, person2, person3};
        //city.setPeople(new Person[]{person1, person2, person3});
        // city.people = new Person[]{};
        //int cityPeopleCount = City.people.length;
        System.out.println(city.getName());
//       for (int i = 0; i<city.people.length; i++){
//           System.out.println(city.people[i].name);
//
//        }

        //System.out.println("Кол-во соверш. " + city.adultCount());
        //System.out.println("Сред возрост " + city.averAge());
        System.out.println("Имя старшего " + city.maxAgeName());
        */

        City city = new City("Kokshetau");

        System.out.println(city.averAge());


    }
}
