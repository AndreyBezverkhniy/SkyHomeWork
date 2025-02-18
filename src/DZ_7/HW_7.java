package DZ_7;

public class HW_7 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total = total + total / 100;
            total += 15_000;
        }
        System.out.println("Месяц " + month + ", сумма накомлений равне " + total + " рублей");

        System.out.println("Task 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Task 3");
        long people = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            people = people * (1000 - 8 + 17) / 1000;
            // сложно сказать, что было раньше: курица или яйцо, поэтому одновременно
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println("Task 4");
        total = 15_000;
        month = 0;
        while (total < 12_000_000) {
            month++;
            total += total * 7 / 100;
            System.out.println("Месяц " + month + ", накопления " + total);
        }
        System.out.println("Требуется " + month + " месяцев");

        System.out.println("Task 5");
        total = 15_000;
        month = 0;
        while (total < 12_000_000) {
            month++;
            total += total * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления " + total);
            }
        }
        System.out.println("Требуется " + month + " месяцев");

        System.out.println("Task 6");
        total = 15_000;
        for (int monthNumber = 1; monthNumber <= 9 * 12; monthNumber++) {
            total += total * 7 / 100;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", накопления " + total);
            }
        }

        System.out.println("Task 7");
        int date = 3;
        for (; date <= 31; date += 7) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчёт.");
        }

        System.out.println("Task 8");
        int year = 2024 - 200;
        year += 79 - 1; // чтобы не пропустить в начале диапазона
        year = year - year % 79; // последний пролёт не позднее 200 летней давности
        for (; year <= 2024 + 100; year += 79) {
            System.out.println(year);
        }
    }
}
