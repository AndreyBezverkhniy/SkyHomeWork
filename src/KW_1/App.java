package KW_1;

public class App {

    static EmployeeBook employeeBook;

    public static void initEmployees() {
        String[] names = {"Иван", "Дима", "Андрей"};
        for (int i = 0; i < 5; i++) {
            employeeBook.insertEmployee(names[i % names.length], "Иванович", "Иванов", "" + i % 2, i * 10000 + 7000);
        }
    }

    public static void main(String[] args) {
        employeeBook = new EmployeeBook();

        boolean success;
        for (int i = 0; i < 15; i++) {
            String str = "" + i;
            success = employeeBook.insertEmployee(str, str, str, str, i);
            System.out.println("Test inserting i=" + i + " success=" + success);
        }
        employeeBook.printEmployeesList();
        System.out.println();

        System.out.println("Testing deleting");
        for (int i = 0; i < 10; i++) {
            int id = (i * 3) % 15;
            System.out.println("Trying to delete employee with id=" + id);
            employeeBook.deleteEmployee(id);
        }
        employeeBook.printEmployeesList();
        System.out.println();

        System.out.println("Testing new insert");
        employeeBook.insertEmployee("a", "a", "a", "a", 10);
        employeeBook.insertEmployee("a", "a", "a", "a", 10);
        employeeBook.insertEmployee("a", "a", "a", "a", 10);
        employeeBook.printEmployeesList();
        System.out.println();

        System.out.println("Cleaning testing");
        employeeBook.clearEmployees();
        employeeBook.printEmployeesList();
        System.out.println();

        // Part 1

        initEmployees();
        employeeBook.printEmployeesList();
        System.out.println();

        employeeBook.printSalarySumByMonth();
        System.out.println();

        employeeBook.printMinSalaryEmployee();
        System.out.println();

        employeeBook.printMaxSalaryEmployee();
        System.out.println();

        employeeBook.printAverageSalary();
        System.out.println();

        employeeBook.printEmployeesFIO();
        System.out.println();

        // Part 2

        employeeBook.indexSalaries(10);
        System.out.println();

        employeeBook.printMinSalaryEmployeeAmongOtdel("1");
        System.out.println();

        employeeBook.printMaxSalaryEmployeeAmongOtdel("1");
        System.out.println();

        employeeBook.printSalarySumByMonthAmongOtdel("1");
        System.out.println();

        employeeBook.printAverageSalaryAmogOtdel("1");
        System.out.println();

        employeeBook.indexSalariesAmongOtdel(10, "1");
        System.out.println();

        employeeBook.printEmployeesListAmongOtdel("1");
        System.out.println();

        employeeBook.printEmployeesWithSalaryLessThan(30000);
        System.out.println();

        employeeBook.printEmployeesWithSalaryNotLessThan(25000);
        System.out.println();
    }
}
