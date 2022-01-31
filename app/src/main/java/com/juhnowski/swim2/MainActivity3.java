package com.juhnowski.swim2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.juhnowski.swim2.databinding.ActivityMain3Binding;

public class MainActivity3 extends Activity {
    public static final String EXTRA_MESSAGE_2 = "com.juhnowski.hdrs.MESSAGE_2";

    //private TextView mTextView;
    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        mTextView = binding.text;


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void exit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}