package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHelloWorld;
        Button btnAbstract;
        Button btnToast;
        Button btnWeb;

        btnHelloWorld = (Button) findViewById(R.id.btnHelloWorld);
        btnToast = (Button) findViewById(R.id.btnToast);
        btnAbstract = (Button) findViewById(R.id.btnAbstract);
        btnWeb = (Button) findViewById(R.id.btnWeb);


        btnHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelloWorldActivity();
            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToastActivity2();
            }
        });
//
//        btnAbstract.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openAbstractActivity();
//            }
//        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenWebsiteActivity();
            }
        });
    }

    public void openHelloWorldActivity(){
        Intent intent = new Intent(this, HelloWorldActivity.class);
        startActivity(intent);
    }

    public void openToastActivity2(){
        Intent intent = new Intent(this, ToastActivity2.class);
        startActivity(intent);
    }

    public void OpenWebsiteActivity(){
        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }

//
//    public void openAbstractActivity(){
//        Intent intent = new Intent(this, AbstractActivity.class);
//        startActivity(intent);
//    }
}
