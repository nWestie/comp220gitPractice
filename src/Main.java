import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yourName = new Scanner(System.in);
        System.out.println("Yo, what's ur name, dude?");
        String dudesName = yourName.next();
        System.out.println("GOODBYE " + dudesName);
    }
}