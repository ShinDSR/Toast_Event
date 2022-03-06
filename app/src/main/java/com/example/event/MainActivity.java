package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import  android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t;

                if (edemail.getText().toString().equals("admin@mail.com") && edpassword.getText().toString().equals("123"))
                    t = Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG);
                else if (edemail.getText().toString().equals("admin@mail.com") && edpassword.getText().toString() !="123")
                    t = Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG);
                else if (edemail.getText().toString() != "admin@mail.com" && edpassword.getText().toString().equals("123"))
                    t = Toast.makeText(getApplicationContext(), "Email yang anda masukkan salah", Toast.LENGTH_LONG);
                else
                    t = Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}