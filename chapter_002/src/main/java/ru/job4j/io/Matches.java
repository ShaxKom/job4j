package ru.job4j.io;

import java.util.Scanner;

/**
 * Игра 11 спичек на два игрока
 * @author Shakhzod Kamilov
 */

public class Matches {
    public static void main(String[] args) {
        boolean gameStopped = false;
        int matches = 11;
        int takenMatches;
        boolean playerOne = false;
        Scanner input = new Scanner(System.in);
        while (!gameStopped) {
            takenMatches = Integer.valueOf(input.nextLine());
            if (takenMatches > 0 && takenMatches < 4) {
                matches -= takenMatches;
                if (matches <= 0) {
                    matches = 0;
                    gameStopped = true;
                }
                System.out.println("Matches left: " + matches);
                playerOne = !playerOne;
            } else {
                System.out.println("Number of matches must be in range of 1 to 3!");
            }
        }
        if (playerOne) {
            System.out.println("First player wins!");
        } else {
            System.out.println("Second player wins!");
        }
    }
}
