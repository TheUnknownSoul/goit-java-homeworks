package task2;


import org.io.task2.UserJsonWriter;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonWriterTest {
    String pathToFile = System.getProperty("user.dir") + "/goit-io-homework/src/main/java/org/io/files/users.json";
    @Test
    public void fileExistsTest(){
        UserJsonWriter.userToJson();
        File file = new File(pathToFile);
        assertTrue(file.exists() & !file.isDirectory());
    }
}
