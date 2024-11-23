package structure;

public class StructureMain2 {

    public static void main(String[] args) {
        Employee leon = new Employee("Leon", 800);
        Worker bill = new Worker("Bill", 1700, 900);
        Worker mark = new Worker("Mark", 1500, 1200);
        Intern max = new Intern("Maks", 900, 30);
        Intern mike = new Intern("Mike", 500, 90);
        Manager sam = new Manager("Sam", 3000, 1000, new Employee[0]);

        Employee[] employees = new Employee[]{leon, bill, mark, max, mike, sam};

        // Вывести общий доход каждого сотрудника из массива employees по следующей форме расчёта:
        // * `Employee` -> income.
        // * `Worker` -> income + bonus.
        // * `Manager` -> (income + bonus) + 15%.

        // Leon: 800
        // Bill: 2600
        // Mark: 2700
        // ...
        int sumWithBonus = 0;
        double sumManager = 0;
        for (int i = 0; i< employees.length; i++){
            if(employees[i] instanceof  Employee){
                System.out.println("Имя: " + employees[i].getName() + "  Общ. доход: " + employees[i].getIncome());
                if (employees[i] instanceof Worker worker){
                    //sumWorkerBonus+= worker.getBonus();
                    //employees[i].setIncome(employees[i].getIncome()+ worker.getBonus());
                    sumWithBonus = employees[i].getIncome() + worker.getBonus();
                    System.out.println("Имя: " + employees[i].getName() + "  Общ. доход: " + sumWithBonus);
                    if (employees[i] instanceof Manager Worker) {
                        sumManager  = (employees[i].getIncome()+ worker.getBonus())+(employees[i].getIncome()+ worker.getBonus())*15/100d;

                    }
            }


            //employees[i].setIncome((employees[i].getIncome()+ manager.getBonus())+(employees[i].getIncome()+ manager.getBonus())*15/100);
                System.out.println("Имя: " + employees[i].getName() + "  Общ. доход: " + sumWithBonus + " " + sumManager);
            }



        }
        //System.out.println(sumWorker);


    }
}
