package oop;

public class City {
    private String name;
    private Person[] people;
    public City(String name, Person[] people){
        this.name=name;
        this.people=people;
    }
    public City(String name){
        this.name=name;
        this.people= new Person[]{};
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Person[] getPeople(){
        return this.people;
    }
    public void setPeople(Person[] people)
    {
        this.people = people;

    }
    public int adultCount(){
        int sum = 0;
        for(int i=0; i<people.length; i++){
            if (people[i].getAge() <18){
                sum++;
            }
        }
        return sum;
    }
    public  int averAge(){
        if(people.length==0) {
            return 0;
        }
        int count = 0;
        int sumAge =0;
        for(int i=0; i<people.length; i++){
                sumAge=sumAge+people[i].getAge();
                count++;
        }
        return sumAge/count;
    }
    public String maxAgeName(){
        int maxAge = people[0].getAge();
        String nameMax= people[0].getName();
        for (int i = 1; i<people.length; i++){
            if (people[i].getAge()>maxAge){
                maxAge=people[i].getAge();
                nameMax = people[i].getName();
            }
        }
        return nameMax;
    }
}
