package task_tax;

import java.util.Objects;

public class Company {
    private String name;
    private int income;
    //type tax
    ParentTax tax;

    public Company(String name, int income, ParentTax tax) {
        this.name = name;
        this.income = income;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public double getAmountAfterTax() {

        return (int) (income - (income * 0.2d)) * tax.getValueTax();
    }

    public int getTaxAmount() {
        return (int) (income * 0.2d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAmountAfterTax(), this.income);
    }

    public boolean equals(Object obj) {
        //if (this == obj) {return true;}

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Company company = (Company) obj;
        if (this.getAmountAfterTax() == company.getAmountAfterTax() && this.income == company.income) {
            return true;
        } else {
            return false;
        }


    }
}