package KW_1;

import java.util.Objects;

public class Employee {
    private static int newId;
    private int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private String otdel;
    private int salary;

    public Employee(String firstName, String middleName, String lastName, String otdel, int salary) {
        id = newId;
        newId++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.otdel = otdel;
        this.salary = salary;
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата должна быть неотрицательной");
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOtdel() {
        return otdel;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && otdel == employee.otdel && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, otdel, salary);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee[");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", otdel=").append(otdel);
        sb.append(", salary=").append(salary);
        sb.append(']');
        return sb.toString();
    }
}
