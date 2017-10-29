package com.project.my.assignment73;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText txt_username = (EditText)findViewById(R.id.txt_username);
        final EditText txt_password = (EditText)findViewById(R.id.txt_password);
        Button btn_Login = (Button)findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(txt_username.getText().toString().equals("SnehalB") && txt_password.getText().toString().equals("Password")){
                    Intent intent_Login = new Intent(getApplicationContext(),MsgPage.class);
                    intent_Login.putExtra("name","Snehal Bhosle");
                    startActivity(intent_Login);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong UserName or Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
