package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button back, confirm;
        ImageView reset;
        EditText form;
        TextView hasil, num;

        num = findViewById(R.id.number);
        reset = findViewById(R.id.reset);
        hasil = findViewById(R.id.hasil);
        back = findViewById(R.id.buttonBack);
        confirm = findViewById(R.id.confirm);
        form = findViewById(R.id.form);

        java.util.Random random = new java.util.Random();
        int randomChoice = random.nextInt(100);
        int[] coba = {0};



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomChoice = random.nextInt(100);
                int[] coba = {0};
                hasil.setText("-");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                onPause();
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(form.getText().toString());
                String won = "You won!!! bot choice:" + randomChoice + "\n Percobaan " + coba[0] + " kali";
                String hintKurang = "Kurang dari " + angka;
                String hintLebih = "Lebih dari " + angka;
                if (randomChoice == angka){
                    hasil.setText(won);
                    int randomChoice = random.nextInt(100);
                    int coba = 0;
                } else if (angka < randomChoice){
                    coba[0]++;
                    hasil.setText(hintLebih);
                } else {
                    coba[0]++;
                    hasil.setText(hintKurang);
                }
            }
        });
    }
}