package Lesson;
class C{
    int x;
    static char y;
}
class Lesson{
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.x+" "+(int)C.y);
    }
}
