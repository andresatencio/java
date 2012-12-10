import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Cliente {
	public static void main(String args[]) throws UnknownHostException, IOException,Exception{
		Soketee so = new Soketee("192.168.1.102",1234);
		so.enviarMensaje("banana");
	}
}
