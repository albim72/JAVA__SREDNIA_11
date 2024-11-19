//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Prototyp pt = new Prototyp(4, 5) {
//            @Override
//            public int policz() {
//                return 0;
//            }
//
//            @Override
//            public void msg() {
//
//            }
//        };
        MojaKlasa mk = new MojaKlasa(5,7,8);
        System.out.println(mk.opis());
        System.out.printf("wynik działania = %d\n",mk.policz());
        mk.msg();
    }
}
