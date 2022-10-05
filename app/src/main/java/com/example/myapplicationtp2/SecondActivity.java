package com.example.myapplicationtp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private String msg;
    private TextView tx2;
    private EditText txtSrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent j = getIntent();
        msg=j.getStringExtra("msg");
        tx2=(TextView)findViewById(R.id.tx2);
        tx2.setText(msg);
        txtSrc = (EditText)findViewById(R.id.ipnt1);
    }
    public void envoyerMsg(View v) {

        String ch1 = txtSrc.getText().toString();

        if (ch1.equals("")) {

            Context context = getApplicationContext();
            int text =R.string.app_msgE;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else {

            Intent i = new Intent(SecondActivity.this, MainActivity.class);
            i.putExtra("msg", ch1);
            startActivity(i);



        }


    }
}