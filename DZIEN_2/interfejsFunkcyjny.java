import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Object,String> toStringFunction = obj -> obj.toString();

        System.out.println(toStringFunction.apply(43));
        System.out.println(toStringFunction.apply("Kraków"));
        System.out.println(toStringFunction.apply(3.14));
        System.out.println(toStringFunction.apply(true));
    }
}
