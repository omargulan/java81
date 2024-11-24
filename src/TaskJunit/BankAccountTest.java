package TaskJunit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

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
