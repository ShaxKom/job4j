package ru.job4j.oop;

public class Jukebox {
    private static final String LN = System.lineSeparator();
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пуст бегут неуклюже" + LN
                    + "Пешеходы по лужам," + LN
                    + "А вода — по асфальту рекой." + LN
                    + "И неясно прохожим" + LN
                    + "В этот день непогожий," + LN
                    + "Почему я веселый такой." + LN
                    + "");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят." + LN
                    + "Одеяла и подушки ждут ребят." + LN
                    + "Даже сказка спать ложится," + LN
                    + "Чтобы ночью нам присниться." + LN
                    + "Ты ей пожелай:" + LN
                    + "Баю-бай." + LN
                    + "");
        } else {
            System.out.println("Песня не найдена");
        }

    }

    public static void main(String[] args) {
        Jukebox rest = new Jukebox();
        rest.music(1);
        rest.music(2);
        rest.music(3);
    }
}
