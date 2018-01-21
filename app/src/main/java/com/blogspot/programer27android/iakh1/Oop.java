package com.blogspot.programer27android.iakh1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Oop extends AppCompatActivity {
    public class Burung{
//        variable
        String nama,warna,sayap;

        public Burung(String nama) {
            this.nama=nama;
        }

        //        methode Burung
        public String terbang(){
            sayap="mengepak";
            return "Burung : "+nama+"Sedang Terbang"+"\n sayapnya : "+this.sayap;
        }
        public String diam(){
            sayap="diam";
            return "Burung : "+nama+"Sedang Diam"+"\n sayapnya : "+this.sayap;
        }

    }
    Burung burungnnuri=new Burung("nuri");
    Burung merpati=new Burung("merpati");
    TextView burung,keadaan;
    ImageButton btnuri,btnuriterbang,btmerpatidiam,btmerpatiterbang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oop);
        kInisialisasi();
        kNuri();
        kMerpati();
        click();

    }
    public void kInisialisasi(){
        //inisialisasi button.
        btnuri=(ImageButton)findViewById(R.id.nuridiam);
        btnuriterbang=(ImageButton)findViewById(R.id.nuriterbang);
        btmerpatidiam=(ImageButton)findViewById(R.id.merpatidiam);
        btmerpatiterbang=(ImageButton)findViewById(R.id.merpatiterbang);
        burung=(TextView)findViewById(R.id.burung);
        keadaan=(TextView)findViewById(R.id.keadaan);
    }
    public void kNuri(){
        burungnnuri.warna="merah";
        burungnnuri.terbang();
        burungnnuri.diam();
    }
    public void kMerpati(){
        merpati.warna="putih";
        merpati.terbang();
        merpati.diam();
    }

    public void click(){
        btnuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burung.setText("Burung : "+burungnnuri.nama+"\nwarnanya : "+burungnnuri.warna);
                keadaan.setText(burungnnuri.diam());
            }
        });
        btnuriterbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burung.setText("Burung : "+burungnnuri.nama+"\nwarnanya : "+burungnnuri.warna);
                keadaan.setText(burungnnuri.terbang());
            }
        });
        btmerpatidiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burung.setText("Burung : "+merpati.nama+"\nwarnanya : "+merpati.warna);
                keadaan.setText(merpati.diam());
            }
        });
        btmerpatiterbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burung.setText("Burung : "+merpati.nama+"\nwarnanya : "+merpati.warna);
                keadaan.setText(merpati.terbang());
            }
        });
    }

}
