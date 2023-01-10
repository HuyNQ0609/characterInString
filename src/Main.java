import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String: ");
        String line = input.nextLine();
        int a = line.length();
        System.out.println("The sum of the characters in the string is: " + a);
        System.out.print("The number of input panel characters appearing in the string is: " + Str(line));
    }
    public static int Str(String str) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the character you want to check: ");
        char b = input.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Objects.equals(b, c)) {
                count++;
            }
        }
        return count;
    }
}