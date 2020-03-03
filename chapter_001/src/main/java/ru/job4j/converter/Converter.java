package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl  = value * 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 210;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println("210 rubles are 3. Test result: "  + passed);

        in = 480;
        expected = 8;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("480 rubles are 8. Test result: " + passed);
    }


}
