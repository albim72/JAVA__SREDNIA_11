import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

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

        /// /drugi przypadek
        Content cn = new Content(456,"bardzo ważne informacje...");

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oost = new ObjectOutputStream(fos);
        oost.writeObject(cn);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream oiss = new ObjectInputStream(fis);
        Content b = (Content) oiss.readObject();
        System.out.println(b.i + " - " + b.s);
        oost.close();
        oiss.close();
    }
}
