import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementation {
    private final Map<String, Integer> sampleData;

    public MapImplementation() {
        sampleData = new HashMap<>();
        sampleData.put("Jabłko", 7);
        sampleData.put("Gruszka", 12);
        sampleData.put("Morela", 5);
        sampleData.put("Banan", 7);
        sampleData.put("Wiśnia", 5);
        sampleData.put("Śliwka", 12);
    }
    //metoda zwracająca HashMap
    public Map<String,Integer> getHashMap(){
        return new HashMap<>(sampleData);
    }
    
    //Metoda zwracająca LinkedHashMap
    public Map<String,Integer> getLinkedHashMap(){
        return new LinkedHashMap<>(sampleData);
    }
    
    //Metoda zwracająca TreeMap
    public Map<String,Integer> getTreeMap(){
        return new TreeMap<>(sampleData);
    }
    
    //metoda pomcnicza do wyświetlania zawartości mapy
    public void printMap(Map<String,Integer> map,String mapType){
        System.out.println("\n" + mapType + ":");
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Klucz: " + entry.getKey() + ", wartośc: " + entry.getValue());
        }
    }

}
