package structure;

public class Manager extends Worker{
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Manager (String name, int income, int bonus, Employee[] employees){
        super(name, income, bonus);
        this.employees =employees;
    }

    public int interCount(Employee[] employees){
        int count =0;
        for (int i = 0; i<employees.length;i++){
            if (employees[i] instanceof Intern){
                count++;
            }
        }
        return count;
    }


}
