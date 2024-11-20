import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String filePath = "xyz.txt";

        try(FileWriter writer = new FileWriter(filePath,true)){
            writer.write("następna linia...\n");
            writer.append("super dane...\n");
            System.out.println("dane dopisane do pliku");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
