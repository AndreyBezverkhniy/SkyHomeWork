package DZ_8;

import java.util.Arrays;

public class HW_8 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        double[] doubleArr = {1.57, 7.654, 9.986};
        String[] stringArr = {"Hello", "world", "!"};

        System.out.println("Task 2");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i == intArr.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if (i == doubleArr.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
        for (int i = 0; i < stringArr.length; i++) {
            System.out.print(stringArr[i]);
            if (i == stringArr.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        System.out.println("Task 3");
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            System.out.print(doubleArr[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = stringArr.length - 1; i >= 0; i--) {
            System.out.print(stringArr[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        System.out.println("Task 4");
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]%2==1){
                intArr[i]++;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
