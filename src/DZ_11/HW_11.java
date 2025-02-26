package DZ_11;

import java.time.LocalDate;

public class HW_11 {
    public static boolean isVisokosYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return true;
    }

    public static void task1() {
        System.out.println("Task 1");
        int year = 2300;
        boolean isVisokos = isVisokosYear(year);
        if (isVisokos) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static String buildMessage(int clientDeviceYear, int operatingSystem) {
        int currentYear = LocalDate.now().getYear();
        boolean oldDevice = clientDeviceYear < currentYear;
        boolean isIOS = operatingSystem == 0;
        boolean isAndroid = operatingSystem == 1;
        if (isAndroid) {
            if (oldDevice) {
                return "Установите облегчённую версию для Adnroid по ссылке";
            }
            return "Установите обычную версию для Android по ссылке";
        }
        if (isIOS) {
            if (oldDevice) {
                return "Установите облегчённую версию для IOS по ссылке";
            }
            return "Установите обычную версию для IOS по ссылке";
        }
        return "Неподдерживаемая операционная система";
    }

    public static void task2() {
        System.out.println("Task 2");
        int clientDeviceYear = 2025;
        int operatingSystem = 1;
        String message = buildMessage(clientDeviceYear, operatingSystem);
        System.out.println(message);
    }

    public static int countDeliveryDays(int distance) {
        int days = 0;
        if (distance < 0) {
            return -1;
        }
        days++;
        if (distance <= 20) {
            return days;
        }
        days++;
        if (distance <= 60) {
            return days;
        }
        days++;
        if (distance <= 100) {
            return days;
        }
        return -1;
    }

    public static String createMessageByLongevity(int days) {
        if (days >= 0) {
            return "Потребуется дней: " + days;
        }
        return "Доставка не производится";
    }

    public static void task3() {
        System.out.println("Task 3");
        int deliveryDistance = 95;
        int days = countDeliveryDays(deliveryDistance);
        String message = createMessageByLongevity(days);
        System.out.println(message);
    }

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }
}
