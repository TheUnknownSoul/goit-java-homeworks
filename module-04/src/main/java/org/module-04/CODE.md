# Task 1

```java
public class UberShop {
    public void printPrices(float[] prices) {
        for (float i : prices) {
            System.out.println(i + " jup.");

        }
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[]{100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}
```

# Task 2

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5;
            }
        }
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [200, 2250]
        float[] prices = new float[]{100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
}
```

# Task 3

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[]{};
        }
        if (prices.length == 1) {
            return new int[]{prices[0]};
        }

        int maxValue = prices[0];
        int minValue = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > maxValue) {
                maxValue = prices[i];
            } else if (prices[i] < maxValue) {
                minValue = prices[i];
            } else {
                return new int[]{minValue};
            }
        }

        return new int[]{minValue, maxValue};

    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[]{100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }

}
```

# Task 4

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }
}
```

# Task 5

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    //Test output
    public static void main(String[] args) {

    }
}

```

# Task 6

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [1599, 399]
        int[] prices = new int[]{399, 1599, 399, 50, 10, 10, 70};
        System.out.println(Arrays.toString(shop.leavePrice9(prices)));
    }
}

```

# Task 7

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        int index = 0;
        for (String stock : showcaseStocks) {
            result[index] = stock;
            index++;
        }

        for (String stock : warehouseStocks) {
            result[index] = stock;
            index++;
        }

        return result;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [1599, 399]
        int[] prices = new int[]{399, 1599, 399, 50, 10, 10, 70};
        System.out.println(Arrays.toString(shop.leavePrice9(prices)));
    }
}

```

# Task 8

```java
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        int index = 0;
        for (String stock : showcaseStocks) {
            result[index] = stock;
            index++;
        }

        for (String stock : warehouseStocks) {
            result[index] = stock;
            index++;
        }

        return result;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > minPrice & prices[i] <= maxPrice) {
                sum += prices[i];
            }
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[]{10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}
```

# Task 9

```java
class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        StringBuilder result = new StringBuilder();
        for (String stock : stocks) {
            String[] parts = stock.split(" ");
            if (Integer.parseInt(parts[1]) <= 200) {
                result.append(parts[0]).append(" ");
            }
        }
        return result.toString();
    }
}

```

# Task 10

```java
public class ArlanHelper {
    public String drawQuad(int n) {
        StringBuilder result = new StringBuilder();

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result.append("*");
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}
```

# Task 11

```java
public class ArlanHelper {
    public String drawQuad(int n) {
        StringBuilder result = new StringBuilder();

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result.append("*");
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawRect(int width, int height, char c) {
        StringBuilder result = new StringBuilder();

        int lines = height;

        while (lines > 0) {
            lines--;

            int columns = width;
            while (columns > 0) {
                result.append(c);
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));
    }
}
```

# Task 12

```java
public class ArlanHelper {
    public String drawQuad(int n) {
        StringBuilder result = new StringBuilder();

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result.append("*");
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawRect(int width, int height, char c) {
        StringBuilder result = new StringBuilder();

        int lines = height;

        while (lines > 0) {
            lines--;

            int columns = width;
            while (columns > 0) {
                result.append(c);
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawLine(int length) {
        StringBuilder result = new StringBuilder();

        boolean star = true;

        while (length > 0) {
            result.append(star ? '*' : '#');
            star = !star;
            length--;
        }

        return result.toString();
    }

    public static void main(String[] args) {

    }
}
```

# Task 13

```java
public class ArlanHelper {
    public String drawQuad(int n) {
        StringBuilder result = new StringBuilder();

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result.append("*");
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawRect(int width, int height, char c) {
        StringBuilder result = new StringBuilder();

        int lines = height;

        while (lines > 0) {
            lines--;

            int columns = width;
            while (columns > 0) {
                result.append(c);
                columns--;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawLine(int length) {
        StringBuilder result = new StringBuilder();

        boolean star = true;

        while (length > 0) {
            result.append(star ? '*' : '#');
            star = !star;
            length--;
        }

        return result.toString();
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        StringBuilder result = new StringBuilder();

        int index = 0;
        while (repeatCount != 0) {
            while (index < pattern.length) {
                result.append(pattern[index]);
                ++index;
            }
            index = 0;
            repeatCount--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[]{'J', 'a', 'v', 'a'}, 3));
    }
}
```

# Task 14

```java
public class TriangleDrawer {
    public String drawTriangle(int side) {
        StringBuilder result = new StringBuilder();
        while (side > 0) {
            int line = side;
            side--;
            while (line > 0) {
                result.append("*");
                line--;
            }
            result.append("\n");
        }

        return result.toString();

    }
}
```

# Task 15

```java
public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while (n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}
```

# Task 16

```java
public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while (n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public int countSumOfDigits(int number) {
        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
```

# Task 17

```java
public class ATM {
    public int countBanknotes(int sum) {
        int countOfBanknotes = 0;

        while (sum >= 500) {
            sum -= 500;
            countOfBanknotes++;
        }
        while (sum >= 200) {
            sum -= 200;
            countOfBanknotes++;
        }
        while (sum >= 100) {
            sum -= 100;
            countOfBanknotes++;
        }

        while (sum >= 50) {
            sum -= 50;
            countOfBanknotes++;
        }
        while (sum >= 20) {
            sum -= 20;
            countOfBanknotes++;
        }
        while (sum >= 10) {
            sum -= 10;
            countOfBanknotes++;
        }
        while (sum >= 5) {
            sum -= 5;
            countOfBanknotes++;
        }
        while (sum >= 2) {
            sum -= 12;
            countOfBanknotes++;
        }
        while (sum >= 1) {
            sum -= 1;
            countOfBanknotes++;
        }
        return countOfBanknotes;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(500));
    }
}
```