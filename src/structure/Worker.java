package structure;

public class Worker extends Employee{
    private int bonus;
    public Worker(String name, int income, int bonus){
        super(name, income);
        this.bonus= bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
