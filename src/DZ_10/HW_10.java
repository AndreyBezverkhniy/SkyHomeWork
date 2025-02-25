package DZ_10;

public class HW_10 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("Task 2");
        String fullNameUppered = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчёта " + fullNameUppered);

        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}
