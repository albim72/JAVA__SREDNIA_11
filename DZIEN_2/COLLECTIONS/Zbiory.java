import java.text.Collator;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Przykład 2 ---> HashSet");
        HashSet<String> set = new HashSet<>();
        set.add("Jabłko");
        set.add("Gruszka");
        set.add("Banan");
        set.add("Czereśnia");
        set.add("Malina");
        System.out.println("HashSet: " + set);
        set.add("Malina");
        System.out.println("HashSet: " + set);

        System.out.println("Czy zbiór zawoera Banana? " + set.contains("Banan"));

        set.remove("Banan");
        System.out.println("Zbiór po usunięciu elementu: " + set);

        System.out.println("Iteracja po HashSet:\n");
        for(String item: set){
            System.out.println(item);
        }

        List<String> kolory = new ArrayList<>();
        kolory.add("czerwony");
        kolory.add("zielony");
        kolory.add("biały");
        kolory.add("czarny");
        kolory.add("niebieski");
        kolory.add("czerwony");
        kolory.add("niebieski");
        kolory.add("czerwony");

        System.out.println("listaa kolorów: " + kolory);

        Set<String> hashcolor = new HashSet<>(kolory);
        System.out.println("HashSet kolory: " + hashcolor);

        System.out.println("Przykład 2 ---> LinkedHashSet");
        LinkedHashSet<String> marki = new LinkedHashSet<>();
        marki.add("Opel");
        marki.add("Audi");
        marki.add("Honda");
        marki.add("Toyota");
        marki.add("Seat");

        System.out.println("LinkedHashSet -> " + marki);

        System.out.println("Przykład 3 ---> TreeSet");
        Collator polishCollator = Collator.getInstance(new Locale("pl","PL"));
        TreeSet<String> imiona = new TreeSet<>(polishCollator);
        imiona.add("Maciej");
        imiona.add("Olga");
        imiona.add("Anna");
        imiona.add("Karol");
        imiona.add("Damian");
        imiona.add("Hanna");
        imiona.add("Lucjan");
        imiona.add("Łucja");

        System.out.println("TreeSet (porządek naturalny) -> " + imiona);
        System.out.println("Pierwszy element: " + imiona.first());
        System.out.println("Ostatni element: " + imiona.last());
    }
}
