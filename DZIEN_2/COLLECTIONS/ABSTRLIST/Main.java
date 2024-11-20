import java.util.AbstractList;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        AbstractList<String> miasta = new ArrayList<>();
        miasta.add("Lublin");
        miasta.add("Warszawa");
        miasta.add("Kraków");
        miasta.add("Wrocław");
        miasta.add("Gdańsk");

        System.out.println("Lista abstrakcyjna: " + miasta);

        CustomList list = new CustomList(5);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Lista po dodaniu elementów:\n");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.set(1,25);
        System.out.println("\nlista po zmianie elementu...");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.remove(0);
        System.out.println("\nlista po usunięciu elementu...");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.add(56);
        list.add(77);
        list.add(12);
        list.add(83);
        list.add(25);
    }
}
