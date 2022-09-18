package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SecondaryActivity extends AppCompatActivity {

    private Object Gravity;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
