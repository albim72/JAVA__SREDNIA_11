import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zapis {
    //metoda zapisująca dane do pliku
    public void zapiszDoPliku(String filePath, String[] lines){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for (String line:lines){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Dane zostały zapisane do pliku: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
