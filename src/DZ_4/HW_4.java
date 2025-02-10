package DZ_4;

public class HW_4 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершенолетия ещё не наступил");
        }

        System.out.println("Task 2");
        double temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надёть шапку");
        } else if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("Не бывает снега в ноябре");
        }
        // В условии, видимо, учли, что за всю жизнь продолжительность времени,
        // когда температура ровно 5 градусов, суммарно составляет ровно 0 секунд
        // Разрази меня Лебег, если это не так!

        System.out.println("Task 3");
        double speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        }

        System.out.println("Task 4");
        age = 98;
        System.out.print("Усли возраст человека равен " + age
                + " лет, то ему пора ходить ");
        if (age >= 2 && age <= 6) {
            System.out.println("в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("в университет");
        } else {
            System.out.println("на работу");
        }

        System.out.println("Task 5");
        age = 12;
        System.out.print("Если возраст ребёнка равен " + age
                + ", то ему ");
        if (age < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (age >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("нельзя кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Task 6");
        int buisy = 60;
        System.out.println("Занято " + buisy + " мест");
        if (buisy < 60) {
            System.out.println("Свободно " + (60 - buisy) + " сидячих и " + (102 - 60) + " стоячих мест");
        } else if (buisy >= 60 && buisy < 102) {
            System.out.println("Свободно " + (102 - buisy) + " стоячих мест");
        } else {
            System.out.println("Свободно нет свободных мест");
        }
        // машина должна работать вместо меня!

        System.out.println("Task 7");
        int one = 11;
        int two = 222;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Большее первое число");
        } else if (two >= three) {
            System.out.println("Большее второе число");
        } else {
            System.out.println("Большее третье число");
        }
    }
}
