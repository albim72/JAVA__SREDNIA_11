import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start programu!");

        //Zadanie asynchroniczne
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            try{
                System.out.println("Pobieranie danych...");
                Thread.sleep(2000);
                System.out.println("Dane zostały pobrane!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Kontunuuję inne operacje w programie...");

        future.join();

        System.out.println("Koniec programu!");
    }
}
