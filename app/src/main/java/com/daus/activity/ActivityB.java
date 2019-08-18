package com.daus.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        initViews();

        Log.e("ActivityAndroid", "1. onStart B terpanggil");
        Toast.makeText(this, "1. onStart B terpanggil", Toast.LENGTH_SHORT).show();
    }

    private void initViews() {
        findViewById(R.id.btnKeluarB).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnKeluarB:
                finish();
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ActivityAndroid", "onRestart B terpanggil");
        Toast.makeText(this, "onRestart B terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ActivityAndroid", "2. onStart B terpanggil");
        Toast.makeText(this, "2. onStart B terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ActivityAndroid", "3. onResume B terpanggil");
        Toast.makeText(this, "3. onResume B terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ActivityAndroid", "4. onPause B terpanggil");
        Toast.makeText(this, "4. onPause B terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ActivityAndroid", "5. onStop B terpanggil");
        Toast.makeText(this, "5. onStop B terpanggil", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ActivityAndroid", "6. onDestroy B terpanggil");
        Toast.makeText(this, "6. onDestroy B terpanggil", Toast.LENGTH_SHORT).show();
    }

}
