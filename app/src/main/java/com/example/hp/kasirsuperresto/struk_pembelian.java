package com.example.hp.kasirsuperresto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class struk_pembelian extends AppCompatActivity {

    TextView gulaiText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk_pembelian);
        gulaiText = (TextView) findViewById(R.id.ogulai);


    }

    private void getSharedPreferences(String gulaiii) {
        String gulaiText = gulaiii;
    }
}
