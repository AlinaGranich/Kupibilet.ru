
import java.util.Scanner;


public class Lesson2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);{
            System.out.println("Введите целое число");
            int num = scanner.nextInt();
            System.out.println(num);
        }

        Scanner scan = new Scanner(System.in);{
            System.out.println("Введите имя");
            String name = scan.nextLine();
            System.out.println( "Привет," + name);
        }

        Scanner number = new Scanner(System.in);{
            System.out.println("Введите два числа");
            int n = number.nextInt();
            int n2 = number.nextInt();
            System.out.println(n + n2);
            System.out.println(n - n2);
            System.out.println(n * n2);
            System.out.println(n / n2);
            System.out.println(n % n2);


        }
        Scanner fio = new Scanner(System.in);{
            System.out.println("Введите имя и фамилию");
            String firstName = fio.nextLine();
            String secondName = fio.nextLine();
            System.out.println(firstName + " " + secondName);
        }


    }

}

