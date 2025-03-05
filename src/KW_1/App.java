package KW_1;

import org.w3c.dom.ls.LSOutput;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class App {
    static Employee[] employees;

    public static int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    public static String[] makeEmployeesToStringList() {
        int count = countEmployees();
        if (count == 0) {
            return null;
        }
        String[] list = new String[count];
        int index = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            list[index] = employee.toString();
            index++;
        }
        return list;
    }

    public static void printEmployeesList() {
        System.out.println("Список данных сотрудниках");
        String[] employeesStringList = makeEmployeesToStringList();
        for (String employeeCard : employeesStringList) {
            System.out.println(employeeCard);
        }
    }

    public static int salarySumByMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void printSalarySumByMonth() {
        int salarySum = salarySumByMonth();
        System.out.println("Сумма зарплат за месяц " + salarySum);
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (minSalaryEmployee == null) {
                minSalaryEmployee = employee;
            }
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static void printMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        minSalaryEmployee = findMinSalaryEmployee();
        if (minSalaryEmployee == null) {
            System.out.println("Сотрудников нет");
        } else {
            System.out.println("Сотрудник с минимальной ЗП: " + minSalaryEmployee);
        }
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (maxSalaryEmployee == null) {
                maxSalaryEmployee = employee;
            }
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static void printMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        maxSalaryEmployee = findMaxSalaryEmployee();
        if (maxSalaryEmployee == null) {
            System.out.println("Сотрудников нет");
        } else {
            System.out.println("Сотрудник с максимальной ЗП: " + maxSalaryEmployee);
        }
    }

    public static double calcAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            count++;
            sum += employee.getSalary();
        }
        if (count == 0) {
            throw new InvalidParameterException("Список работников пуст");
        }
        return sum / count;
    }

    public static void printAverageSalary() {
        double averageSalary;
        averageSalary = calcAverageSalary();
        System.out.println("Средняя зарплата " + averageSalary);
    }

    public static void printEmployeesFIO() {
        System.out.println("Список ФИО сотрудников");
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            String fio = employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName();
            System.out.println(fio);
        }
    }

    public static void initEmployees() {
        String[] names = {"Иван", "Дима", "Андрей"};
        employees = new Employee[10];
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee(names[i % names.length], "Иванович", "Иванов", "Начальники", i * 10000 + 7000);
        }
    }

    public static void indexSalaries(int percent) {
        System.out.println("Индексирование на "+percent+" процентов");
        if (percent < 0) {
            throw new InvalidParameterException("Индексация должна быть на неотрицательный процент");
        }
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary()*(100+percent)/100);
        }
        printEmployeesList();
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println();

        printEmployeesList();
        System.out.println();

        printSalarySumByMonth();
        System.out.println();

        printMinSalaryEmployee();
        System.out.println();

        printMaxSalaryEmployee();
        System.out.println();

        printAverageSalary();
        System.out.println();

        printEmployeesFIO();
        System.out.println();

        indexSalaries(10);
        System.out.println();

    }
}
