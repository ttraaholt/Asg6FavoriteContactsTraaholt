package com.example.ttraaholt.asg6favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
//Create buttons
    Button btnCall1, btnCall2, btnCall3, btnText1, btnText2, btnText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Create a method that sets up the button click events. 3 call events, and 3 text events
    private void setupButtonClickEvents() {
        //First button that is called
        btnCall1 = (Button) findViewById(R.id.buttonCall1);
        btnCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "(715)2925525"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        //second call button initiated and created in a listener
        btnCall2 = (Button) findViewById(R.id.buttonCall2);
        btnCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "(715)2925525"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        //3rd call button initiated and created in a listener
        btnCall3 = (Button) findViewById(R.id.buttonCall3);
        btnCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "(715)2925525"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        //1st text button that is initiated and set up in a listener
        btnText1 = (Button) findViewById(R.id.buttonText1);
        btnText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:7152925525"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", "Hi");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        //second button that is initiated and set up in a listener
        btnText2 = (Button) findViewById(R.id.buttonText2);
        btnText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:7152925525"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", "Hi");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        //third button that is initiated and set up in a listener
        btnText3 = (Button) findViewById(R.id.buttonText3);
        btnText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:7152925525"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", "Hi");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
