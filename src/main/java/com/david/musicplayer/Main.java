package com.david.musicplayer;


import javax.sound.sampled.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "/audio/sample.wav";
        AudioPlayer player = new AudioPlayer();

        try(Scanner scanner = new Scanner(System.in)) {
            player.load(filePath);
            System.out.println("file was located");

            ConsoleMenu menu = new ConsoleMenu(player);
            menu.startPlayer();

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