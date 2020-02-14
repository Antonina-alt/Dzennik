package com.adashkevich.diaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private final String LOGIN = "tonya";
    private final String PASSWORD = "123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText login = findViewById((R.id.login));
                EditText password = findViewById((R.id.password));

                if (LOGIN.equals(login.getText().toString()) && PASSWORD.equals(password.getText().toString())) {
                    setContentView(R.layout.activity_main);
                } else {
                    TextView error = findViewById(R.id.error);
                    error.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
