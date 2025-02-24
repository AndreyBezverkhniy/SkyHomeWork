package DZ_9;

import java.util.Arrays;

public class HW_9 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] costs = {20, 10, 30, 50, 40};
        int sum = 0;
        for (int element : costs) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");
        int min = costs[0];
        int max = costs[0];
        for (int element : costs) {
            if (min < element) {
                min = element;
            }
            if (max > element) {
                max = element;
            }
        }
        System.out.print("Максимальная сумма трат за неделю составила " + max + " рублей. ");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");

        System.out.println("Task 3");
        sum = 0;
        for (int element : costs) {
            sum += element;
        }
        double avg = ((double) sum) / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей.");

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;
        for (int i = 0; i < length && i < length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - 1 - i];
            reverseFullName[length - 1 - i] = temp;
        }
        for (char element : reverseFullName) {
            System.out.print(element);
        }
        System.out.println();
    }
}
