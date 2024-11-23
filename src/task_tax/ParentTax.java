package task_tax;

public class ParentTax {
    private int valueTax;
    public ParentTax(int valueTax){
        this.valueTax=valueTax;
    }

    public double getValueTax() {
        return (double) valueTax/100;
    }

    public void setValueTax(int valueTax) {
        this.valueTax = valueTax;
    }
}
