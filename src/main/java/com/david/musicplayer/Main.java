package com.david.musicplayer;


import javax.sound.sampled.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "/audio/on-the-ground-by-kevin-macleod.wav";
        AudioPlayer player = new AudioPlayer();

        try(Scanner scanner = new Scanner(System.in)) {
            player.load(filePath);
            System.out.println("file was located");
            String response = "";

            while(!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> player.play();
                    case "S" -> player.stop();
                    case "R" -> player.reset();
                    case "Q" -> player.close();
                    default -> System.out.println("Invalid choice");
                }
            }


        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Thank you for using the player. Bye!!!");
        }
    }
}