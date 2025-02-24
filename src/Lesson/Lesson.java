package Lesson;

import java.util.Arrays;

class C {
    int x;
    static char y;
}

class Lesson {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int sum=0;
        for (int element : arr) {
            sum += element;
            sum=sum;
            System.out.println(sum - sum);
        }
    }
}
