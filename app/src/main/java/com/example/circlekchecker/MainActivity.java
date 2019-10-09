package com.example.circlekchecker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// Mỗi Activity đều bắt buộc phải kế thừa từ AppCompatActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
