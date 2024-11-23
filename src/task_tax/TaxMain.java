package task_tax;

public class TaxMain {
    public static void main(String[] args) {
        Simplefied simplefied = new Simplefied(3);
        Common common = new Common(10);
        Patent patent = new Patent(1);

        Company runtime = new Company("Runtime", 20_400_000, simplefied);
        Company arta = new Company("Arta", 90_000_000, common);
        Company john = new Company("John", 7_500_000, patent);
        Company deer = new Company("Deer", 7_500_000, patent); //26.05.2024

/*        Company[] companies = new Company[]{runtime, arta, john, deer};
        for (Company company : companies){
            System.out.println(company.getName());
            System.out.println("- Сумма после вычета ИПН: " + company.getAmountAfterTax());
            System.out.println(" - Размер ИПН: " + company.getTaxAmount());
        }*/

        System.out.println(deer.equals(john));
        System.out.println(deer.hashCode()==john.hashCode());

    }
}
