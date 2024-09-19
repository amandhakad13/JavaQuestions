
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a table : ");
        n = sc.nextInt();

        printTable(n);

    }

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}