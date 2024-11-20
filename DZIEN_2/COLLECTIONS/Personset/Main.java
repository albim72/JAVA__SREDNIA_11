import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        HashSet<Person> osoby = new HashSet<>();
        osoby.add(new Person("Jan",66));
        osoby.add(new Person("Anna",31));
        osoby.add(new Person("Adam",37));
        osoby.add(new Person("Marcin",50));
        osoby.add(new Person("Jan",66));

        System.out.println("Zbiór obiekty: " + osoby);
    }
}
