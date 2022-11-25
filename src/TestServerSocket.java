import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestServerSocket {
    //public static void main(String[] args) throws IOException {

       // System.out.println("Servidor!");



       /*  verificando a porta

       try {
            ServerSocket myServer = new ServerSocket(8080);
            System.out.println(" My server running the gate 8080");

            Socket cliente = myServer.accept();

            myServer.bind(new InetSocketAddress("192.168.1.0", 0));
           myServer.close();
           // myServer.getChannel();
        } catch (IOException e) {
            throw new RuntimeException("caiu aqui ",e);
        }*/

        /* test Inet e verifica se está fechada a conexao

        try {
            ServerSocket meuServer = new ServerSocket(1234);
            InetAddress myInet = meuServer.getInetAddress();
            System.out.println(".....");
            System.out.println("HostAddres = "+myInet.getHostAddress());
            System.out.println("HostName = "+myInet.getHostName());
            System.out.println("minha port = "+meuServer.getLocalPort());
            //meuServer.close();
            if(!meuServer.isClosed()){
                System.out.println("Esta aberto");
            }else{
                System.out.println("esta fechado!");
            }

        }catch (IOException e){
            e.printStackTrace();
        }*/
   /*  metodo isBound permite gerar um novo bind(uma nova porta), toString ler toda info porta
        try {
            ServerSocket miServer = new ServerSocket(4321);
            InetAddress inet_MiServe = miServer.getInetAddress();
            if (!miServer.isBound()){
                 miServer.bind(new InetSocketAddress("192.168.0.1",1));

            }
            System.out.println("meu novo end: "+inet_MiServe.getHostAddress());
            System.out.println("---------------------");

            System.out.println("aqui: "+miServer.toString());

        }catch (IOException e){
            e.printStackTrace();
        }

*/
        public static void main(String[] args) {
           try {
               ServerSocket myServer = new ServerSocket(8081);
               System.out.println("server init on gate 8081");

               Socket client = myServer.accept();
               System.out.println("Cliente conectado no IP: "+ client.getInetAddress().getHostAddress());

               Scanner sc = new Scanner(client.getInputStream());

               while (sc.hasNextLine()){
                   System.out.println(sc.nextLine());
               }
               sc.close();
               myServer.close();


           }catch (IOException e){
              // Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,e);
               e.getStackTrace();
           }
        }
}