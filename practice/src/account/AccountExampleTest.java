package account;

public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = {"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidAccount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String a : validAccount) {
            boolean isvalid = accountExample.validate(a);
            System.out.println("Account is " + a + " is valid: " + isvalid);
        }
        for (String a : invalidAccount) {
            boolean isvalid = accountExample.validate(a);
            System.out.println("Account is " + a + " is valid: " + isvalid);
        }
    }
}
