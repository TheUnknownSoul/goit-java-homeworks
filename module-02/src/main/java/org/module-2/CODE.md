# Task 1

```java
public class VarTask {
    public static void main(String[] args) {
        byte happyValue = 10;
        System.out.println("happyValue = " + happyValue);
    }
}
```

# Task 2

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
    }
}
```

# Task 3

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 168;
        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
    }
}
```

# Task 4

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 168;
        long longerThanLife = 2147483687L;
        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
        System.out.println("longerThanLife = " + longerThanLife);
    }
}
```

# Task 5

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 168;
        long longerThanLife = 2147483687L;
        float tooBigToFail = 1001f;
        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
        System.out.println("longerThanLife = " + longerThanLife);
        System.out.println("tooBigToFail = " + tooBigToFail);
    }
}
```

# Task 6

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 168;
        long longerThanLife = 2147483687L;
        float tooBigToFail = 1001f;
        double muchBigThanTooBig = -1.40129846432481707 - 47d;
        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
        System.out.println("longerThanLife = " + longerThanLife);
        System.out.println("tooBigToFail = " + tooBigToFail);

    }
}
```

# Task 7

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 168;
        long longerThanLife = 2147483687L;
        float tooBigToFail = 1001f;
        double muchBigThanTooBig = -1.40129846432481707 - 47d;
        char englishA = 'A';
        char anyRuLetter = 'ы';
        char codeName = 'F';
        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
        System.out.println("longerThanLife = " + longerThanLife);
        System.out.println("tooBigToFail = " + tooBigToFail);
        System.out.println("englishA = " + englishA);
        System.out.println("anyRuLetter = " + anyRuLetter);
        System.out.println("codeName = " + codeName);

    }
}
```

# Task 8

```java
public class VarTask {
    public static void main(String[] args) {

        byte happyValue = 10;
        short cold = -1;
        int globalAnswer = 42;
        int randomAnswer;
        randomAnswer = 168;
        long longerThanLife = 2147483687L;
        float tooBigToFail = 1001f;
        double muchBigThanTooBig = -1.40129846432481707 - 47d;
        char englishA = 'A';
        char anyRuLetter = 'ы';
        char codeName = 'F';
        boolean javaAfter20 = true;
        boolean javaOpposite = !javaAfter20;

        System.out.println("happyValue = " + happyValue);
        System.out.println("cold = " + cold);
        System.out.println("globalAnswer = " + globalAnswer);
        System.out.println("randomAnswer = " + randomAnswer);
        System.out.println("longerThanLife = " + longerThanLife);
        System.out.println("tooBigToFail = " + tooBigToFail);
        System.out.println("englishA = " + englishA);
        System.out.println("anyRuLetter = " + anyRuLetter);
        System.out.println("codeName = " + codeName);
        System.out.println("javaAfter20 = " + javaAfter20);
        System.out.println("javaOpposite = " + javaOpposite);

    }
}
```

# Task 9

```java
public class YearVariableTask {
    public static void main(String[] args) {
        byte allMonthCountButNotWinter = 9;
        short february1996DayCount = 26;
        int halfOfTotalSpringDayCount = 46;
        long yearSecondCount = 31536000;
        float quarterOfMayDayCount = 7.8f;
        double dayCountOfLongMonth = 217d;
        char springLetter = 'r';
        boolean isLeap1900 = false;
    }
}
```

# Task 10

```java
public class MathUtils {
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("math.sum(2,3) =" + math.sum(2, 3));
    }
}
```

# Task 11

```java
public class MathUtils {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int twice(float number) {
        return number / 0.5f;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("math.sum(2,3) =" + math.sum(2, 3));
        System.out.println("math.sub(2,3) =" + math.sub(2, 3));
        System.out.println("math.twice(7) =" + math.twice(7));
    }
}
```

# Task 12

```java
public class MathUtils {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int twice(float number) {
        return number / 0.5f;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("math.sum(2,3) =" + math.sum(2, 3));
        System.out.println("math.sub(2,3) =" + math.sub(2, 3));
        System.out.println("math.twice(7) =" + math.twice(7));
    }
}
```

# Task 13

```java
public class MathUtils {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int twice(float number) {
        return number / 0.5f;
    }

    public int twicedSum(int a, int b) {
        return sum(a, b) * 2;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("math.sum(2,3) =" + math.sum(2, 3));
        System.out.println("math.sub(2,3) =" + math.sub(2, 3));
        System.out.println("math.twice(7) =" + math.twice(7));
    }
}
```

# Task 14

```java
public class MarsCalculator {
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sub(int a, int b, int c) {
        return a - b - c;
    }

    public int multiply(int a, int b, int c) {
        return sum(a, b, c) * sub(a, b, c);
    }

    public int divide(int a, int b, int c) {
        return sum(a, b, c) / 10f;
    }

    public static void main(String[] args) {

    }
}
```

# Task 15

```java
public class Operations {
    public static void main(String[] args) {
        short shouldBeIncreased = 5;
        System.out.println(++shouldBeIncreased);
    }
}
```

# Task 16

```java
public class Operations {
    public static void main(String[] args) {
        short shouldBeIncreased = 5;
        shouldBeIncreased++;
        System.out.println(--shouldBeIncreased);
    }
}
```

# Task 17

```java
public class Counter {
    public long current(long number) {
        return number;
    }

    public long next(long number) {
        return ++number;
    }

    public long prev(long number) {
        return --number;
    }
}
```

# Task 18

```java
public class ScoreCounter {
    public int addScore(int currentScore, int amount) {
        return currentScore += amount;
    }

    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5));
    }
}
```

# Task 19

```java
public class ScoreCounter {
    public int addScore(int currentScore, int amount) {
        return currentScore += amount;
    }

    public int twiceScore(int currentScore) {
        return currentScore *= 2;
    }

    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5));
        System.out.println("twiceScore(7) = " + counter.twiceScore(7));
    }
}
```

# Task 20

```java
public class BrokenKeyboardCalculator {
    public int add(int a, int b) {
        return a += b;
    }

    public int sub(int a, int b) {
        return a -= b;
    }

    public int multiply(int a, int b) {
        return a *= b;
    }

    public int divide(int a, int b) {
        return a /= b;
    }
}
```

# Task 21

```java
public class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        if (number1 == number2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3));
    }
}
```

# Task 22

```java
public class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        if (number1 == number2) {
            return true;
        }
        return false;
    }

    public boolean areNumbersFatal(int first, int second) {
        if (first * 5 + 3 == second) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3));
        System.out.println("areNumbersFatal(3, 3) = " + helper.areNumbersFatal(1, 8));
    }
}
```

# Task 23

```java
public class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        if (number1 == number2) {
            return true;
        }
        return false;
    }

    public boolean areNumbersFatal(int first, int second) {
        if (first * 5 + 3 == second) {
            return true;
        }
        return false;
    }

    public boolean canPrincessMarry(int day) {
        if (day > 15) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3));
        System.out.println("areNumbersFatal(3, 3) = " + helper.areNumbersFatal(1, 8));
        System.out.println("canPrincessMarry(20) = " + helper.canPrincessMarry(20));
    }
}
```

# Task 24

```java
public class ProfShop {
    public boolean isPriceOk() {
        if (price != 1000) {
            return true;
        }
        return false;
    }

    public float calculateRegularDiscountPrice(float price) {
        return price * 0.9f;
    }

    public boolean isDiscount50(int price) {
        if (price * 4 == 1000) {
            return true;
        }
        return false;
    }

    public boolean isPriceHappy(int price, int year, int day) {
        if (price == year * day) {
            return true;
        }
        return false;
    }

}
```

# Task 25

```java
public class NumberTester {
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        NumberTester tester = NumberTester();
        System.out.println(tester.isEven(10));
    }
}
```

# Task 26

```java
public class NumberTester {
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        NumberTester tester = NumberTester();
        System.out.println(tester.isEven(10));
        System.out.println(tester.isOdd(10));
    }
}
```

# Task 27

```java
public class DigitSplitter {
    public int getFirstDigit(int number) {
        return number / 10;
    }

    public int getSecondDigit(int number) {
        return number % 10;
    }

}
```

# Task 28

```java
public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 | batteryPercent > 67;
    }

    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
    }
}
```

# Task 29

```java
public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 | batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight >= 150 & batteryPercent >= 90;
    }

    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));
    }
}
```

# Task 30

```java
public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 | batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight >= 150 & batteryPercent >= 90;
    }

    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        return isEngineWorking ^ isRobotStanding;
    }

    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));
        System.out.println("areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));
    }
}
```

# Task 31

```java
public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 | batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight >= 150 & batteryPercent >= 90;
    }

    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        return isEngineWorking ^ isRobotStanding;
    }

    public boolean shouldSleep(boolean isDayNow) {
        return !isDayNow;
    }

    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));
        System.out.println("areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));
        System.out.println("shouldSleep(true) = " + robot.shouldSleep(true));
    }
}
```

# Task 32

```java
public class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid & acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (density >= 1000 & density <= 5000) | (density >= 10000 & density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return isAcidOk(acidValue, minAcid, maxAcid) & isDensityOk(density) & isTemperatureOk(cold);
    }
}
```

# Task 33

```java
public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
    }
}
```

# Task 34

```java
public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden1Count + garden2Count);
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
    }
}
```

# Task 35

```java
public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden1Count + garden2Count);
    }

    public float calculateTotalAppleWeight(double treeAge) {
        return (float) (treeAge * 9.18);
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
    }
}
```

# Task 36

```java
public class MarsValueConverter {
    public int changeMonetAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }
}
```

# Task 37

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
    }
}
```

# Task 38

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
    }
}
```

# Task 39

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
    }
}
```

# Task 40

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String first = String.valueOf(name.charAt(0));
        String last = String.valueOf(name.charAt(name.length() - 1));
        return first.toUpperCase(+last.toUpperCase());
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
        System.out.println("names.getNameCode(boRA) = " + nameCode);
    }
}
```

# Task 41

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String first = String.valueOf(name.charAt(0));
        String last = String.valueOf(name.charAt(name.length() - 1));
        return first.toUpperCase(+last.toUpperCase());
    }

    public boolean isMoneyName(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        return first >= 0 & first <= 9 & last >= 0 & last <= 9;
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        String nameCode = names.getNameCode("boRA");
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
        System.out.println("names.getNameCode(boRA) = " + nameCode);
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
    }
}
```

# Task 42

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String first = String.valueOf(name.charAt(0));
        String last = String.valueOf(name.charAt(name.length() - 1));
        return first.toUpperCase(+last.toUpperCase());
    }

    public boolean isMoneyName(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        return first >= 0 & first <= 9 & last >= 0 & last <= 9;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        String nameCode = names.getNameCode("boRA");
        boolean isMoneyName = names.isMoneyName("31Boss31");
        boolean isNameInvisible = names.isInvisibleName(" ");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
        System.out.println("names.getNameCode(boRA) = " + nameCode);
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
        System.out.println("names.isInvisibleName(\" \") = " + isNameInvisible);
    }
}
```

# Task 43

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String first = String.valueOf(name.charAt(0));
        String last = String.valueOf(name.charAt(name.length() - 1));
        return first.toUpperCase(+last.toUpperCase());
    }

    public boolean isMoneyName(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        return first >= 0 & first <= 9 & last >= 0 & last <= 9;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    public String makeNamePositive() {
        return name
                .replace("no", " yes")
                .replace("No", "yes")
                .replace("nO", " yes")
                .replace("NO", " yes");
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        String nameCode = names.getNameCode("boRA");
        boolean isMoneyName = names.isMoneyName("31Boss31");
        boolean isNameInvisible = names.isInvisibleName(" ");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
        System.out.println("names.getNameCode(boRA) = " + nameCode);
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
        System.out.println("names.isInvisibleName(\" \") = " + isNameInvisible);
    }
}
```

# Task 44

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String first = String.valueOf(name.charAt(0));
        String last = String.valueOf(name.charAt(name.length() - 1));
        return first.toUpperCase(+last.toUpperCase());
    }

    public boolean isMoneyName(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        return first >= 0 & first <= 9 & last >= 0 & last <= 9;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    public String makeNamePositive() {
        return name
                .replace("no", " yes")
                .replace("No", "yes")
                .replace("nO", " yes")
                .replace("NO", " yes");
    }

    public String makeNameClean(String name) {
        return "CLEAN" + name.strip() + "CLEAN";
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        String nameCode = names.getNameCode("boRA");
        boolean isMoneyName = names.isMoneyName("31Boss31");
        boolean isNameInvisible = names.isInvisibleName(" ");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
        System.out.println("names.getNameCode(boRA) = " + nameCode);
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
        System.out.println("names.isInvisibleName(\" \") = " + isNameInvisible);
    }
}
```

# Task 45

```java
public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") | name.contains("a") | name.contains("O") | name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String first = String.valueOf(name.charAt(0));
        String last = String.valueOf(name.charAt(name.length() - 1));
        return first.toUpperCase(+last.toUpperCase());
    }

    public boolean isMoneyName(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        return first >= 0 & first <= 9 & last >= 0 & last <= 9;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    public String makeNamePositive() {
        return name
                .replace("no", " yes")
                .replace("No", "yes")
                .replace("nO", " yes")
                .replace("NO", " yes");
    }

    public String makeNameClean(String name) {
        return "CLEAN" + name.strip() + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        return name.substring(0, name.length() / 2);
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        String fullName = names.makeFullName("exor", "bigo");
        boolean isNameLucky = names.isNameLucky("Bigo");
        String nameCode = names.getNameCode("boRA");
        boolean isMoneyName = names.isMoneyName("31Boss31");
        boolean isNameInvisible = names.isInvisibleName(" ");
        System.out.println("names.areNamesEqual(\"nm \", \"nm\") = " + namesEqual);
        System.out.println("names.makeFullName(\"exor \", \"bigo\") = " + fullName);
        System.out.println("names.isNameLucky(Bigo\") = " + isNameLucky);
        System.out.println("names.getNameCode(boRA) = " + nameCode);
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
        System.out.println("names.isInvisibleName(\" \") = " + isNameInvisible);
    }
}
```

# Task 46

```java
public class NameEncoderDecoder {
    public String encode(String name) {
        String code = name
                .replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5');
        return "NOTFORYOU" + code + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String decode = name
                .replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a');
        return decode.substring(9, decode.length() - 12);
    }
}
```