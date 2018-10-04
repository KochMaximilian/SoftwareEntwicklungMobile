package com.example.max.sixteenbuttons;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;
import java.util.RandomAccess;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int buttonNumber = 1;
    int min = 1;
    int max = 16;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       for (int i = min; i <= max; i++) {
           button = new Button(this);
           button.setText("Button" + " " + buttonNumber++);

           LinearLayout linearLayout = findViewById(R.id.linerar_layoutId);
           linearLayout.addView(button);
           button.setOnClickListener(this);
       }

    }


    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(this,"Click on Button" + " " + randomButton(), Toast.LENGTH_SHORT);
        toast.show();

    }



    public int randomButton(){

        Random r = new Random();
        buttonNumber = r.nextInt(max);

        return buttonNumber;

    }

}
