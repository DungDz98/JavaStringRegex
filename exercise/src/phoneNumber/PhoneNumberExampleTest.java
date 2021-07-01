package phoneNumber;

import java.util.Scanner;

public class PhoneNumberExampleTest {
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thu vao day");
        String input = sc.nextLine();
        boolean isvalid = phoneNumberExample.validate(input);
        System.out.println("Phone Number: " + input + " is valid: " + isvalid);
    }

}
