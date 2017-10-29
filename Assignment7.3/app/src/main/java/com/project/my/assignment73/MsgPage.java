package com.project.my.assignment73;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MsgPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_page);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        TextView txt_msg = (TextView)findViewById(R.id.msg);
        txt_msg.setText("Welcome " + name);
    }
}
