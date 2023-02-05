import org.junit.jupiter.api.Test;
import org.web.RequestSender;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RequestSenderTest {

    private final RequestSender sender = new RequestSender();

    @Test
    public void isUserCreatedTest(){
        boolean userCreated = sender.isUserCreated();
        assertTrue(userCreated);
    }
    @Test
    public void isUserUpdated(){
        boolean userUpdated = sender.isUserUpdated();
        assertTrue(userUpdated);
    }

    @Test
    public void isUserDeletedTest(){
        boolean userDeleted = sender.isUserDeleted();
        assertTrue(userDeleted);
    }

    @Test
    public void isGettingUsersTest(){
        boolean gettingUsers = sender.isGettingUsers();
        assertTrue(gettingUsers);
    }

    @Test
    public void isGettingUserById(){
        boolean gettingUserById = sender.isGettingUserById();
        assertTrue(gettingUserById);
    }

    @Test
    public void isGettingUserByUsernameTest(){
        boolean gettingUserByUsername = sender.isGettingUserByUsername();
        assertTrue(gettingUserByUsername);
    }

    @Test
    public void isGettingCommetsAndWriteInToFileTest(){
        boolean gettingCommetsAndWriteInToFile = sender.isGettingCommetsAndWriteInToFile();
        assertTrue(gettingCommetsAndWriteInToFile);
    }

    @Test
    public void isGettingLastCommetAndWriteInToFile(){
        boolean gettingLastCommetAndWriteInToFile = sender.isGettingLastCommetAndWriteInToFile();
        assertTrue(gettingLastCommetAndWriteInToFile);
    }

    @Test
    public void isGettingUncomplitedTasksTest(){
        boolean gettingUncomplitedTasks = sender.isGettingIncomplitedTasks();
        assertTrue(gettingUncomplitedTasks);
    }
}
