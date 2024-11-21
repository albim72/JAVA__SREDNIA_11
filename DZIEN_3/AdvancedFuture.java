import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start programu!");

        //Zadanie asynchroniczne
        CompletableFuture<String> dataFuture = CompletableFuture.supplyAsync(()->{
            try{
                System.out.println("Pobieranie danych...");
                Thread.sleep(2000);
                return "Dane z serwera";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });

        //Asynchroniczne przetwarzanie danych
        CompletableFuture<String> processedDataFuture = dataFuture.thenApply(data -> {
            System.out.println("Przetwarzanie danych: " + data);
            return data.toUpperCase();
        });

        //Wyświetlenie wyniku po przetworzeniu
        processedDataFuture.thenAccept(processedData -> {
            System.out.println("Przetworzone dane: " + processedData);
        });


        System.out.println("Kontunuuję inne operacje w programie...");

        processedDataFuture.join();

        System.out.println("Koniec programu!");
    }
}
