package com.example.intents;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button envinfo;
    TextView Texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        envinfo = findViewById(R.id.sendinfo);
        Texto = findViewById(R.id.texto);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sendinfo:
                Intent it4 = new Intent(Intent.ACTION_SEND);
                it4.putExtra("Mensaje","Daniel Rodriguez");
                it4.setType("text/Plain");
                startActivity(Intent.createChooser(it4,"Elige una aplicación"));

        }

    }
}
