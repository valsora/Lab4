import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) {
        FileReader fileReader;
        FileWriter fileWriter;
        try {
            fileReader = new FileReader("from.txt");
            fileWriter = new FileWriter("to.txt");
            int i = fileReader.read();
            while (i != -1) {
                fileWriter.write(i);
                i = fileReader.read();
            }
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
