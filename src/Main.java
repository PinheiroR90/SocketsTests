import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

   /* public static void main(String[] args) {
        System.out.println("Pag Main");
        Socket msgCli = new Cliente();
        TestServerSocket servidor = new TestServerSocket();

        //Scanner sc = new Scanner(msgCli.setMsg());

        String messagem = ((Cliente) msgCli).setMsg();

        System.out.println(messagem);

        try {
            PrintStream saida = new PrintStream(messagem);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        PrintStream saida = new PrintStream(messagem.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            saida.println(sc.nextLine());
        }


    }*/
}
