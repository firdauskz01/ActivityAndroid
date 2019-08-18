package com.daus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        Log.e("ActivityAndroid", "1. OnCreate A terpanggil");
        Toast.makeText(this, "1. OnCreate A terpanggil", Toast.LENGTH_SHORT).show();
    }

    private void initViews() {
        findViewById(R.id.btnStartActivityB).setOnClickListener(this);
        findViewById(R.id.btnKeluar).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnStartActivityB:
                Intent intent = new Intent(this, ActivityB.class);
                startActivity(intent);
                break;
            case R.id.btnKeluar:
                finish();
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ActivityAndroid", "onRestart A terpanggil");
        Toast.makeText(this, "onRestart A terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ActivityAndroid", "2. onStart A terpanggil");
        Toast.makeText(this, "2. onStart A terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ActivityAndroid", "3. onResume A terpanggil");
        Toast.makeText(this, "3. onResume A terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ActivityAndroid", "4. onPause A terpanggil");
        Toast.makeText(this, "4. onPause A terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ActivityAndroid", "5. onStop A terpanggil");
        Toast.makeText(this, "5. onStop A terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ActivityAndroid", "6. onDestroy A terpanggil");
        Toast.makeText(this, "6. onDestroy A terpanggil", Toast.LENGTH_SHORT).show();
    }

}
