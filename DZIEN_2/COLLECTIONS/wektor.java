import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("czerwony");
        vector.add("zielony");
        vector.add("biały");
        vector.add("biały");
        vector.add("biały");
        vector.add("biały");
        vector.add("szary");
        vector.add("fioletowy");
        vector.add("fioletowy");
       

        System.out.println("Zawartośc wektora: " + vector);

        System.out.println("element o indeksie 2: " + vector.get(2));

        vector.remove(1);
        System.out.println("po usunięciu elementu: " + vector);

        System.out.println("Rozmiar wektora: " + vector.size());
        System.out.println("Pojemnośc wektora:" + vector.capacity());

        System.out.println("Iterowanie po elementach");
        for (String element: vector){
            System.out.println(element);
        }
    }
}
