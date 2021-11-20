public class Lesson3 {
    public static void main(String[] args) {

        int a = 18;
        int b = 8;
        int c = 28;

        if (a % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
        if (Math.abs(a) > 9 && Math.abs(a) < 100) {
            System.out.println("Число  состоит из двух цифр");
        }
        if (Math.abs(a) >= 100 && Math.abs(a) < 1000) {
            System.out.println("Число состоит из трёх цифр");
        }
        if (a < 0) {
            System.out.println("Число отрицательное");
        }
        if (Math.abs(a) < 10) {
            System.out.println("Число между -10 и 10");
        }
        if ((a < 0 && a % 2 == 0) || (a > 0 && a % 2 != 0)) {
            System.out.println("Четное отрицательное или четное положительное");
        }
        // Второе задание

        if (a > 0) {
            System.out.println(a * a);
        } else {
            System.out.println(a / 2);
        }

        // Третье задание

        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.println("а является средним числом");
        } else if (b >= a && b <= c || b <= a && b >= c) {
            System.out.println("b является средним числом");
        } else {
            System.out.println("c является средним числом");
        }

        // Четвертое задание

        int x = 10;
        int y = 8;
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в верхней правой четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в нижней правой четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в нижней левой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится в верхней левой четверти");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка находится на оси х ");
        } else if (y !=0 && x == 0) {
            System.out.println("Точка находится на оси у ");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка находится в начале координат");
        }


        // Пятое задание

        int i = 2028;

        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))  {
                System.out.println("Високосный год");
        }
        else {
            System.out.println("Не является високосным");
        }

        int number = 6;
        String numberMes = "";
        switch (number){
            case 1: numberMes = "Что получить информационную справку нажмите 1";
            break;
            case 2: numberMes = "Чтобы узнать состояние ваше счета нажмите 2";
            break;
            case 3: numberMes = "Чтобы пополнить счет нажмите 3";
            break;
            case 4: numberMes = "Чтобы закрыть счет нажмите 4";
            break;
            case 5: numberMes = "Чтобы прослушать сообщение нажмите 5";
            break;
            case 6: numberMes = "Чтобы выйти на связь с оператором нажмите 6";
            break;
        }
        System.out.println(numberMes);
    }
}
