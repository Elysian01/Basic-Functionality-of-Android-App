package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ToastActivity2 extends AppCompatActivity {

    EditText editTextNum1;
    EditText editTextNum2;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast2);

        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextNum1.getText().toString().isEmpty() && !editTextNum2.getText().toString().isEmpty()) {
                    String num1 = editTextNum1.getText().toString();
                    String num2 = editTextNum2.getText().toString();
                    int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    Toast.makeText(ToastActivity2.this, "Result of " + num1 + " + " + num2 + " is " + String.valueOf(result), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ToastActivity2.this, "Please don't leave any field empty", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}