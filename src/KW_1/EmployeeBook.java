package KW_1;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;

    EmployeeBook() {
        employees = new Employee[10];
    }

    public int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    public boolean insertEmployee(String firstName, String middleName, String lastName, String otdel, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, middleName, lastName, otdel, salary);
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public void clearEmployees() {
        Arrays.fill(employees, null);
    }

    public String[] makeEmployeesToStringList() {
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

    public void printEmployeesList() {
        System.out.println("Список данных сотрудниках");
        String[] employeesStringList = makeEmployeesToStringList();
        if (employeesStringList == null) {
            return;
        }
        for (String employeeCard : employeesStringList) {
            if (employeeCard == null) {
                continue;
            }
            System.out.println(employeeCard);
        }
    }

    public int salarySumByMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public void printSalarySumByMonth() {
        int salarySum = salarySumByMonth();
        System.out.println("Сумма зарплат за месяц " + salarySum);
    }

    public Employee findMinSalaryEmployee() {
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

    public void printMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        minSalaryEmployee = findMinSalaryEmployee();
        if (minSalaryEmployee == null) {
            System.out.println("Сотрудников нет");
        } else {
            System.out.println("Сотрудник с минимальной ЗП: " + minSalaryEmployee);
        }
    }

    public Employee findMaxSalaryEmployee() {
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

    public void printMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        maxSalaryEmployee = findMaxSalaryEmployee();
        if (maxSalaryEmployee == null) {
            System.out.println("Сотрудников нет");
        } else {
            System.out.println("Сотрудник с максимальной ЗП: " + maxSalaryEmployee);
        }
    }

    public double calcAverageSalary() {
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

    public void printAverageSalary() {
        double averageSalary;
        averageSalary = calcAverageSalary();
        System.out.println("Средняя зарплата " + averageSalary);
    }

    public void printEmployeesFIO() {
        System.out.println("Список ФИО сотрудников");
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            String fio = employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName();
            System.out.println(fio);
        }
    }

    public void indexSalaries(int percent) {
        System.out.println("Индексирование на " + percent + " процентов");
        if (percent < 0) {
            throw new InvalidParameterException("Индексация должна быть на неотрицательный процент");
        }
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary() * (100 + percent) / 100);
        }
        printEmployeesList();
    }

    public Employee findMinSalaryEmployeeAmongOtdel(String otdel) {
        Employee minSalaryEmployeeAmongOtdel = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!employee.getOtdel().equals(otdel)) {
                continue;
            }
            if (minSalaryEmployeeAmongOtdel == null) {
                minSalaryEmployeeAmongOtdel = employee;
            }
            if (employee.getSalary() < minSalaryEmployeeAmongOtdel.getSalary()) {
                minSalaryEmployeeAmongOtdel = employee;
            }
        }
        return minSalaryEmployeeAmongOtdel;
    }

    public void printMinSalaryEmployeeAmongOtdel(String otdel) {
        Employee minSalaryEmployeeAmongOtdel = null;
        minSalaryEmployeeAmongOtdel = findMinSalaryEmployeeAmongOtdel(otdel);
        if (minSalaryEmployeeAmongOtdel == null) {
            System.out.println("Сотрудников нет");
        } else {
            System.out.println("Сотрудник с минимальной ЗП в отделе " + otdel + ": " + minSalaryEmployeeAmongOtdel);
        }
    }

    public Employee findMaxSalaryEmployeeAmongOtdel(String otdel) {
        Employee maxSalaryEmployeeAmongOtdel = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!employee.getOtdel().equals(otdel)) {
                continue;
            }
            if (maxSalaryEmployeeAmongOtdel == null) {
                maxSalaryEmployeeAmongOtdel = employee;
            }
            if (employee.getSalary() > maxSalaryEmployeeAmongOtdel.getSalary()) {
                maxSalaryEmployeeAmongOtdel = employee;
            }
        }
        return maxSalaryEmployeeAmongOtdel;
    }

    public void printMaxSalaryEmployeeAmongOtdel(String otdel) {
        Employee maxSalaryEmployeeAmongOtdel = null;
        maxSalaryEmployeeAmongOtdel = findMaxSalaryEmployeeAmongOtdel(otdel);
        if (maxSalaryEmployeeAmongOtdel == null) {
            System.out.println("Сотрудников нет");
        } else {
            System.out.println("Сотрудник с максимальной ЗП в отделе " + otdel + ": " + maxSalaryEmployeeAmongOtdel);
        }
    }

    public int salarySumByMonthAmongOtdel(String otdel) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!employee.getOtdel().equals(otdel)) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public void printSalarySumByMonthAmongOtdel(String otdel) {
        int salarySum = salarySumByMonthAmongOtdel(otdel);
        System.out.println("Сумма зарплат за месяц в отделе " + otdel + " " + salarySum);
    }

    public double calcAverageSalaryAmongOtdel(String otdel) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!employee.getOtdel().equals(otdel)) {
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

    public void printAverageSalaryAmogOtdel(String otdel) {
        double averageSalary;
        averageSalary = calcAverageSalaryAmongOtdel(otdel);
        System.out.println("Средняя зарплата в отделе " + otdel + " " + averageSalary);
    }

    public void indexSalariesAmongOtdel(int percent, String otdel) {
        System.out.println("Индексирование на " + percent + " процентов в отделе " + otdel);
        if (percent < 0) {
            throw new InvalidParameterException("Индексация должна быть на неотрицательный процент");
        }
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!employee.getOtdel().equals(otdel)) {
                continue;
            }
            employee.setSalary(employee.getSalary() * (100 + percent) / 100);
        }
        printEmployeesList();
    }

    public int countEmployeesAmongOtdel(String otdel) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getOtdel().equals(otdel)) {
                count++;
            }
        }
        return count;
    }

    public String[] makeEmployeesToStringListAmongOtdel(String otdel) {
        int count = countEmployeesAmongOtdel(otdel);
        if (count == 0) {
            return null;
        }
        String[] list = new String[count];
        int index = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!employee.getOtdel().equals(otdel)) {
                continue;
            }
            list[index] = employee.toString();
            index++;
        }
        return list;
    }

    public void printEmployeesListAmongOtdel(String otdel) {
        System.out.println("Список данных сотрудниках в отделе " + otdel);
        String[] employeesStringList = makeEmployeesToStringListAmongOtdel(otdel);
        for (String employeeCard : employeesStringList) {
            System.out.println(employeeCard);
        }
    }

    public Employee[] findEmployeesWithSalaryLessThan(int salary) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Employee[] employeesWithSalaryLess = new Employee[count];
        int index = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                employeesWithSalaryLess[index] = employee;
                index++;
            }
        }
        return employeesWithSalaryLess;
    }

    public void printEmployeesWithSalaryLessThan(int salary) {
        Employee[] employeesWithSalaryLess = findEmployeesWithSalaryLessThan(salary);
        if (employeesWithSalaryLess == null) {
            System.out.println("Сотрудников с зарплатой ниже " + salary + " нет");
        } else {
            System.out.println("Сотрудники с зарплатой ниже " + salary);
            for (Employee employee : employeesWithSalaryLess) {
                System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + " " + employee.getSalary());
            }
        }
    }

    public Employee[] findEmployeesWithSalaryNotLessThan(int salary) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Employee[] employeesWithSalaryNotLess = new Employee[count];
        int index = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                employeesWithSalaryNotLess[index] = employee;
                index++;
            }
        }
        return employeesWithSalaryNotLess;
    }

    public void printEmployeesWithSalaryNotLessThan(int salary) {
        Employee[] employeesWithSalaryNotLess = findEmployeesWithSalaryNotLessThan(salary);
        if (employeesWithSalaryNotLess == null) {
            System.out.println("Сотрудников с зарплатой не ниже " + salary + " нет");
        } else {
            System.out.println("Сотрудники с зарплатой не ниже " + salary);
            for (Employee employee : employeesWithSalaryNotLess) {
                System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + " " + employee.getSalary());
            }
        }
    }
}
