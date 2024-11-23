package structure;

public class StructureMain {
    public static void main(String[] args) {
        Employee leon = new Employee("Leon", 800);
        Worker bill = new Worker("Bill", 1700, 900);
        Worker mark = new Worker("Mark", 1500, 1200);
        Intern max = new Intern("Maks", 900, 30);
        Intern mike = new Intern("Mike", 500, 90);

        Employee[] employees = new Employee[]{leon, bill, mark, max, mike};

        Manager sam = new Manager("Sam", 3000, 1000, employees);

        int total =0;
        int totalBonus = 0;
        int sumIncome=0;
        int count = employees.length;
        int countIntern=0;
        for (int i = 0; i<employees.length; i++) {
            if(!(employees[i] instanceof Intern intern)){
                sumIncome+=employees[i].getIncome();
            }
            if (employees[i] instanceof Worker worker) {
                totalBonus += worker.getBonus();
            } if (employees[i] instanceof Intern intern){
                //sumIncome=sumIncome - intern.getIncome();
                countIntern++;
            }
        }
        count =count - countIntern;
        /*for (Employee employee:employees){
            if (employee instanceof Intern intern){

            }
            if(employee instanceof Worker worker){
                totalBonus+= worker.getBonus();

            }else(){
                total+=employee.getIncome();

            }
        }*/
        //System.out.println(max.getIncome());
        System.out.println("Сумма дохода: " + sumIncome);
        System.out.println("Сумма бонусов: " + totalBonus);
        int averageIncome = (sumIncome+totalBonus)/count;
        System.out.println("Средняя сумма: " + averageIncome);
        System.out.println("Кол-во интернов: " + sam.interCount(employees));




    }
}
