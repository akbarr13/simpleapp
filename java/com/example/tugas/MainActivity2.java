package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bgmusic);
        Button back;
        TextView hasil, hasilBot, score;
        ImageView btnBatu, btnGunting, btnKertas;
        btnKertas = findViewById(R.id.kertas);
        hasil = findViewById(R.id.winner);
        hasilBot = findViewById(R.id.botChoice);
        score = findViewById(R.id.textScore);
        btnGunting = findViewById(R.id.gunting);
        back = findViewById(R.id.buttonBack);
        btnBatu = findViewById(R.id.batu);

        final int[] scores = {0};

        ToggleButton toggle = (ToggleButton) findViewById(R.id.music);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mediaPlayer.start();
                    mediaPlayer.setLooping(true);
                } else{
                    mediaPlayer.pause();
                    mediaPlayer.seekTo(0);
                }
            }
        });


        btnKertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teks;
               String playerChoice = "kertas";
                String[] choices = {"gunting", "kertas", "batu"};
                java.util.Random random = new java.util.Random();
                int random_choice;
                random_choice = random.nextInt(choices.length);
                String botHasil = "Bot memilih: " + choices[random_choice];

                if(playerChoice.equals("kertas") && random_choice == 2){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("gunting") && random_choice == 1){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("batu") && random_choice == 0){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("batu") && random_choice == 1) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else if (playerChoice.equals("gunting") && random_choice == 2) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else if (playerChoice.equals("kertas") && random_choice == 0) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else {
                    teks = "Hasil seri!";
                    hasil.setText(teks);
                }

            }
        });

        btnBatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teks;
                String playerChoice = "batu";
                String[] choices = {"gunting", "kertas", "batu"};
                java.util.Random random = new java.util.Random();
                int random_choice;
                random_choice = random.nextInt(choices.length);
                String botHasil = "Bot memilih: " + choices[random_choice];

                if(playerChoice.equals("kertas") && random_choice == 2){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("gunting") && random_choice == 1){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("batu") && random_choice == 0){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("batu") && random_choice == 1) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else if (playerChoice.equals("gunting") && random_choice == 2) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else if (playerChoice.equals("kertas") && random_choice == 0) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else {
                    teks = "Hasil seri!";
                    hasil.setText(teks);
                }

            }
        });

        btnGunting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teks;
                String playerChoice = "gunting";
                String[] choices = {"gunting", "kertas", "batu"};
                java.util.Random random = new java.util.Random();
                int random_choice;
                random_choice = random.nextInt(choices.length);
                String botHasil = "Bot memilih: " + choices[random_choice];

                if(playerChoice.equals("kertas") && random_choice == 2){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("gunting") && random_choice == 1){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("batu") && random_choice == 0){
                    teks = "Kamu menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                    scores[0]++;
                    score.setText(String.valueOf(scores[0]));
                }else if (playerChoice.equals("batu") && random_choice == 1) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else if (playerChoice.equals("gunting") && random_choice == 2) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else if (playerChoice.equals("kertas") && random_choice == 0) {
                    teks = "Bot menang!";
                    hasil.setText(teks);
                    hasilBot.setText(botHasil);
                }else {
                    teks = "Hasil seri!";
                    hasil.setText(teks);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    finish();
                    mediaPlayer.release();
            }
        });


}

public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}