package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView teks1, hasil;
    EditText angkaSatu, angkaDua, operator;
    Button btnPlus, btnMin, btnMul, btnDiv, confirm, luas, compare, suit, tebakAngka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tebakAngka = findViewById(R.id.tebakAngka);
        angkaSatu= findViewById(R.id.txtAngkaSatuForm);
        angkaDua= findViewById(R.id.txtAngkaDuaForm);
        operator = findViewById(R.id.operatorForm);
        teks1= findViewById(R.id.TextView1);
        hasil = findViewById(R.id.hasil);
        confirm = findViewById((R.id.buttonconfirm));
        luas = findViewById(R.id.buttonSegitiga);
        compare = findViewById(R.id.buttonCompare);
        suit = findViewById(R.id.buttonSuit);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char op = operator.getText().charAt(0);
                int angka2=Integer.parseInt(angkaDua.getText().toString());
                int c;
                int angka1=Integer.parseInt(angkaSatu.getText().toString());
                char[] list = {'x', '-', ':', '+'};
                boolean req = false;
                if (Arrays.asList(op).contains(list)) {
                    req = true;
                }

                    if (op == '+') {
                        c = angka1 + angka2;
                        hasil.setText("hasil: " + (String.valueOf(c)));
                    } else if (op == '-') {
                        c = angka1 - angka2;
                        hasil.setText("hasil: " + (String.valueOf(c)));
                    } else if (op == 'x') {
                        c = angka1 * angka2;
                        hasil.setText("hasil: " + (String.valueOf(c)));
                    } else if (op == ':') {
                        c = angka1 / angka2;
                        hasil.setText("hasil: " + (String.valueOf(c)));
                    } else if (req == false) {
                        hasil.setText("Masukkan operator!");
                    } else {
                        hasil.setText("Error, operator tidak diketahui");
                    }
            }
        });
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka2=Integer.parseInt(angkaDua.getText().toString());
                int c;
                int angka1=Integer.parseInt(angkaSatu.getText().toString());
                c=angka1 * angka2 / 2;
                hasil.setText("hasil: " + (String.valueOf(c)));
            }
        });

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka2=Integer.parseInt(angkaDua.getText().toString());
                int angka1=Integer.parseInt(angkaSatu.getText().toString());
                if(angka1 < angka2){
                    hasil.setText("Angka " + angka1 + " lebih kecil dari " + "angka "+angka2 );
                }else if(angka1>angka2){
                    hasil.setText("Angka " + angka1 + " lebih besar dari " + "angka "+angka2 );
                }else if(angka1==angka2){
                    hasil.setText("Angka " + angka1 + " sama dengan " + "angka "+angka2 );
                }
            }
        });

        suit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuitActivity();
            }
        });

        tebakAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberActivity();
            }
        });
    }

    public void openNumberActivity(){
        Intent number = new Intent(this, MainActivity3.class);
        startActivity(number);
    }

    public void openSuitActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}

