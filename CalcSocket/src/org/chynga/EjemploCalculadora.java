package org.chynga;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EjemploCalculadora extends Activity implements OnClickListener {
private static final String CATEGORIA = "libro";
private static final String IP = "200.5.96.190";
private static final int PUERTO = 7777;
/** Called when the activity is first created. */
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	try{
	Calculadora c = new Calculadora(IP,PUERTO);
	c.sumar(22, 23);
	}catch(IOException e){
		
	}
	
}

}