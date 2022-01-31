package com.juhnowski.swim2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.juhnowski.swim2.databinding.ActivityMain4Binding;

public class MainActivity4 extends Activity {
    public static final String EXTRA_MESSAGE_3 = "com.juhnowski.hdrs.MESSAGE_3";

    private ActivityMain4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


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