import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            try {
                long x = scanner.nextLong();
                System.out.printf("%d can be fitted in:%n", x);
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.printf("%s can't be fitted anywhere.%n", scanner.next());
            }
        }

        scanner.close();
        
    }
}