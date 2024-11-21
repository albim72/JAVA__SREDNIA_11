import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 10_000_000;
        System.out.println("Rozpoczęcie obliczeń!");

        //pomiar czasu dla wykonania sekwencyjnego
        long sequentialStart = System.currentTimeMillis();
        List<Integer> sequentialPrimes = findPrimesSeqential(start,end);
        long sequentialEnd = System.currentTimeMillis();
        System.out.println("Sekwencyjne: Znaleziono " + sequentialPrimes.size() + " liczb pierwszych " +
                (sequentialEnd-sequentialStart) + " ms.");

        //pomiar czasu dla wykonania równoległego
        long parallelStart = System.currentTimeMillis();
        List<Integer> parallelPrimes = findPrimesParallel(start,end);
        long parallelEnd = System.currentTimeMillis();
        System.out.println("Równolegle: Znaleziono " + parallelPrimes.size() + " liczb pierwszych " +
                (parallelEnd-parallelStart) + " ms.");

    }

    public static List<Integer> findPrimesSeqential(int start, int end){
        return IntStream.rangeClosed(start,end)
                .filter(Main::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> findPrimesParallel(int start,int end){
        return IntStream.rangeClosed(start,end)
                .parallel() //kluczowa różnica -  przetwarzanie rówmnoległe!
                .filter(Main::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number){
        if(number<=1) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(number))
                .allMatch(n->number%n!=0);
    }
}
