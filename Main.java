import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        try {
            if (scan.hasNextInt()) number = scan.nextInt();
            else {
                scan.next();
                throw new CustomInputMismatchException("Input is not an integer");
            }
        } catch (CustomInputMismatchException e) {
            System.out.println(e.toString());
            exeptionLogger(e);
            number = 0;
        }
        scan.close();
    }

    public static void exeptionLogger(Exception exception) {
        try {
            FileWriter fw = new FileWriter("exeptionsLog.txt", true);
            String eString = exception.toString() + "\n";
            for (int i = 0; i < eString.length(); i++) {
                fw.write((int)(eString.charAt(i)));
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
