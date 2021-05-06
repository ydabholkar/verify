package com.example.smsreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    private EditText mNumber;
    private Button mButton;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mNumber = (EditText) findViewById(R.id.phoneno);
        mButton = (Button) findViewById((R.id.send));
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Main.this,MainActivity.class);
                intent.putExtra("Number",mNumber.getText().toString());
                startActivity(intent);
            }
        });
    }
}
