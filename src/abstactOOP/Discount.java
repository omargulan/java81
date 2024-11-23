package abstactOOP;

public abstract class Discount {
    private final String name;

    protected Discount(String name) {
        this.name = name;
    }
    public abstract int getDiscountAmount(int total);

    public String getName() {
        return name;
    }
}
