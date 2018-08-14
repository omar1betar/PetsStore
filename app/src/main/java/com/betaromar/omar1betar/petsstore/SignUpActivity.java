package com.betaromar.omar1betar.petsstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SignUpActivity extends AppCompatActivity {

    final String FILE_NAME = "temp.txt";
    EditText name,email,password,repetPasswprd;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name = (EditText) findViewById(R.id.name_signup);
        email = (EditText) findViewById(R.id.email_signup);
        password = (EditText) findViewById(R.id.password_signup);
        repetPasswprd = (EditText) findViewById(R.id.repet_passwprd);
        

        
    }
    private void writeFromFile()  {
        try {
            FileOutputStream fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            // out = String.valueOf(num);
            String writename;
            fos.write(String.valueOf(name).getBytes());
            fos.write(String.valueOf(email).getBytes());
            fos.write(String.valueOf(password).getBytes());
            fos.close();
            readFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFromFile() {
        try {
            FileInputStream fis = openFileInput(FILE_NAME);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            writeFromFile.setText(new String(buffer));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
}
