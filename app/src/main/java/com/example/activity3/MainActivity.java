package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button Signin;
    EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Signin = findViewById(R.id.btn1);
        Username = findViewById(R.id.Editusername);
        Password = findViewById(R.id.Editpass);


        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("") && Password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Data Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Username.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Username Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Password Harus Diisi", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Sign-in Berhasil", Toast.LENGTH_SHORT).show();
                }


            }
        });

        }
    public boolean onCreateOptionsMenu(Menu menu) {
                MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.m1){
            startActivity(new Intent(this, Menu1.class));
        } else if (item.getItemId() == R.id.m2) {
            startActivity(new Intent(this, Menu2.class));
        } else if (item.getItemId() == R.id.m3) {
            startActivity(new Intent(this, Menu3.class));
        }
        return true;
    }

}
