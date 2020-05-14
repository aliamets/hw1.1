public class Main {
    public static void main(String[] args) {
        //Задание 2
        /* //Целочисленные переменные:
        //Примитивные:
            byte a = 1;
            short b = 2;
            int c = 3;
            long d = 4;
        //С плавающей запятой:
        float f = (float) 3.5; //float f =  3.5f;
        double g = 6.6;
        //Символьные:
        char k = 'R';
        //Логические:
        boolean l = true;
        boolean l1 = false;*/
        //  example(2,2,4,2);
        System.out.println("Задание №3:");
        System.out.println(example(3, 5, 6, 9));
        System.out.println("Задание №4:");
        System.out.println(sum(3, 9));
        System.out.println("Задание №5:");
        check(4);
        System.out.println("Задание №6:");
        System.out.println(number(-2));
        System.out.println("Задание №7:");
        name("Фанзиль Кусяпкулов!");
        System.out.println("Задание №8:");
        year(400);

    }

    //Задание 3.
    public static double example(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //Задание 4.
    public static boolean sum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void check(int a) {
        if (a >= 0) {
            System.out.println("Число проложительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean number(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void name(String name) {
        System.out.println("Привет, " + name);
    }

    public static void year(int a) {
        if (a % 400 == 0) {
            System.out.println("Год высокосный");
            return;
        }

        if (a % 100 == 0) {
            System.out.println("Год не высокосный");
            return;
        }
        if (a % 4 == 0) {
            System.out.println("Год высоосный");

        } else {
            System.out.println("Год не высокосный");
            return;
        }
    }
}
