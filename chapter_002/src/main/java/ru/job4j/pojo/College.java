package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student shakhzod = new Student();
        shakhzod.setName("Shakhzod Kamilov");
        shakhzod.setGroup("Java-intern");
        shakhzod.setEntered(new Date(1581033600000L));

        System.out.println(shakhzod.getName() + " is a \"" + shakhzod.getGroup() + "\" student. Since " + shakhzod.getEntered());
    }
}
