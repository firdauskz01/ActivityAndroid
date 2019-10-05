package com.daus.activity;

import java.io.Serializable;

public class ObjectData implements Serializable {
    String dataHuruf;
    int dataInteger;
    double dataDouble;
    float dataFloat;
    int[] dataArrayInteger;
    String[] dataArrayString;

    public ObjectData(String dataHuruf, int dataInteger, double dataDouble, float dataFloat, int[] dataArrayInteger, String[] dataArrayString){
        this.dataHuruf = dataHuruf;
        this.dataInteger = dataInteger;
        this.dataDouble = dataDouble;
        this.dataFloat = dataFloat;
        this.dataArrayInteger = dataArrayInteger;
        this.dataArrayString = dataArrayString;
    }

    public int getDataInteger() {
        return dataInteger;
    }

    public String getDataHuruf() {
        return dataHuruf;
    }

    public float getDataFloat() {
        return dataFloat;
    }

    public double getDataDouble() {
        return dataDouble;
    }

    public int[] getDataArrayInteger() {
        return dataArrayInteger;
    }

    public String[] getDataArrayString() {
        return dataArrayString;
    }
}
