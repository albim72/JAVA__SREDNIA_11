public class Kolory {
    //definicja stanu
    int id;
    String nazwaKoloru;
    String paleta;
    private int nrPaczki;

    public Kolory(int id, String nazwaKoloru, String paleta) {
        this.id = id;
        this.nazwaKoloru = nazwaKoloru;
        this.paleta = paleta;
        this.nrPaczki = 2;
        this.message();
    }
    
    public void message(){
        System.out.println("utworzono nowy kolor...");
    }

    public int getNrPaczki() {
        return nrPaczki;
    }

    public void setNrPaczki(int nrPaczki) {
        this.nrPaczki = nrPaczki;
    }

    public String printKolor(String info){
       return info + "nazwa koloru: " + nazwaKoloru + ", paleta: " + paleta + ", numer paczki: " +nrPaczki;
    }
}
