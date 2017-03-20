package com.example.sarah.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements TextFragment.TextListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void applyText(String text) {
    PictureFragment picture = (PictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
    picture.setPictureText(text);
    }


}
