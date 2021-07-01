package demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        final Matcher fullMatcher = Pattern.compile("\\w+$").matcher("#1skrf35kesruytfkwu4ty7sdfs");
        System.out.println("Found: " + fullMatcher.find() + " - position " + fullMatcher.start());
    }
}
