package com.example.admin.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView count1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count1 = (TextView) findViewById(R.id.textView);
        count1.setText(String.valueOf(count));
    }

    public void increase(View view) {
        count++;
        count1.setText(String.valueOf(count));
    }


    public void decrease(View view) {
        if(count==0){
            Toast.makeText(this,"Sorry, can't decrease!",Toast.LENGTH_LONG).show();}
        else {
            count--;
            count1.setText(String.valueOf(count));
        }
    }
}

