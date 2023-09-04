import java.io.IOException;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;


public class Costumer {
    public static void main(String[] args) throws IOException,UnknownHostException {

        Socket costumer = new Socket("26.48.28.14",3636);
        System.out.println("Costumer logged");
        Scanner t = new Scanner(System.in);
        PrintStream out = new PrintStream(costumer.getOutputStream());
        while (t.hasNextLine()){
            out.println(t.nextLine());
        }
        out.close();
        t.close();
        costumer.close();
    }
}
