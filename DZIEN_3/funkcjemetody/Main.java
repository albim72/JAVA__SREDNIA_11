import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FunctionalMethods fm = new FunctionalMethods();

        int sum = fm.add(10,15);
        System.out.println("dodawanie: " + sum);

        int product = fm.multi(4,6);
        System.out.println("Mnożenie: " + product);

        try {
            int division = fm.div(20,4);
            System.out.println("Dzielenie: " + division);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        int tax1 = fm.applyTax1(1000);
        int tax2 = fm.applyTax2(12000);
        int tax3 = fm.applyTax3(7000);

        System.out.println("Kwota z podatkiem (procent1): " + tax1);
        System.out.println("Kwota z podatkiem (procent2): " + tax2);
        System.out.println("Kwota z podatkiem (procent3): " + tax3);

        //przykłady manipulacji listami
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);
        System.out.println("Lista początkowa: " + numbers);

        List<Integer> updatedList = fm.append(3,numbers);
        System.out.println("Lista po append: " + numbers);

        List<Integer> newList = fm.append2(13,numbers);
        System.out.println("Nowa lista w append2: " + newList);
        System.out.println("Lista początkowa po append2: " + numbers);

        System.out.println("Aktualna wartosc percent 2: " + fm.percent2);

    }
}
