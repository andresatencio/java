import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServidorAndroide {
	static ServerSocket serverSocket;
	static Socket socket;
	private static final int PUERTO = 7777;
	public static void main(String[] args) throws IOException {
		try {
			serverSocket = new ServerSocket(PUERTO);
			System.out.println("Socket abierto en el puerto 7766");	
			System.out.println("esperando...");
			while (true) {
	
		
		socket = serverSocket.accept();
		StringWriter sw = new StringWriter();
		BufferedInputStream en = new BufferedInputStream(socket.getInputStream());
		DataInputStream in = new DataInputStream(socket.getInputStream());
		
		en.
		
		System.out.println(in.readUTF()+"\n");
		if(in.readUTF().toString().equals("salir"))
		{
		in.close();
		socket.close();
		break;
		}
		
	}
	
		} catch (IOException e) {
		e.printStackTrace();
		
	
}
}
}
