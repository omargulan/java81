package TaskJunit;
public class BankAccount {

    private boolean isBlocked = false;
    private Integer amount;
    private String currency;

    private final String firstName;
    private final String secondName;

    public BankAccount(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    // TODO: Снятие денег
    public void withdraw(int amount) {
        // - счет не должен быть заблокированным
        if(isBlocked){
            throw new IllegalStateException("счет не должен быть заблокированным");
        }

        // - счет должен быть активированным
        if(this.amount==null){
            throw new IllegalStateException("счет должен быть активированным");
        }

        // - нельзя снять больше чем есть на балансе
        if(amount>this.amount){
            throw new IllegalStateException("Ваш баланс меньше нуля");
        }

        this.amount -= amount;
    }

    // TODO: Перевод средств
    public void transfer(BankAccount otherAccount, int amount) {
        // - счет не должен быть заблокированным
        // - счет должен быть активированным
        // - нельзя перевести больше чем есть на балансе
    }
    public void deposit(int amount) {
        // при пополнении:
        // - счет не должен быть заблокированным
        if (isBlocked) {
            throw new IllegalStateException("Счёт заблокирован.");
        }

        // - счет должен быть активированным
        if (this.amount == null) {
            throw new IllegalStateException("Счёт не активирован.");
        }

        // - нельзя пополнять на отрицательную сумму
        if (amount < 0) {
            throw new IllegalStateException("Нельзя пополнять на отрицательную сумму");
        }

        this.amount += amount;
    }

    public void block() {
        this.isBlocked = true;
    }

    public void activate(String currency) {
        this.amount = 0;
        this.currency = currency;
    }

    public Integer getAmount() {
        if (amount == null) {
            throw new IllegalStateException("Счёт не активирован.");
        }
        return this.amount;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public String[] getFullName() {
        return new String[]{firstName, secondName};
    }
}
