package org.io.task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    /**
     * Uses system property to get absolute path of user`s directory and concatenates with project file folder path.
     * Note that this path is correct for Linux-based operations systems. For Windows use \ slash.
     * After getting path read file line by line and validate it with regular expression.
     */
//    public static void printValidPhoneNumbers(String pathToFile) {
    public static void printValidPhoneNumbers() {
        String pathToFile = System.getProperty("user.dir") + "/goit-io-homework/src/main/java/org/io/files/phones.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Pattern phonePattern = Pattern.compile("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})");
                Matcher matcher = phonePattern.matcher(line);
                if (matcher.matches()) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find file " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
