package com.daus.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityC extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Intent intent = getIntent();
        String DATA_A = intent.getStringExtra("DATA_A");//menerima string
        int DATA_B = intent.getIntExtra("DATA_B",0);//menerima integer
        double DATA_C = intent.getDoubleExtra("DATA_C",0.0);//utk menerima double
        float DATA_D = intent.getFloatExtra("DATA_D",0.5f);//utk menerima float
        int[] DATA_E = intent.getIntArrayExtra("DATA_E");//utk menerima integer array
        String[] DATA_F = intent.getStringArrayExtra("DATA_F");//utk menerima integer array
        ObjectData objectData = (ObjectData) intent.getSerializableExtra("DATA_OBJECT");
        if (objectData!=null){
            //antisipasi agar tidak crash
        }

    }
}
