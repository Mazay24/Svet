package com.example.svet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonRed(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#7C0101"));
    }
    public void ButtonYellow(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#FBC02D"));
    }
    public void ButtonGreen(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#00FF0C"));
    }
}