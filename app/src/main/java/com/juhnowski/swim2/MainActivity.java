package com.juhnowski.swim2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.juhnowski.swim2.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    public static final String EXTRA_MESSAGE_1 = "com.juhnowski.hdrs.MESSAGE_1";

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        mTextView = binding.text;
    }

    public void sendMessage(View view) {
        int res = 1;
        Intent intent = new Intent(this, MainActivity3.class);

        String message = "200";
        intent.putExtra(EXTRA_MESSAGE_1, message);
        startActivity(intent);
    }
}