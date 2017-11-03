package com.example.hp.kasirsuperresto;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class setting_harga extends AppCompatActivity {

    EditText gulaiInput,ayamInput,igaInput,mendoanInput,spagetiInput,rujakInput,esInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_harga);

        gulaiInput = (EditText) findViewById(R.id.hgulai);
        ayamInput = (EditText) findViewById(R.id.hayam);
        igaInput = (EditText) findViewById(R.id.higa);
        mendoanInput = (EditText) findViewById(R.id.hmendoan);
        spagetiInput = (EditText) findViewById(R.id.hspageti);
        rujakInput = (EditText) findViewById(R.id.hrujak);
        esInput = (EditText) findViewById(R.id.hes);
    }

    public void kliksimpan(View view) {
        SharedPreferences sharedPref = getSharedPreferences("owerInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("gulai", Integer.parseInt(gulaiInput.getText().toString()));
        editor.putInt("ayam", Integer.parseInt(ayamInput.getText().toString()));
        editor.putInt("iga", Integer.parseInt(igaInput.getText().toString()));
        editor.putInt("mendoan", Integer.parseInt(mendoanInput.getText().toString()));
        editor.putInt("spageti", Integer.parseInt(spagetiInput.getText().toString()));
        editor.putInt("rujak", Integer.parseInt(rujakInput.getText().toString()));
        editor.putInt("es", Integer.parseInt(esInput.getText().toString()));
        editor.apply();

        Toast.makeText(this, "Tersimpan", Toast.LENGTH_SHORT).show();
    }
}
