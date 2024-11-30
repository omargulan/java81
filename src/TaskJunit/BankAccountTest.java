package TaskJunit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void shouldNotBeLockedWhenWithdrow(){
        BankAccount account = new BankAccount("a", "b");
        account.block();
        final IllegalStateException ex = assertThrows(IllegalStateException.class, () -> account.withdraw(3));
        assertEquals("счет не должен быть заблокированным", ex.getMessage());

    }
    @Test
    void shouldBeActivetesWhenWithdraw(){
        BankAccount account = new BankAccount("a", "b");
        final IllegalStateException ex = assertThrows(IllegalStateException.class, () -> account.withdraw(3));
        assertEquals("счет должен быть активированным", ex.getMessage());


    }
    @Test
    void shouldNotBeWithdrawWhenLessAmount(){
        BankAccount account = new BankAccount("a", "b");
        account.activate("USD");
        account.deposit(2);
        final IllegalStateException ex = assertThrows(IllegalStateException.class, () -> account.withdraw(5));

    }

    @Test
    void shouldCreatAmountWhenActivatedAndisNotBlocked(){
        BankAccount account = new BankAccount("a", "b");
        account.activate("USD");
        account.deposit(500);
        account.withdraw(100);
        assertEquals(400, account.getAmount());
    }


    @Test
    void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("KZT");
        assertEquals(0, account.getAmount());
        assertEquals("KZT", account.getCurrency());
    }
    @Test
    public void shouldBeBlockedAfterBlockIsCalled(){
        BankAccount account = new BankAccount("a", "b");
        account.block();
        assertTrue(account.isBlocked());
    }
    @Test
    public void shouldReturnFirstNameThenSecondName(){
        BankAccount account = new BankAccount("a", "b");
        String[] str = {"a", "b"};
        assertArrayEquals(str, account.getFullName());
    }
    @Test
    public void shouldReturnNullAmountWhenNotActive(){
        BankAccount account = new BankAccount("a", "b");
        assertNull( account.getCurrency());
        assertThrows(IllegalStateException.class,()-> account.getAmount());
    }
}
