import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    static int PORT = 9999;
    public static void main(String[] args) throws IOException {
        System.out.println("----Simple Client--------");

        InetAddress ipAddress = InetAddress.getLocalHost();

        Socket socket = new Socket(ipAddress,PORT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Server is connected");
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader in = new BufferedReader(isr);

        try{
            while (true){
                String input = in.readLine();
                System.out.println("Server Says :" +input);

                System.out.print("Me: ");
                String output = scanner.nextLine();
                out.println(output);
            }
        } finally {
            in.close();
            socket.close();
            scanner.close();
        }

    }
}