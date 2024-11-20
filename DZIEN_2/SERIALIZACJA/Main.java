import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //proces serializacji
        Content content = new Content(43,"Hello and Hi!");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("content.ser"))) {
            oos.writeObject(content);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //proces deserializacji
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("content.ser"))) {
            Content deserializedContent = (Content) ois.readObject();
            System.out.println("Zawartośc zdeserializowana: " + deserializedContent + ", " + deserializedContent.s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
