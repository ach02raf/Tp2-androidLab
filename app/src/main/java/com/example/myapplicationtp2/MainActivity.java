package com.example.myapplicationtp2;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.app.AlertDialog;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private String msg;
    private EditText txtSrc;
    private TextView tx;
    private View v1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = (TextView) findViewById(R.id.tx);
        txtSrc = (EditText)findViewById(R.id.ipnt);
        v1 = (View)findViewById(R.id.v1);
        Intent j = getIntent();
        msg=j.getStringExtra("msg");
        tx.setText(msg);

    }
    public void envoyerMsg(View v) {

        String ch1 = txtSrc.getText().toString();

        if (ch1.equals("")) {
            /*
               AlertDialog alertDialog;
               alertDialog = new AlertDialog.Builder(this).create();
               alertDialog.setTitle("Attention! ");
               alertDialog.setMessage("chaine vide ");
               alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {

                   public void onClick(DialogInterface dialog, int which) {
                       dialog.dismiss();
                   }
               });
               alertDialog.show();

            Snackbar mySnackbar = Snackbar.make(v1, "chaine vide",Snackbar.LENGTH_SHORT);
            mySnackbar.show();

            final View viewPos = findViewById(R.id.myCoordinatorLayout);
            final Snackbar snackbar = Snackbar.make(viewPos,  "chaine vide", Snackbar.LENGTH_LONG).setAnchorView(v1);
            getLayoutInflater().inflate(R.layout.activity_main, null);
            View view = snackbar.getView();
            view.setBackgroundColor(Color.GRAY);
            FrameLayout.LayoutParams params = (FrameLayout.LayoutParams)view.getLayoutParams();
            params.width = 500;
            params.leftMargin=250;
            view.setLayoutParams(params);
            snackbar.show();

          */

            Context context = getApplicationContext();
            int text =R.string.app_msgE;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else {

            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("msg", ch1);
            startActivity(i);



        }


    }
}