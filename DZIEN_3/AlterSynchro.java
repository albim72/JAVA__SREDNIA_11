import java.io.FileWriter;
import java.io.IOException;

public class SynchronizedFileWriting {
    private static final String FILE_PATH = "output.txt";

    public static void main(String[] args) {
        System.out.println("Rozpoczynam pracę wątków.");

        // Tworzenie wątków
        Thread writer1 = new Thread(new FileWriterTask("Dane z wątku 1\n"));
        Thread writer2 = new Thread(new FileWriterTask("Dane z wątku 2\n"));
        Thread writer3 = new Thread(new FileWriterTask("Dane z wątku 3\n"));

        // Uruchamianie wątków
        writer1.start();
        writer2.start();
        writer3.start();

        // Oczekiwanie na zakończenie wątków
        try {
            writer1.join();
            writer2.join();
            writer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Zapis zakończony.");
    }

    // Klasa reprezentująca zadanie wątku
    static class FileWriterTask implements Runnable {
        private final String content;

        public FileWriterTask(String content) {
            this.content = content;
        }

        @Override
        public void run() {
            writeToFile(content);
        }

        // Zapis do pliku z synchronizacją
        private static synchronized void writeToFile(String content) {
            try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
                writer.write(content);
                System.out.println(Thread.currentThread().getName() + " zapisał dane do pliku.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
