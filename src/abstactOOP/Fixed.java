package abstactOOP;

public class Fixed extends Discount{
    @Override
    public int getDiscountAmount(int total) {
        return (int) (total*0.04);
    }

    public Fixed(String name) {
        super(name);
    }
}
