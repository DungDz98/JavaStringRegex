package lophoc;

public class NameClassExampleTest {
    private static NameClassExample nameClassExample;
    public static final String[] validClass = {"C0318G", "C0421K", "A2345M", "A2345asdasdj3333L"};
    public static final String[] invalidClass = {"M0318G", "M253M", "A-3"};

    public static void main(String[] args) {
        nameClassExample = new NameClassExample();
        for (String l : validClass) {
            boolean isvalid = nameClassExample.validate(l);
            System.out.println("Class is " + l + "is valid: " + isvalid);
        }
        for (String l : invalidClass) {
            boolean isvalid = nameClassExample.validate(l);
            System.out.println("Class is " + l + "is valid: " + isvalid);
        }
    }
}
