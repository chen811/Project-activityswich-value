package com.example.project_activityswich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView messageB = (TextView)findViewById(R.id.textView2);
        Intent intent = this.getIntent();
        String ATOB = intent.getStringExtra("ATOB");
        messageB.setText("" + ATOB);
    }

    public void runLogin(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        EditText inputB = findViewById(R.id.editTextNumber2);
        intent.putExtra("BTOA",inputB.getText().toString()); // 記得put進去，不然資料不會帶過去哦
        startActivity(intent);



    }
}