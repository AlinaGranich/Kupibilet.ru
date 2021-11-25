import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        N = scanner.nextInt();
        System.out.println(N);

        for (int i = N / 2;i <= N; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n=======================");

        N = 6;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < N; i++) {
            System.out.print(alphabet.charAt(i));
        }

        System.out.println("\n=======================");

        for (int i = 1; i < 100; i++){
            for (int j = 0; j < i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("=======================");

        int counter = 0;
        int[][] cards = {{0, 0}, {0, 1}, {1, 1}};
        Random random = new Random();
        for(int i = 0; i < 10000; i++) {
            int cardNumber = random.nextInt(3);
            int cardSide = random.nextInt(2);
            if (cards[cardNumber][cardSide] == cards[cardNumber][1 - cardSide]) {
                counter++;
            }
        }

        System.out.println("Total wins: " + counter);
        System.out.println("Total wins percentage: " + (float) counter / 10000);
    }
}
