package lophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[CPA][\\d]{4}\\w*[GHIKLM]$";

    public NameClassExample() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
