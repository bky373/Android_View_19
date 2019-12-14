package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinearMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_main);
    }

//    public void equal_button_click(View view) {
//        Intent intent = new Intent(getApplicationContext(), EqualActivity.class);
//        startActivity(intent);
//    }
//
//    public void unequal_button_click(View view) {
//        Intent intent = new Intent(getApplicationContext(), UnequalActivity.class);
//        startActivity(intent);
//    }

    public void buttonClick(View view) {
        Intent intent;
        if (view.getId() == R.id.equal_button) {
            intent = new Intent(getApplicationContext(), EqualActivity.class);
        } else {
            intent = new Intent(getApplicationContext(), UnequalActivity.class);
        }
        startActivity(intent);
    }
}
