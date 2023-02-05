# Task 1

```java
public class SpaceShip {
    public String name = "Voyager";
}
```

# Task 2

```java
public class SpaceShip {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        System.out.println(ship.getName()); //Should be null
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
    }
}
```

# Task 3

```java
public class SpaceShip {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals(null) & name.length() != 0 & name.length() < 100) {
            this.name = name;
        }

    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored
    }
}
```

# Task 4

```java
public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
```

# Task 5

```java
public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
    }

    public void printInfo() {
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
```

# Task 6

```java
public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 | smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 | bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            System.out.println("Launch small rocket");
            smallRocketCount--;

        }
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            System.out.println("Launch big rocket");
            bigRocketCount--;

        }
    }

    public int getTotalPower() {
        return (bigRocketCount * 100) + (smallRocketCount * 50);
    }
}
```

# Task 7

```java
public class Engine {
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }
}
```

# Task 8

```java
class Engine {
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}

class XFuelEngine extends Engine {

    public String getFuelType() {
        return "XFuel";
    }
}
```

# Task 9

```java
class Engine {
    protected int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

class XFuelEngine extends Engine {
    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFuelType() {
        return "XFuel";
    }
}

class AdvancedXFuelEngine extends XFuelEngine {

    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + power);
    }
}
```

# Task 10

```java
public class Tanker {
    private String serialNumber;
    protected String defaultFuelType = "A500";

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    protected String getFuelType() {
        return defaultFuelType;
    }

    public void refuel(int amount) {
        System.out.printf("Add %d of %s, tanker serial number is %s%n", amount, getFuelType(), serialNumber);
    }

}

class XFuelTanker extends Tanker {
    protected String xFuel = "XFuel";

    protected String getFuelType() {
        return xFuel;
    }
}

class MX200Tanker extends Tanker {
    protected String mx200 = "MX200";

    protected String getFuelType() {
        return mx200;
    }
}
```

# Task 11

```java
abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();
}
```

# Task 12

```java
abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();
}

class RegularPassenger extends Passenger {
    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}

class VIPPassenger extends Passenger {
    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}
```

# Task 13

```java
class LaunchCalculator {
    public int calculateTotalPrice(Spaceport spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }
}

abstract class Spaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}

class JupiterStar extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 500 + (passengerCount * 2);
    }
}

class MercuryBeat extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return passengerCount * 15;
    }
}

class SunHeaven extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 2000;
    }
}
```

# Task 14

```java
final class Copyright {
    public void print() {
        System.out.println("SpaceWarriors Inc.");
    }
}
```

# Task 15

```java
class SpaceshipCalc {
    final int calculateAirBalloons(int passengerCount) {
        return passengerCount * 10;
    }

    int calculateBookCount(int passengerCount) {
        return passengerCount * 2;
    }
}
```

# Task 16

```java
class Planets {
    public static final String MERCURY = "Mercury";
    public static final String VENUS = "Venus";
    public static final String EARTH = "Earth";
    public static final String MARS = "Mars";
    public static final String JUPITER = "Jupiter";
    public static final String SATURN = "Saturn";
    public static final String URANUS = "Uranus";
    public static final String NEPTUNE = "Neptune";
}
```

# Task 17

```java
class SpaceportMessages {
    public static String generateLandingMessage(String shipName, String spaceport, String time) {
        return String.format("Spaceship %s landing at %s, time is %s", shipName, spaceport, time);
    }
}
```

# Task 18

```java
class SpaceUtils {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount) {
        if (planetCount == 1) {
            return String.format("%d planet", planetCount);
        }
        return String.format("%d planets", planetCount);

    }

    public static String generateStartMessage(String shipName, String time) {
        return String.format("Ship %s start at %s", shipName, time);
    }
}
```

# Task 19

```java
class PointTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2)); //Will be false
    }
}

class Point {
    private int x;
    private int y;
    private int z;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
```

# Task 20

```java
class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
    }
}

class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y && z == point.z;
    }
}
```

# Task 21

```java
import java.util.Objects;

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false
    }
}

class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
```

# Task 22

```java
import java.util.Objects;

class StarTrack {
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    private Point start;

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    private Point finish;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarTrack starTrack = (StarTrack) o;
        return Objects.equals(start, starTrack.start) && Objects.equals(finish, starTrack.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}

class StarTrackTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true

    }
}

class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2));

        System.out.println(Objects.hash(1, 2, 3));
    }


}

```

# Task 23

```java
class RocketLauncher {
    private String size;
    private int rocketCount;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    @Override
    public String toString() {
        return String.format("Size is %s, rocket count is %d", size, rocketCount);
    }

    public static void main(String[] args) {
        RocketLauncher launcher = new RocketLauncher();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        //Should be - Size is big, rocket count is 50
        System.out.println(launcher);
    }
}
```

# Task 24

```java
class Stars {
    public int getCount() {
        return count;
    }

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int res = count;
        StringBuilder result = new StringBuilder();
        while (res >= 1000) {
            result.append("X");
            res -= 1000;
        }
        while (res >= 100) {
            result.append("Y");
            res -= 100;
        }
        while (res >= 10) {
            result.append("Z");
            res -= 10;
        }
        while (res >= 1) {
            result.append("*");
            res -= 1;
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
```

# Task 25

```java
abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Mars extends Planet {

}

class Moon extends SpaceObject {

}

class PlanetTester {
    String test(SpaceObject object) {
        if (object instanceof Planet) {
            return "planet";
        }
        return "not planet";
    }
}
```

# Task 26

```java
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}
```

# Task 27

```java
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 6
        System.out.println(firTest.test(firNum, 3));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n;
            n--;
        }
        return sum;
    }
}
```

# Task 28

```java
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();

        //Should be 15
        System.out.println(firTest.test(firNum, 5));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

# Task 29

```java
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumFizzBuzz();
        FirTest firTest = new FirTest();

        //Should be 83
        System.out.println(firTest.test(firNum, 20));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}
```

# Task 30

```java
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            }
        }
        return result;
    }
}
```

# Task 31

```java
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            }
        }
        return result;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                sum += n;
            }
            n--;
        }
        return sum / 2;
    }
}
```

# Task 32

```java
class SeasonTest {
    public String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}

abstract class Season {
    public abstract String getName();

    public abstract boolean isCold();
}

class Winter extends Season {
    private String name = "winter";
    private boolean isCold = true;

    public String getName() {
        return name;
    }

    public boolean isCold() {
        return isCold;
    }
}

class Spring extends Season {
    private String name = "spring";
    private boolean isCold = false;

    public String getName() {
        return name;
    }

    public boolean isCold() {
        return isCold;
    }
}

class Summer extends Season {
    private String name = "summer";
    private boolean isCold = false;

    public String getName() {
        return name;
    }

    public boolean isCold() {
        return isCold;
    }
}

class Autumn extends Season {
    private String name = "autumn";
    private boolean isCold = true;

    public String getName() {
        return name;
    }

    public boolean isCold() {
        return isCold;
    }
}
```

# Task 33

```java
class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    public void launch() {
    }
}
```

# Task 34

```java
class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();

    public void launch() {
        gasStation.refuel();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}
```

# Task 35

```java

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower {
    public void service() {
        System.out.println("Service done!");
    }
}
```

# Task 36

```java
class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation {
    public void compress() {
        System.out.println("Compress done!");
    }
}
```

# Task 37

```java
class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation {
    public void compress() {
        System.out.println("Compress done!");
    }
}

class Radar {
    public void scan() {
        System.out.println("Scan done!");
    }
}
```

# Task 39

```java
class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class Altimeter {

    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {

    @Override
    public String toString() {
        return "Measure air pressure";
    }
}

class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.println(altimeter.toString());
        System.out.println(airGauge.toString());
    }
}
```