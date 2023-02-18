public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int b = 5467893;
        System.out.println("Значение переменной b типа int равно " + b);
        byte d = 21;
        System.out.println("Значение переменной d типа byte равно " + d);
        short f = 8349;
        System.out.println("Значение переменной f типа short равно " + f);
        long g = 4596706L;
        System.out.println("Значение переменной g типа long равно " + g);
        float i = 5.78f;
        System.out.println("Значение переменной i типа float равно " + i);
        double j = 54.897234;
        System.out.println("Значение переменной j типа double равно " + j);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float q = 27.12f;
        System.out.println(q);
        long u = 987678965549L;
        System.out.println(u);
        double y = 2.786;
        System.out.println(y);
        short r = 569;
        System.out.println(r);
        short s = -159;
        System.out.println(s);
        int w = 27897;
        System.out.println(w);
        short v = 67;
        System.out.println(v);

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short threeClasses = (short) (class1 + class2 + class3);
        short paper = (short) (480 / threeClasses);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        byte productivity = (byte) (bottles / time);
        short period1 = (short) (productivity * 20);
        System.out.println("За 20 минут машина произвела " + period1 + " штук бутылок");
        short period2 = (short) (productivity * 1440);
        System.out.println("За сутки машина произвела " + period2 + " штук бутылок");
        int period3 = (productivity * 4320);
        System.out.println("За 3 дня машина произвела " + period3 + " штук бутылок");
        int period4 = (productivity * 43200);
        System.out.println("За месяц машина произвела " + period4 + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        short paintAmount = 120;
        byte paintWhite = 2;
        byte paintBrown = 4;
        byte paintClass = (byte) (paintWhite + paintBrown);
        short schoolClass = (short) (paintAmount / paintClass);
        short whiteAmount = (short) (schoolClass * paintWhite);
        short brownAmount = (short) (schoolClass * paintBrown);
        System.out.println("В школе, где " + schoolClass + " классов, нужно " + whiteAmount + " банок белой краски и " + brownAmount + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        short bananas = (short) (bananaWeight * 5);
        float milkWeight = 1.05f;
        float milk = milkWeight * 200;
        byte iceCreamWeight = 100;
        short iceCream = (short) (iceCreamWeight * 2);
        byte eggWeight = 70;
        short egg = (short) (eggWeight * 4);
        float breakfastWeight = bananas + milk + iceCream + egg;
        System.out.println("Вес завтрака " + breakfastWeight + " граммов");
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("Вес завтрака " + breakfastWeightKg + " килограммов");

    }

    public static void task7() {
        System.out.println("Задача 7");
        byte weightKg = 7;
        short weight = (short) (weightKg * 1000);
        short weightPerDay = 250;
        short time = (short) (weight / weightPerDay);
        System.out.println("При похудении по " + weightPerDay + " граммов в день потребуется " + time + " дней");
        short weightPerDay1 = 500;
        short time1 = (short) (weight / weightPerDay1);
        System.out.println("При похудении по " + weightPerDay1 + " граммов в день потребуется " + time1 + " дней");
        short wholeTime = (short) (time + time1);
        short midTime = (short) (wholeTime / 2);
        System.out.println("В среднем потребуется " + midTime + " день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        float mashaSalaryIncr = mashaSalary * 1.1f;
        float denisSalaryIncr = denisSalary * 1.1f;
        float christinaSalaryIncr = christinaSalary * 1.1f;
        float mashaSalaryDiff = mashaSalaryIncr - mashaSalary;
        mashaSalaryDiff = mashaSalaryDiff * 12;
        System.out.println("Маша теперь получает " + mashaSalaryIncr + " рублей в месяц. Ее годовой доход вырос на " + mashaSalaryDiff + " рублей");
        float denisSalaryDiff = denisSalaryIncr - denisSalary;
        denisSalaryDiff = denisSalaryDiff * 12;
        System.out.println("Денис теперь получает " + denisSalaryIncr + " рублей в месяц. Его годовой доход вырос на " + denisSalaryDiff + " рублей");
        float christinaSalaryDiff = christinaSalaryIncr - christinaSalary;
        christinaSalaryDiff = christinaSalaryDiff * 12;
        System.out.println("Кристина теперь получает " + christinaSalaryIncr + " рублей в месяц. Ее годовой доход вырос на " + christinaSalaryDiff + " рублей");
    }
}
