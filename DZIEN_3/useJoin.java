public class Main {
    public static void main(String[] args) {
        System.out.println("Rozpoczynam pracę wątków!");
        //Tworzenie i uruchamianie wątkow
        Thread thread1 = new Thread(()->{
            try{
                Thread.sleep(1000);
                System.out.println("Wątek 1 zakończył pracę");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()->{
            try{
                Thread.sleep(2000);
                System.out.println("Wątek 2 zakończył pracę");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("główny wątek kończy pracę!");
    }
}
