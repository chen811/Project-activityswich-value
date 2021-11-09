package com.example.project_activityswich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = (TextView)findViewById(R.id.textView);
        Intent intent = this.getIntent();
        String BTOA = intent.getStringExtra("BTOA");
        message.setText("" + BTOA);
    }


    public void runLogin(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        EditText inputA = findViewById(R.id.editTextNumber);
        intent.putExtra("ATOB",inputA.getText().toString()); // 記得put進去，不然資料不會帶過去哦
        startActivity(intent);




    }
}