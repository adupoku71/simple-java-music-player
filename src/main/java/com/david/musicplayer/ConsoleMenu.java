package com.david.musicplayer;

import java.util.Scanner;

public class ConsoleMenu {
    private final AudioPlayer player;

    ConsoleMenu(AudioPlayer player) {
        this.player = player;
    }

    public void startPlayer() {
        try (Scanner scanner = new Scanner(System.in)) {
            String response = "";

            while (!response.equals("Q")) {
                printOptions();
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> player.play();
                    case "S" -> player.stop();
                    case "R" -> player.reset();
                    case "Q" -> player.close();
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
    private void printOptions() {
        System.out.println("P = Play");
        System.out.println("S = Stop");
        System.out.println("R = Reset");
        System.out.println("Q = Quit");
        System.out.print("Enter your choice: ");
    }
}
