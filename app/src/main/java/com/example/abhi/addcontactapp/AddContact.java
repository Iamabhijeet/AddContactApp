package com.example.abhi.addcontactapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddContact extends AppCompatActivity {
    Button bt_add;
    TextView et_name,et_number,et_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        et_name = (TextView) findViewById(R.id.et_name);
        et_number = (TextView) findViewById(R.id.et_number);
        et_email = (TextView) findViewById(R.id.et_email);
        bt_add = (Button)findViewById(R.id.bt_add);

       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.bt_add);
        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddContact.this, "you are in next activity", Toast.LENGTH_LONG).show();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

}
