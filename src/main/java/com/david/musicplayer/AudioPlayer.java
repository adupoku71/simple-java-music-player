package com.david.musicplayer;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AudioPlayer {

    private Clip clip;


    public void load(String trackPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        InputStream stream = getClass().getResourceAsStream(trackPath);
        if (stream == null) {
            throw new IOException("Track not found at " + trackPath);
        }
        InputStream bufferedStream = new BufferedInputStream(stream);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedStream);

        clip = AudioSystem.getClip();
        clip.open(audioStream);
    }

    public void play() {
        if (clip != null) {
            clip.start();
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
        }
    }

    public void reset() {
        if (clip != null) {
            clip.setMicrosecondPosition(0);
        }
    }

    public void close() {
        if (clip != null) {
            clip.close();
        }
    }
}
