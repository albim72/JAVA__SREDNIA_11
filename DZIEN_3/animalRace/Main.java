public class Main {
    public static void main(String[] args) {
        System.out.println("Wyścig się rozpoczyna!");

        //Tworzenie wątków reprezentujących zwierzęta
        Thread rabbit = new Thread(new Animal("Królik",100));
        Thread turtle = new Thread(new Animal("Żółw",300));
        Thread horse = new Thread(new Animal("Koń",150));

        //start wątków
        rabbit.start();
        turtle.start();
        horse.start();

        //oczekiwanie na zakończenie wyścigu
        try {
            rabbit.join();
            turtle.join();
            horse.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
