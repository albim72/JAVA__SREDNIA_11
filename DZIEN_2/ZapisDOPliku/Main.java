import java.time.format.SignStyle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String filePath = "xyz.txt";
        String[] lines = {
                "Pierwsza linia danych",
                "Druga linia danych",
                "Trzecia linia danych"
        };

        Zapis zapis = new Zapis();
        zapis.zapiszDoPliku(filePath,lines);

    }
}
