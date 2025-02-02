package DZ_3;

public class HW_3 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte b = 127;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 32000;
        System.out.println("Значение переменной s с типом short равно " + s);
        int i = 2000000000;
        System.out.println("Значение переменной i с типом int равно " + i);
        long l = 123456789012345L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 1.0;
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println("Task 2");
        float var1 = 27.12f;
        System.out.println("var1 = " + var1);
        long var2 = 987678965549L;
        System.out.println("var2 = " + var2);
        float var3 = 2.786f;
        System.out.println("var3 = " + var3);
        short var4 = 569;
        System.out.println("var4 = " + var4);
        short var5 = -159;
        System.out.println("var5 = " + var5);
        short var6 = 27897;
        System.out.println("var6 = " + var6);
        byte var7 = 67;
        System.out.println("var7 = " + var7);

        System.out.println("Task 3");
        int pagesPerStudent = 480 / (23 + 27 + 30);
        System.out.println("На каждого ученика рассчитано " +
                pagesPerStudent + " листов бумаги");

        System.out.println("Task 4");
        float A = 16;
        float t = 2;
        float t1 = 20;
        float t2 = 60 * 24;
        float t3 = t2 * 3;
        float t4 = t2 * 30;
        // Для точности использовал float P. 16 бутылок
        // могло быть произведено за 3 минуты
        float P = A / t;
        int A1 = (int) (P * t1);
        int A2 = (int) (P * t2);
        int A3 = (int) (P * t3);
        int A4 = (int) (P * t4);
        System.out.println("За 20 минут машина произвела " +
                A1 + " штук бутылок");
        System.out.println("За сутки машина произвела " +
                A2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " +
                A3 + " штук бутылок");
        System.out.println("За месяц машина произвела " +
                A4 + " штук бутылок");

        System.out.println("Task 5");
        int classAmount = 120 / (2 + 4);
        int white = classAmount * 2;
        float brown = classAmount * 4;
        System.out.println("В школе, где " + classAmount
                + " классов, нужно " + white + " банок белой краски и " +
                brown + " банок коричневой краски");

        System.out.println("Task 6");
        float banana = 80;
        float milk = 105f / 100;
        float ice = 100;
        float egg = 70;
        // float, так как 201 мл молока не целое число грамм
        // но если задача требует кратности 100мл, то можно от float избавитьяс полностью
        float grams = banana * 5 + milk * 200 + ice * 2 + egg * 4;
        // кроме килограммов, которые безысходно float
        float kilos = grams / 1000;
        System.out.println(grams + " g = " + kilos + " kg");

        System.out.println("Task 7");
        float dMelta = 7f;
        float min = 0.25f;
        float max = 0.5f;
        byte day250 = (byte) (dMelta / min);
        System.out.println(dMelta + " kg by " + min * 1000 + " g requires " + day250 + " days");
        byte day500 = (byte) (dMelta / max);
        System.out.println(dMelta + " kg by " + max * 1000 + " g requires " + day500 + " days");
        // avg = (intgrl {m} from{min} to {max} of {dMelta*dm/m}) / (max - min)
        float avg = (float) (dMelta * (Math.log(max / min))) / (max - min);
        // float because of averageness and no need in double
        System.out.println("Average = " + avg + " days");

        System.out.println("Task 8");
        int Maria = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        // +10% = *110/100 with rounding for ruobles only
        int newMaria = Maria * 110 / 100;
        int newDenis = Denis * 110 / 100;
        int newKristina = Kristina * 110 / 100;
        int deltaYearMaria = (newMaria - Maria) * 12;
        int deltaYearDenis = (newDenis - Denis) * 12;
        int deltaYearKristina = (newKristina - Kristina) * 12;
        System.out.println("Маша теперь получает " + newMaria
                + " рублей. Годовой доход вырос на " + deltaYearMaria + " рублей.");
        System.out.println("Денис теперь получает " + newDenis
                + " рублей. Годовой доход вырос на " + deltaYearDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newKristina
                + " рублей. Годовой доход вырос на " + deltaYearKristina + " рублей.");
    }
}
