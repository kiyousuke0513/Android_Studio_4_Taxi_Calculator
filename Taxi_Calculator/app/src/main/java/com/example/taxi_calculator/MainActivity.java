package com.example.taxi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("DefaultLocale")
    public void Button_Trig(View view) {
        double Rate;//費率
        double Distance;//距離
        double Add_Distance;//增量距離
        double Add_Price;//增量價錢
        double Price;//價錢
        String Output_Text;//輸出文字

        EditText editText_Rate = findViewById(R.id.editTextNumber_Rate);
        EditText editText_Distance = findViewById(R.id.editTextNumber_Distance);
        EditText editText_Add_Distance = findViewById(R.id.editTextNumber_Add_Distance);
        EditText editText_Add_Price = findViewById(R.id.editTextNumber_Add_Price);

        TextView textView_Price = findViewById(R.id.textView_Price);

        if(!String.valueOf(editText_Rate.getText()).equals(""))
            Rate = Double.parseDouble(String.valueOf(editText_Rate.getText()));
        else
            editText_Rate.setText(String.valueOf(Rate = 0));
        if(!String.valueOf(editText_Distance.getText()).equals(""))
            Distance = Double.parseDouble(String.valueOf(editText_Distance.getText()));
        else
            editText_Distance.setText(String.valueOf(Distance = 0));
        if(!String.valueOf(editText_Add_Distance.getText()).equals(""))
            Add_Distance = Double.parseDouble(String.valueOf(editText_Add_Distance.getText()));
        else
            editText_Add_Distance.setText(String.valueOf(Add_Distance = 0));
        if(!String.valueOf(editText_Add_Price.getText()).equals(""))
            Add_Price = Double.parseDouble(String.valueOf(editText_Add_Price.getText()));
        else
            editText_Add_Price.setText(String.valueOf(Add_Price = 0));

        Price = Rate + Math.ceil(Distance/Add_Distance)*Add_Price;
        Output_Text = String.format("%.2f",Price);
        textView_Price.setText(Output_Text);
    }
}