package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 500);
        Book java = new Book("Java", 800);
        Book headFirst = new Book("Head First Java", 720);
        Book think = new Book("Thinking In Java", 1200);
        Book[] codeBooks = new Book[4];
        codeBooks[0] = cleanCode;
        codeBooks[1] = java;
        codeBooks[2] = headFirst;
        codeBooks[3] = think;
        for (Book index : codeBooks) {
            System.out.println(index.getName() + ", " + index.getPages() + " pages");
        }

        codeBooks[0] = think;
        codeBooks[3] = cleanCode;
        for (Book index : codeBooks) {
            System.out.println(index.getName() + ", " + index.getPages() + " pages");
        }

        for (Book index : codeBooks) {
            if (index.getName().equals("Clean Code")) {
                System.out.println(index.getName() + ", " + index.getPages() + " pages");
            }
        }
    }
}
