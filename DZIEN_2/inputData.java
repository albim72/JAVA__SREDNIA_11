import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("superdane.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Błąd! Nie znaleziono pliku");
            System.exit(1);

        }
        int bajt = 0;
        try {
            bajt = fis.read();
            while (bajt != -1){
                System.out.println((char) bajt);
                bajt = fis.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
