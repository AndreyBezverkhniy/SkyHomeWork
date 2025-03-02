package Lesson;

import java.util.Objects;

public class MyClass {
    int x;
    int y;

    MyClass(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("MyClass{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return x == myClass.x;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x);
    }
}
