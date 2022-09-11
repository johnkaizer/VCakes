package com.project.vcakes.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.vcakes.MainActivity;
import com.project.vcakes.R;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void sigup(View view) {
        startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(SignInActivity.this, MainActivity.class));
        finish();
    }
}