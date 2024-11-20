import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Obiekty: Map");

        MapImplementation mape = new MapImplementation();


        //wyświetlanie LinkedHashMap
        Map<String,Integer> linkedhashMap = mape.getLinkedHashMap();
        mape.printMap(linkedhashMap,"LinkedHashMap (kolejnośc wstawiania)");

        //wyświetlanie TreeMap
        Map<String,Integer> treeMap = mape.getTreeMap();
        mape.printMap(treeMap,"TreeMap (sortowanie po kluczach)");

        //wyświetlanie HashMap
        Map<String,Integer> hashMap = mape.getHashMap();
        mape.printMap(hashMap,"HashMap (brak gwarancji kolejności)");
    }
}
