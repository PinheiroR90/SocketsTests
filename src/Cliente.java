import java.net.Socket;
import java.util.Scanner;

public class Cliente extends Socket {

    private String msg;

    Scanner sc = new Scanner(System.in);

    public String getMsg() {
        return msg;
    }

    public String setMsg() {
        String msg = sc.next();
        return msg;
        // return msg;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
