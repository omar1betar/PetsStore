package com.betaromar.omar1betar.petsstore;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    TextView signup;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText)findViewById(R.id.email_login);
        password = (EditText)findViewById(R.id.password_login);
        signin = (Button)findViewById(R.id.signin_login);

        //handle on click lisnear to open sign up activity
        signup = (TextView)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });



        //called action bar method to hide action bar
        hideActionBar();

    }

    // this method use to hide acction bar from the activity
    private void hideActionBar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
