package structure;

public class Employee {
    private String name;
    private int income;
    public Employee(String name, int income){
        this.name=name;
        this.income=income;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getIncome(){
        return income;
    }
    public void setIncome (int income){
        this.income = income;
    }
}
