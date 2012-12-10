package org.chynga;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Soketee {
	Socket soc;
	DataOutputStream out;
	public Soketee(String ip, int puerto){
		try {
			soc = new Socket(ip,puerto);
			out = new DataOutputStream(soc.getOutputStream());
			//informar con carteles los errores
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
		public void enviarMensaje(String mensaje) throws IOException {
			try {
			// Envia mensaje
			out.writeUTF(mensaje);
			out.flush();
			// Lee respuesta
			} finally {
			close();
			}
			}
			private void close() throws IOException {
			out.close();
			// Cerrar el socket
			soc.close();
		}
	
}
