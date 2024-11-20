//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            String name = "Janusz";
            int wiek = 33;
            double bmi = 27.99;
            Integer n = 101;

            String s1 = String.format("imię zawodnika: %s",name);

            String s2 = String.format("wiek zawodnika %d",wiek);
            String s3 = String.format("BMI ciała zawodnika: %8.5f",bmi);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.printf("Dane zawodnika ->\nimię: %s\nwiek: %d\nbmi: %10.7f",name,wiek,bmi);
        System.out.printf("\nformat -> 1: %d\n2: [%10d]\n3: [%-10d]\n4: [% d]\n5: [%010d]\n",n,n,n,n,n);
    }
}
