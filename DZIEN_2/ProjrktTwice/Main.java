public class Main {
    public static void main(String[] args) {
        Twice<String,Integer> tw1 = new Twice<>("kolor niebieski",765);
        tw1.print();

        Twice<Boolean,Double> tw2 = new Twice<>(true,5.6767);
        tw2.print();
    }
}
