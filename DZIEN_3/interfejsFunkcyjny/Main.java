import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            int a = 6;
            int h = 12;

            Square s = (int x) -> x*x;
            Square q = (int x) -> x*x*x;
            Policz ee = (int x, int y) -> x+2*y;

            int ans = s.calculate(a);
            int qube = q.calculate(a);
            int pl = ee.calculate(a,h);

        System.out.println("Wyniki ->");
        System.out.println("ans = " + ans);
        System.out.println("qube = " + qube);
        System.out.println("pl = " + pl);

        ArrayList<Integer> wyniki = new ArrayList<>();
        wyniki.add(ans);
        wyniki.add(qube);
        wyniki.add(pl);
        wyniki.add(13);

        System.out.println("___________________________________________");
        wyniki.forEach(n-> System.out.println(n));
        System.out.println("___________________________________________");
        wyniki.forEach(n-> {
            if(n%2==0) System.out.println(n);
        });
    }
}
