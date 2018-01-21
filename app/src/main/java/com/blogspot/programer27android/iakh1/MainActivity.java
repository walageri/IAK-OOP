package com.blogspot.programer27android.iakh1;

import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Context c;
    EditText edt, edt2;
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText) findViewById(R.id.user);
        edt2 = (EditText) findViewById(R.id.password);
        Button bt = (Button) findViewById(R.id.login);
        img= (ImageButton) findViewById(R.id.next);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = edt.getText().toString();
                String t2 = edt2.getText().toString();
                if (t1.isEmpty()) {
                    edt.setError("user name tidak boleh kosong");
                } else if (t2.isEmpty()) {
                    edt2.setError("Password tidak boleh kosong");
                } else {
                    Intent kirimdata = new Intent(MainActivity.this, TerimaData.class);
                        kirimdata.putExtra("us",t1);
                        kirimdata.putExtra("ps",t2);
                    startActivity(kirimdata);
                    finish();

                }
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                startActivity(new Intent(MainActivity.this,Oop.class));
            }
        });

    }
}
