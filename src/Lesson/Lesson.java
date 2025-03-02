package Lesson;

import java.util.Arrays;

class Lesson {
    public static void printSeparator() {
        System.out.println("========");
        System.out.println("--------");
    }
    public static void main(String[] args) {
        MyClass mc = new MyClass(1, 2);
        System.out.println("mc = " + mc);
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
    }
}
