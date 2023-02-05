# Task 1

```java
class Hero {
    private String name;
    private int hp;

    public Hero() {
        name = "Paratrooper";
        hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
```

# Task 2

```java
class Hero {
    private String name;
    private int hp;

    public Hero() {
        name = "Paratrooper";
        hp = 100;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
```

# Task 3

```java
class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
```

# Task 4

```java
class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        if (hp > 0 & hp <= 200) {
            this.name = name;
            this.hp = hp;
        }
        if (hp > 200) {
            this.hp = 200;
        }

    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
```

# Task 5

```java
class BfgTest {

    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }

}

class BFG {
    private int ammo;
    private int damage;
    private String name;

    BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;

    }

    BFG(int ammo, int damage) {
        this(ammo, damage, "BFG");
    }

    BFG(int ammo) {
        this(ammo, 50, "BFG");
    }

    BFG() {
        this(1000, 50, "BFG");
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, ammo: %d, damage: %d", name, ammo, damage);
    }
}
```

# Task 6

```java
class Bullet {
    {
        System.out.println("Bullet created!");
    }
}

class BulletTest {
    public static void main(String[] args) {
        new Bullet();
        new Bullet();
    }
}
```

# Task 7

```java
class GameSaver {
    static {
        System.out.println("GameSaver created!");
    }
}

class GameSaverTest {
    public static void main(String[] args) {
        //GameSaver created!
        for (int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }
}
```

# Task 8

```java
import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2;

    static {
        POWERS_2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < POWERS_2.length; i++) {
            POWERS_2[i] = POWERS_2[i] * POWERS_2[i];
        }
    }
}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
```

# Task 9

```java
class AITest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new AI();
        }
    }
}

class AI {
    private static AI ai;

    static {

        System.out.println("AI loaded!");
    }

    {

        System.out.println("New AI created!");

    }

    public static AI getInstance() {
        if (ai == null) {
            ai = new AI();
        }
        return ai;
    }

}
```

# Task 10

```java
class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance {
    int startX, startY, endX, endY;

    Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        return Math.toIntExact(Math.round(Math.sqrt((endY - startY) * (endY - startY) + (endX - startX) * (endX - startX))));

    }
}
```

# Task 11

```java
class RectangleAreaTest {

    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    private int[] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }

    public int getArea() {
        int x_2 = coords[2] - coords[0];
        int y_2 = coords[3] - coords[1];
        return x_2 * y_2;
    }
}
```

# Task 12

```java
class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector {
    int x1, y1, r1, x2, y2, r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int radius_sum = r1 + r2;
        if (distance <= radius_sum) {
            return "intersects";
        }
        return "not intersects";
    }
}
```

# Task 13

```java
import java.util.Objects;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack {
    private int run_sum;

    public QuarkeTrack(int[] lines) {

        for (int i : lines) {
            run_sum += i;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return run_sum == that.run_sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(run_sum);
    }
}
```

# Task 14

```java
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRectangle) {
        return (this.getA() <= anotherRectangle.getA() & this.getB() <= anotherRectangle.getB() | (this.getA() <= anotherRectangle.getB() & this.getB() <= anotherRectangle.getA()));
    }
}
```

# Task 15

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] result = targets[1];
        int closestDistance = distance(aiCoords[0], aiCoords[1], result[0], result[1]);
        for (int[] target : targets) {
            int distance = distance(aiCoords[0], aiCoords[1], target[0], target[1]);
            if (distance < closestDistance && distance != 0) {
                closestDistance = distance;
                result = target;
            }
        }
        return result;
    }

    public int distance(int x1, int x2, int y1, int y2) {
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
```

# Task 16

```java
class LevelTest {

    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}

class Level {
    private String name;

    public Level(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Quarke level, name is %s", name);
    }
}
```

# Task 17

```java
import java.util.*;

class Level {
    static class Point {
        private int x, y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private String levelName;
    private Point[] points;

    public Level(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName + ", point count is " + points.length;
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}
```

# Task 18

```java
class Level {
    private Point[] points;
    private LevelInfo levelInfo;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class LevelInfo {
        private String name, difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
    }
}
```

# Task 19

```java
class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash() {
        int hash = 0;
        for (Point p : points) {
            hash += p.getX() * p.getY();
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}
```

# Task 20

```java
class GameMenuTest {

    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}

class GameMenu {

    abstract static class MenuItem {
        private abstract String getAction();

    }

    void act(MenuItem menuItem) {
        System.out.println(menuItem.getAction());
    }

    static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }

    static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }

    static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }
}
```

# Task 21

```java
class LevelLoaderTest {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}

class LevelLoader {
    private String name;
    private LevelLoader instance;

    String load(String name) {

        return "Loading level " + name + " ...";
    }
}
```

# Task 22

```java
class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    public static LevelLoader getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
```

# Task 23

```java
class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    private LevelLoader() {

    }

    public static LevelLoader getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
```

# Task 24

```java
class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}

class TexturePool {
    private static TexturePool instance = new TexturePool();

    private TexturePool() {
    }

    public static TexturePool getInstance() {
        return instance;
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}
```

# Task 26

```java
class ArrayWorker {
    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (RuntimeException e) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);

        }
    }
}

class ArrayWorkerTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker().printElement(array, 10);
    }
}
```

# Task 27

```java
class AIPlayer {
    private int hp;

    public void setHp(int hp) {
        if (hp < 0 | hp > 100) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.hp = hp;
    }
}

class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}
```

# Task 28

```java
class TotalScore {
    public int sum(int[] scores) {
        int result = 0;


        for (int index : scores) {
            result += index;
        }

        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
```

# Task 29

```java
class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        if (level.getHeight() * level.getWidth() > 100000) {
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}

class LevelTooBigException extends Exception {
    LevelTooBigException() {
        super();
    }
}
```