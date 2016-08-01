package com.example.admin.fragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener,
        Blank2Fragment.OnFragmentInteractionListener,Blank3Fragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   this.getSupportFragmentManager().beginTransaction().add(R.id.content,BlankFragment.newInstance()).commit(); //.comit():Thực thi
        this.getSupportFragmentManager().beginTransaction().add(R.id.content,new BlankFragment()).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
