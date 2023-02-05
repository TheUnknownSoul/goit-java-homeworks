# Task 1

```java
import java.util.*;

public class MoonComputerTests {
    public void testBasicOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicOutput();
    }
}
```

# Task 2

```java
import java.util.*;

public class MoonComputerTests {
    public void testBasicOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;
        System.out.println(sum + " " + sub + " " + multiply + " " + divide);
    }

    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicOutput();
        computerTests.testMath();
    }
}
```

# Task 3

```java
import java.util.*;

public class MoonComputerTests {
    public void testBasicOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;
        System.out.println(sum + " " + sub + " " + multiply + " " + divide);
    }

    public void testLogicOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean first = scanner.nextBoolean();
        boolean second = scanner.nextBoolean();
        boolean third = scanner.nextBoolean();
        if (first & second & third) {
            System.out.println("true true");
        }
        if (first ^ second | third) {
            System.out.println("false true");
        }
        if (!first & !second & !third) {
            System.out.println("false false");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicOutput();
        computerTests.testMath();
        computerTests.testLogicOperators();
    }
}
```

# Task 4

```java
import java.util.*;

public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        int marsianAge = scanner.nextInt();
        System.out.println(name + " " + surname + " " + marsianAge);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(marsianAge);
        scanner.close();
    }
}
```

# Task 5

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public static void main(String[] args) {
        String array = new HakerCity().createEmptyArray();
        System.out.println(Arrays.toString(array));
    }
}
```

# Task 6

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public static void main(String[] args) {
        int[] ageArray = new HakerCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));
    }
}
```

# Task 7

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public static void main(String[] args) {

    }
}
```

# Task 8

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String lastAndFirstTogether(String[] names) {
        return names[0] + " AND" + names[9] + " TOGETHER";
    }

    public static void main(String[] args) {

    }
}
```

# Task 9

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String lastAndFirstTogether(String[] names) {
        return names[0] + " AND" + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public static void main(String[] args) {

    }
}
```

# Task 10

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String lastAndFirstTogether(String[] names) {
        return names[0] + " AND" + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[]{
                results[2],
                results[3],
                results[4]
        };
    }

    public static void main(String[] args) {

    }
}
```

# Task 11

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String lastAndFirstTogether(String[] names) {
        return names[0] + " AND" + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[]{
                results[2],
                results[3],
                results[4]
        };
    }

    public char[] createKeyboard() {
        return new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'},
        };
    }

    public static void main(String[] args) {

    }
}
```

# Task 12

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String lastAndFirstTogether(String[] names) {
        return names[0] + " AND" + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[]{
                results[2],
                results[3],
                results[4]
        };
    }

    public char[] createKeyboard() {
        return new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'},
        };
    }

    public void printKeyboard() {
        char[] keyboard = createKeyboard();
        System.out.println(Arrays.toString(keyboard[0]));
        System.out.println(Arrays.toString(keyboard[1]));
        System.out.println(Arrays.toString(keyboard[2]));
        System.out.println(Arrays.toString(keyboard[3]));
    }

    public static void main(String[] args) {

    }
}
```

# Task 13

```java
import java.util.*;

public class HakerCity {
    public String[] createEmptyArray() {
        return new String() {
        };
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String lastAndFirstTogether(String[] names) {
        return names[0] + " AND" + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[]{
                results[2],
                results[3],
                results[4]
        };
    }

    public char[] createKeyboard() {
        return new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'},
        };
    }

    public void printKeyboard() {
        char[] keyboard = createKeyboard();
        System.out.println(Arrays.toString(keyboard[0]));
        System.out.println(Arrays.toString(keyboard[1]));
        System.out.println(Arrays.toString(keyboard[2]));
        System.out.println(Arrays.toString(keyboard[3]));
    }

    public String[] makeCopy(String[] names) {
        String[] copy = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return copy;
    }

    public static void main(String[] args) {

    }
}
```

# Task 14

```java

public class HakerDataMaker {
    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age " + age + ", planet " + planet;
    }

    public String[] aggregateAll(String[] names, String[] ages, String[] planets) {
        String first_array = aggregateSingle(names[0], ages[0], planets[0]);
        String second_array = aggregateSingle(names[1], ages[1], planets[1]);
        String third_array = aggregateSingle(names[2], ages[2], planets[2]);
        return new String[]{first_array, second_array, third_array};
    }
}
```

# Task 15

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 16

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 17

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 18

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        return price * count;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 19

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        return price * count;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;
        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 20

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        return price * count;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;
        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }
        int extraDistance = distance - 20;
        return 1000 + extraDistance * 5;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 21

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        return price * count;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;
        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }
        int extraDistance = distance - 20;
        return 1000 + extraDistance * 5;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 22

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        return price * count;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;
        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }
        int extraDistance = distance - 20;
        return 1000 + extraDistance * 5;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip();
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
    }
}
```

# Task 22

```java

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", " Mars", "Jupiter"};
        } else if (galaxy.equals("DanderBander")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth > 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        return price * count;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;
        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }
        int extraDistance = distance - 20;
        return 1000 + extraDistance * 5;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip();
    }

    public boolean isHangarOk(int side1, int side2, int price) {
        int sqrt_metr = price / (side1 * side2);
        if (sqrt_metr > 1000) {
            return false;
        }
        if (side1 * side2 < 1500) {
            return false;
        }
        if (side1 > (side2 * 2) | side2 > (side1 * 2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
```

# Task 24

```java
public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        double determinant = b * b - 4 * a * c;
        double root1 = 0.0, root2 = 0.0;
        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant) / (2 * a));
            root2 = (-b - Math.sqrt(determinant) / (2 * a));
        } else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
        }
        if (root1 == 0 & root2 == 0) {
            return new double[]{};
        }
        if (root1 == root2) {
            return new double[]{root1};
        }
        return new double[]{root1, root2};

    }
}
```

# Task 25

```java
public class CaptainDispute {
    public String evenOrOdd(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}
```

# Task 26

```java
public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int a = triple[0];
        int b = triple[1];
        int c = triple[2];
        int temp = Math.max(a, b);
        return Math.min(temp, c);
    }
}
```

# Task 27

```java
public class NumberTranslator {
    public int translate(String romanNumber) {
        String number = romanNumber.strip().trim();
        switch (number) {
            case "i":
                return 1;
            case "I":
                return 1;
            case "ii":
                return 2;
            case "II":
                return 2;
            case "iii":
                return 3;
            case "III":
                return 3;
            case "iv":
                return 4;
            case "IV":
                return 4;
            case "v":
                return 5;
            case "V":
                return 5;
            case "vi":
                return 6;
            case "VI":
                return 6;
            case "vii":
                return 7;
            case "VII":
                return 7;
            case "viii":
                return 8;
            case "VIII":
                return 8;
            case "ix":
                return 9;
            case "IX":
                return 9;
            case "x":
                return 10;
            case "X":
                return 10;
        }
        return -1;
    }
}
```
