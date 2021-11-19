package com.example.javalearnmobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_lesson1);
        button.setOnClickListener(v -> Les1Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson2);
        button.setOnClickListener(v -> Les2Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson3);
        button.setOnClickListener(v -> Les3Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson4);
        button.setOnClickListener(v -> Les4Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson5);
        button.setOnClickListener(v -> Les5Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson6);
        button.setOnClickListener(v -> Les6Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson7);
        button.setOnClickListener(v -> Les7Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

        button = findViewById(R.id.btn_lesson8);
        button.setOnClickListener(v -> Les8Activity());
        // Yuqoridagi kod yangi activity ni ochib beradi

    }

    public void Les1Activity() {
        Intent intent = new Intent(this, Les1Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les2Activity() {
        Intent intent = new Intent(this, Les2Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les3Activity() {
        Intent intent = new Intent(this, Les3Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les4Activity() {
        Intent intent = new Intent(this, Les4Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les5Activity() {
        Intent intent = new Intent(this, Les5Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les6Activity() {
        Intent intent = new Intent(this, Les6Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les7Activity() {
        Intent intent = new Intent(this, Les7Activity.class);
        startActivity(intent);
        // Open activity
    }

    public void Les8Activity() {
        Intent intent = new Intent(this, Les8Activity.class);
        startActivity(intent);
        // Open activity
    }
}