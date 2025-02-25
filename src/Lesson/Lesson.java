package Lesson;

class Lesson {
    public static void printSeparator() {
        System.out.println("========");
        System.out.println("--------");
    }
    public static void main(String[] args) {
        String str = "123";
        String str2 = "123";
        System.out.println(str == str2);
        printSeparator();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if ((i+1)%2==0) {
                printSeparator();
            }
        }
        printSeparator();
    }
}
