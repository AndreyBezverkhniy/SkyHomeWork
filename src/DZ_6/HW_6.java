package DZ_6;

public class HW_6 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " является високосным");
        }

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Task 8");
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 9");
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 10");
        for (int a = 1, b = 2; a <= 10; a++, b += 2) {
            System.out.println("2*" + a + "=" + b);
        }
    }
}
