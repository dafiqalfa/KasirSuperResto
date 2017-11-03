package com.example.hp.kasirsuperresto;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static com.example.hp.kasirsuperresto.R.id.igulai;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setHarga:
                Toast.makeText(this,"keno",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public void settinggg(MenuItem item) {
        Intent it = new Intent(this,setting_harga.class);
        startActivity(it);
    }

    public void klikstruck(View view) {
        SharedPreferences sharedPref = getSharedPreferences("owerInfo", Context.MODE_PRIVATE);
        int gulaii = sharedPref.getInt("gulai",0);
        int ayamm = sharedPref.getInt("ayam",0);

        double gulaiii = igulai * gulaii;


        Intent struck = new Intent(this,struk_pembelian.class);
        startActivity(struck);
    }

}
