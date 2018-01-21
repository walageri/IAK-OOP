package com.blogspot.programer27android.iakh1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerimaData extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terima_data);
        t1= (TextView) findViewById(R.id.tr1);
        t2= (TextView) findViewById(R.id.tr2);

        Intent terimadata=getIntent();
        t1.setText(terimadata.getStringExtra("us"));
        t2.setText(terimadata.getStringExtra("ps"));
    }
}
