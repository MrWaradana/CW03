import java.util.Scanner;

public class ProcessAName5026201084 {


    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = inputName.next();
        String lastName = inputName.next();
        int firstNameLength = firstName.length();
        System.out.println(firstNameLength);
        System.out.println("Your name is " + lastName + ", " + firstName.charAt(0));

    }
}