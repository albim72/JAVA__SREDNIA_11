public class Main{
    public static void main(String[] args) {
        System.out.println("Tworzenie nowej klasy");
        Kolory c1 = new Kolory(23,"czerwony","Paleta A");
        System.out.println(c1.printKolor("standardowa definicja: "));

        c1.setNrPaczki(44);
        System.out.println("nowy numer paczki: " + c1.getNrPaczki());

        Kolory c2 = new Kolory(67,"Jasny szary","Paleta GG");
        System.out.println(c2.printKolor("druga opcja -> "));
    }
}
