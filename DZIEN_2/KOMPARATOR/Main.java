import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(545,"Zenobiusz","adres1"));
        ar.add(new Student(122,"Ziuta","adres2"));
        ar.add(new Student(128,"Olga","adres3"));
        ar.add(new Student(423,"Piotr","adres4"));
        ar.add(new Student(311,"Gienio","adres5"));
        ar.add(new Student(378,"Beata","adres6"));
        ar.add(new Student(562,"Klaudiusz","adres7"));

        System.out.println("Nieposortowane: \n");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar,new SortByRoll());
        System.out.println("Posortowane według nr albumu");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar,new SortByName());
        System.out.println("Posortowane według imienia");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
