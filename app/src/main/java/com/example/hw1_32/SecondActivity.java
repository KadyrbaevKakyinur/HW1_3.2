package com.example.hw1_32;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private String  phoneNamber;
    private Button call_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        call_btn= findViewById(R.id.call_btn);
        textView = findViewById(R.id.text_view);

        Intent intent = getIntent();
        phoneNamber = intent.getStringExtra("edit");
        textView.setText(phoneNamber);



        String text = getIntent().getStringExtra("edit");
        textView.setText(text);

        call_btn.setOnClickListener(view -> {
            String phoneNumber = textView.getText().toString();
            Intent intent2 = new Intent(Intent.ACTION_DIAL);
            intent2.setData(Uri.parse("tel:"+phoneNumber));
            startActivity(intent2);
        });



    }




}