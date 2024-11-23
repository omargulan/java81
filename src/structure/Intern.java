package structure;

public class Intern extends Employee{
    private int days;
    public Intern(String name, int income, int days) {
        super(name, income);
        this.days =days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
