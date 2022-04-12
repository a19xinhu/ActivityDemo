package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProvfileActivity extends AppCompatActivity {

    private Button signout;
    private TextView usernameView;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","ProvfileActivity resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","ProvfileActivity started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","ProvfileActivity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","ProvfileActivity destroyed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provfile);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>","Username from intent:" + username);

        usernameView = findViewById(R.id.provfile_username);
        usernameView.setText(username);

        signout = findViewById(R.id.signin_button);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Sign out clicked");
                finish();
            }
        });


    }
}