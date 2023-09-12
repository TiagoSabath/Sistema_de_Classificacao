package com.example.sistemadeclassificao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtstatus ;
    private RatingBar rtbvotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtstatus = findViewById(R.id.txtstatus);
        rtbvotacao = findViewById(R.id.rtbvotacao);

        rtbvotacao.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                if (rating ==1 ){
                    txtstatus.setText("Status: Ruim");
                } else if (rating == 2) {
                    txtstatus.setText("Status: Regular");
                }else if (rating == 3) {
                    txtstatus.setText("Status: Bom");
                }else if (rating == 4) {
                    txtstatus.setText("Status: Ótimo");
                }else if (rating == 5) {
                    txtstatus.setText("Status: Excelente");
                }
            }
        });
    }
}