package TaskJunit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {
    // TODO: написать тест
    //  1. создать одного пользователя, и проверить что размер равен единице
    //  2. создать двух пользователей, и проверить что размер равен двум
    //  3. создать двух пользователей, очистить список, и проверить что размер равен 0
    UserManager userManager;
    @BeforeEach
    void beforEach(){
        userManager=new UserManager();
    }

    @Test
    void shouldBeOneValueAfterCreatedUser(){
        userManager.addUser("a");
        assertEquals(1, userManager.getUsers().size());
    }
    @Test
    void shouldBeTwoValueAfterCreatedUser(){
        userManager.addUser("a");
        userManager.addUser("b");
        assertEquals(2, userManager.getUsers().size());
    }
    @Test
    void shouldBeZeroAfterClearUser(){
        userManager.addUser("a");
        userManager.addUser("b");
        userManager.clearUsers();
        assertEquals(0, userManager.getUsers().size());
    }
}
