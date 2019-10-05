package com.daus.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
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

    private EditText etKirimDataKeC;
    private void initViews() {
        findViewById(R.id.btnKeluarB).setOnClickListener(this);
        findViewById(R.id.btnKirimDataKeC).setOnClickListener(this);
        etKirimDataKeC = findViewById(R.id.etKirimData);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnKeluarB:
                finish();
                break;
            case R.id.btnKirimDataKeC:
                kirimDataKeC();
                break;

        }
    }

    private void kirimDataKeC() {
        Intent intent = new Intent(this, ActivityC.class);
        intent.putExtra("DATA_A","Data dari B");//utk mengirim String
        intent.putExtra("DATA_B",1);//utk mengirim integer
        intent.putExtra("DATA_C",0.5);//utk mengirim double
        intent.putExtra("DATA_D",0.5f);//utk mengirim float
        intent.putExtra("DATA_E",new int[]{0,1,2,3});//utk mengirim integer array
        intent.putExtra("DATA_F",new String[]{"A","B","C"});//utk mengirim integer array

        ObjectData objectData = new ObjectData("Ini huruf", 2, 1.1, 2.3f, new int[]{1,2,3,4},new String[]{"AA","BB","CC",});
        intent.putExtra("DATA_OBJECT",objectData);

        startActivity(intent);
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
