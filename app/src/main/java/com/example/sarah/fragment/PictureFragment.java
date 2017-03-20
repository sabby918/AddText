package com.example.sarah.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PictureFragment extends Fragment {

    private static TextView textView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.picture_fragment, container, false);


        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void setPictureText(String text){
        textView.setText(text);
    }


}
