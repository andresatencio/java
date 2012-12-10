package org.chynga;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SocketeActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle bundle) {
    	super.onCreate(bundle);
    	setContentView(R.layout.main);
    	Button b = (Button) findViewById(R.id.btnENVIAR);
    	b.setOnClickListener(this);
    	}
	@Override
	public void onClick(View v) {
		EditText IP = (EditText) findViewById(R.id.txtIP);
		EditText PUERTO = (EditText) findViewById(R.id.txtPUERTO);
		TextView MENSAJE = (TextView) findViewById(R.id.txtMENSAJE);
		String ip = IP.getText().toString();
		String mensaje = MENSAJE.getText().toString();
		int puerto = Integer.parseInt(PUERTO.getText().toString());
		Soketee socket = new Soketee(ip,puerto);
		try {
			socket.enviarMensaje(mensaje);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}