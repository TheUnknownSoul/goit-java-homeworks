# Task 1

```java
class GooQueryTest {
    public static void main(String[] args) {
        GooQuery query = new GooQuery("en", "capital");

        //en
        System.out.println(query.getLanguage());

        //capital
        System.out.println(query.getText());

        //Searching [capital], using language: en
        System.out.println(query);
    }
}

class GooQuery {
    private String language;
    private String text;

    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("Searching [%s], using language: %s", text, language);
    }
}
```

# Task 2

```java
class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}

class GooWordStat {

    private String word;
    private int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        if (freq < 1000) {
            return String.format("Word is [%s], search freq is LOW", word);
        }
        if (freq >= 1000 & freq < 100000) {
            return String.format("Word is [%s], search freq is MEDIUM", word);
        }
        if (freq >= 100000 & freq < 10000000) {
            return String.format("Word is [%s], search freq is HIGH", word);
        }
        if (freq >= 10000000) {
            return String.format("Word is [%s], search freq is EXTRA HIGH", word);
        }
        return "";
    }
}
```

# Task 3

```java
import java.net.MalformedURLException;


class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        return url.replaceAll("http(s)?://|www\\.|/.*", "");
    }
}
```

# Task 4

```java
import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};
        Phrase phrase = new Phrase(words);
        //alpha beta gamma
        System.out.println(phrase);
        words[0] = "zero";
        //alpha beta gamma
        System.out.println(phrase);
    }
}

class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = new String[words.length];
        System.arraycopy(words, 0, this.words, 0, words.length);

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            result.append(s).append(" ");
        }
        return result.toString().trim();
    }
}
```

# Task 5

```java
class WordSplitter {
    public String[] split(String phrase) {
        String[] split = phrase.split("\\s+");
        String[] result = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = split[i].toLowerCase();
        }
        return result;
    }
}
```

# Task 6

```java
import java.nio.file.PathMatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter {
    public int count(String phrase) {
        Matcher matcherDots = Pattern.compile(".*[.]").matcher(phrase);
        Matcher matcherCommas = Pattern.compile(".*[,]").matcher(phrase);
        Matcher matcherExclamationMark = Pattern.compile(".*[!]").matcher(phrase);
        Matcher matcherColon = Pattern.compile(".*[:]").matcher(phrase);
        Matcher matcherSemicolon = Pattern.compile(".*[;]").matcher(phrase);
        int count = 0;
        if (matcherDots.find()) {
            count++;
        }
        if (matcherCommas.find()) {
            count++;
        }
        if (matcherExclamationMark.find()) {
            count++;
        }
        if (matcherColon.find()) {
            count++;
        }
        if (matcherSemicolon.find()) {
            count++;
        }
        return count;
    }
}
```

# Task 7

```java
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner {
    public String clean(String phrase) {
        return phrase.replaceAll("\\s+", " ").trim();
    }
}
```

# Task 8

```java

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] split = phrase.split(" ");
        float counter = 0f;
        for (String s : split) {
            if (s.toLowerCase().contains(word.toLowerCase())) {
                counter++;
            }
        }
        return counter / split.length;
    }
}
```

# Task 9

```java


class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}

class StringByteWorker {
    public String process(byte[] bytes) {
        char[] chars = new char[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            chars[i] = (char) bytes[i];
        }

        return String.valueOf(chars).toLowerCase();
    }
}
```

# Task 10

```java
class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String[] split = phrase.split("\\s");
        int counter = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() <= minLength) {
                counter++;
            }
        }
        return counter;
    }
}
```

# Task 11

```java
import java.util.*;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {
        String lowerCase = phrase.toLowerCase();
        String[] split = lowerCase.split("\\s+");
        int counter = 0;
        for (String s : split) {
            if (isPalindromeUsingStringBuilder(s)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isPalindromeUsingStringBuilder(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
}

```

# Task 12

```java
class UniqueCharCounter {
    public int count(String phrase) {
        return (int) phrase.chars()
                .distinct()
                .count();
    }
}
```

# Task 13

```java
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("matajilyh hidi potou ibfe yhypno xiefbidyd ycly", new String[]{"yhypno, ycly, potou, ibfe, hidi"}));

    }
}

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] split = phrase.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            for (String s : split) {
                if (!word.equals(s) & !word.contains(s)) {
                    result.append(s).append(" ");
                }
            }
        }
        return result.toString().trim();
    }
}
```

# Task 14

```java
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        return phrase.contains("key") | phrase.contains("Key") | phrase.contains("pass") | phrase.contains("Pass") | phrase.contains("login") | phrase.contains("Login") | phrase.contains("email") | phrase.contains("Email");
    }

}
```

# Task 15

```java
import java.util.regex.Pattern;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText {
    public boolean detect(String text) {
        return text.chars().allMatch(digit -> Character.isDigit(digit) | Character.isWhitespace(digit));
    }
}
```

# Task 16

```java
class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator {
    public String create(String text) {
        StringBuilder bigText = new StringBuilder();
        if (text.length() > 16) {
            char[] chars = text.toCharArray();
            for (int i = 0; i < 15; i++) {
                bigText.append(chars[i]);

            }
            if (!Character.isWhitespace(chars[15])) {
                bigText.append("...");
            }
            return bigText.toString();
        }
        return text;
    }
}
```

# Task 17

```java
import java.util.regex.Pattern;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector {
    public boolean isMath(String text) {
        return Pattern.compile("[-+*/=]").matcher(text).find() & Pattern.compile("[0-9].{2}").matcher(text).find();


    }
}
```

# Task 18

```java
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {
    public double count(String phrase) {
        String[] split = phrase.split("\\s+");
        int count = 0;
        double sum = 0;
        double average = 0;
        for (String s : split) {
            double charNum = s.length();
            sum = charNum + sum;
            count++;
            if (count > 0) {
                average = sum / count;
            }
        }
        return average;
    }
}
```

# Task 19

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public int[] extract(String text) {
        List<Integer> result = new ArrayList<>();
        String[] split = text.split("\\D+");
        for (String s : split) {
            if (s.isBlank()) {
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                int j = Character.digit(s.charAt(i), 10);

                result.add(j);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
```

# Task 20

```java
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {
    public String calculate(String text) {
        int upperCase = 0, lowerCase = 0;
        for (int k = 0; k < text.length(); k++) {

            // Check for uppercase letters.
            if (Character.isUpperCase(text.charAt(k))) upperCase++;

            // Check for lowercase letters.
            if (Character.isLowerCase(text.charAt(k))) lowerCase++;
        }
        if (upperCase > lowerCase) {
            return "Big";
        } else if (lowerCase > upperCase) {
            return "Small";
        }
        return "Same";
    }
}
```

# Task 21

```java
class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        char[] targetChars = targetWord.toCharArray();
        char[] sourceChars = sourceWord.toCharArray();
        int length = targetWord.length();
        int counter = 0;
        for (char c : sourceChars) {
            for (char a : targetChars) {
                if (Character.toLowerCase(c) == Character.toLowerCase(a)) {
                    counter++;
                }
            }
        }
        return counter == length;
    }
}
```

# Task 22

```java
class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter {
    public double count(String text) {
        String replaceAll = text.replaceAll("\\s+", "");
        int i = text.length() - replaceAll.length();
        return (double) i / text.length();
    }
}
```

# Task 23

```java
import java.util.regex.Pattern;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}

class EmailDetector {
    public boolean isPresent(String text) {
        return Pattern.compile("\\S{2}@\\S{2}").matcher(text).matches();
    }
}
```

# Task 24

```java 
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {
    public int count(String text) {
        String[] strings = text.split("\\s+");
        int counter = 0;
        for (String s : strings) {
            char[] split = s.toCharArray();
            if (Character.isUpperCase(split[0]) & Character.isLowerCase(split[1])) {
                counter++;

            }
        }
        return counter;
    }
}
```

# Task 25

```java
class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(number);
        }
        return result.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[]{10, 20, 30}));
    }
}
```

# Task 26

```java
class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result.append(word);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}
```

# Task 27

```java
class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder result = new StringBuilder();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            result.append(c);
        }
        return result.reverse().toString();
    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}
```

# Task 28

```java
class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < objects.length; i++) {
            result.append(objects[i]);

            if (i != objects.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}
```

# Task 29

```java
class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            result.append(firstName);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
```