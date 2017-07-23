package com.mirza.avantari.task;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView text;
    EditText editText;
    Button press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.text1);
        editText=(EditText)findViewById(R.id.editText);
        press=(Button)findViewById(R.id.button);
        startService(new Intent(this, Tracking.class));

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        text.append(String.valueOf(event.getKeyCode()));
        Toast.makeText(getBaseContext(),"hiiii"+event.getKeyCode(),Toast.LENGTH_SHORT).show();
        return super.dispatchKeyEvent(event);
    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        char c = (char) event.getUnicodeChar();
//        text.append("key code: "+c);
//        Toast.makeText(getBaseContext(),"hi"+event.getKeyCode(),Toast.LENGTH_SHORT).show();
//        return super.onKeyUp(keyCode, event);
//    }

}
