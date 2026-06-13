
# Simple Java Music Player

A straightforward, console-based audio player written in Java. This project was built to practice core Java programming, handling files, managing inputs, and dealing with exceptions (errors) cleanly.

---

## 🚀 Features

- **Efficient Streaming:** It streams `.wav` files smoothly instead of loading the whole track into memory at once.
- **Automatic Clean-up:** Uses Java's `try-with-resources` to make sure system files and tools close automatically when you quit, preventing memory leaks.
- **Error Handling:** Covers common audio issues cleanly—if a file is missing or formatted wrong, the app tells you exactly what happened instead of crashing.

---

## 📂 Project Structure

```text
simple-java-music-player/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/david/musicplayer/
│       │       └── Main.java             # The core player code
│       └── resources/     
│       │   └── audio/         
│       │       └── sample.wav            # The music track
├── .gitignore                            
└── pom.xml                           

```

---

## ⌨️ Controls

Run the application and type these letters into the terminal to control your music:

* **P** : Play the song (or resume if it was stopped).
* **S** : Stop the music right where it is.
* **R** : Reset the song back to the very beginning (0 seconds).
* **Q** : Quit the app safely.

---

## 💻 How to Run It

### Prerequisites

* Make sure you have **Java 17 (or higher)** and **Maven** installed.

### Steps

1. Clone this repository to your laptop:
```bash
git clone [https://github.com/adupoku71/simple-java-music-player.git]

```


2. Open the project folder in your terminal:
```bash
cd simple-java-music-player
```


3. Build the project using Maven:
```bash
mvn clean compile

```


4. Run the player:
```bash
mvn exec:java -Dexec.mainClass="com.david.musicplayer.Main"
```
---

## 🛠️ Future Roadmap

* [ ] **Phase 2 (Clean OOP Structure):** Split the code into different files (an `AudioPlayer` engine and a separate `ConsoleMenu` interface) to make it cleaner.
* [ ] **Phase 3 (MP3 Support):** Add external Java libraries to support playing compressed `.mp3` files.
* [ ] **Phase 4 (Playlists):** Add logic to store multiple songs and skip between tracks.
