package com.bluelife.mm.fragmentbackstack;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //removeFragment();
                //addFragment();
                //showFragment();
                attachFragment();
            }
        });

    }

    protected void removeFragment(){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.remove(fragment);
        transaction.commit();
    }
    public void showFragment(){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.show(fragment);
        transaction.commit();
    }
    public void attachFragment(){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.attach(fragment);
        transaction.commit();
    }
}
