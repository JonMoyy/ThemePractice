package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void onClickMethod(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.feelBad:
                if(checked)
                    break;
            case R.id.feelOk:
                if(checked)
                    break;
            case R.id.feelGood:
                if(checked)
                    break;

        }
    }

}