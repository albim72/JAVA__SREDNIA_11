import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=1; i<=15;i++){
            lista.add(i*3);
        }

        System.out.println(lista);
        lista.remove(5);
        System.out.println(lista);

        lista.set(1,19);
        System.out.println(lista);

        lista.remove(Integer.valueOf(27));
        System.out.println(lista);
        //czy na liście jest wybrany element?
        boolean cont = lista.contains(45);
        System.out.println("czy lista zawiera wybrany element? " + cont);

        //rozmiar listy
        System.out.println("Rozmiar listy: " + lista.size());
        ArrayList<String> mt = new ArrayList<>();

        boolean isEmpty = mt.isEmpty();
        System.out.println("Czy lista jest pusta? " + isEmpty);

        Collections.sort(lista);
        System.out.println("lista posortowana A-Z: " + lista);
        lista.sort(Collections.reverseOrder());
        System.out.println("lista posortowana Z-A: " + lista);
    }
}
