package DZ_5;

public class HW_5 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        final int IOS = 0;
        final int ANDROID = 1;
        int clientOS = ANDROID;
        if (clientOS == IOS) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == ANDROID) {
            System.out.println("Установите версию приложения для ANDROID по ссылке");
        }
        // no message for others defined by task

        System.out.println("Task 2");
        int clientDeviceYear = 2012;
        clientOS = IOS;
        if (clientOS == IOS) {
            System.out.print("Установите ");
            if (clientDeviceYear < 2015) {
                System.out.print("облегчённую ");
            }
            System.out.println("версию приложения для IOS по ссылке");
        } else if (clientOS == ANDROID) {
            System.out.print("Установите ");
            if (clientDeviceYear < 2015) {
                System.out.print("облегчённую ");
            }
            System.out.println("версию приложения для ANDROID по ссылке");
        }

        System.out.println("Task 3");
        int year = 2800;
        System.out.print(year + " год ");
        if (year < 1584 || year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.print("не ");
        }
        System.out.println("является високосным");

        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else {
            deliveryDays = 3;
        }
        if (deliveryDistance >= 0 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не производится");
        }

        System.out.println("Task 5");
        int monthNumber = 6;
        System.out.println("Шёл месяц №" + monthNumber);
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
