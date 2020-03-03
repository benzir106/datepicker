package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=findViewById(R.id.DatePicker);
        button=findViewById(R.id.Button);
        textView=findViewById(R.id.TextView);

        textView.setText(currentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());

            }
        });

    }
    String currentDate(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Current Date");
        stringBuilder.append(datePicker.getDayOfMonth() +"/");
        stringBuilder.append((datePicker.getMonth()+1) +"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();
    }
}
