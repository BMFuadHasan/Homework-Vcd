import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;
            System.out.println(year + " is an Olympic year.");
            System.out.println("Edition number: " + edition);
        } else {
            System.out.println(year + " is not an Olympic year.");
        }
        sc.close();
    }
}
