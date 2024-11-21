public class Animal implements Runnable{
    private String name;
    private int speed;

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try{
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                System.out.println(name + "został zatrzymany!");
                return;
            }
            System.out.println(name + " pokonał krok " + i);
        }
        System.out.println(name + " ukończył wyścig!");
    }
}
