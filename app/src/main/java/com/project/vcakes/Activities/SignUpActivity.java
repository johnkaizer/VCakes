package com.project.vcakes.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.vcakes.MainActivity;
import com.project.vcakes.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void home(View view) {
        startActivity(new Intent(SignUpActivity.this, MainActivity.class));
        finish();
    }

    public void signIn(View view) {
    }
}