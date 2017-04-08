package com.example.akn.akin101;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by akincanerpekel on 08.04.2017.
 */

public class skor_table extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Definetion of layout xml*/
        setContentView(R.layout.skor_table);

        final EditText first = (EditText) findViewById(R.id.first);
        final EditText second = (EditText) findViewById(R.id.second);
        final EditText third = (EditText) findViewById(R.id.third);
        final EditText fourth = (EditText) findViewById(R.id.fourth);
        final TextView first_skor = (TextView) findViewById(R.id.textView9);
        final TextView second_skor = (TextView) findViewById(R.id.textView10);
        final TextView third_skor = (TextView) findViewById(R.id.textView8);
        final TextView fourth_skor = (TextView) findViewById(R.id.skor);

        Intent intent = getIntent();
        if(intent.getStringExtra("first_skor") != null || intent.getStringExtra("second_skor") != null || intent.getStringExtra("third_skor") != null || intent.getStringExtra("fourth_skor") != null) {
            String first_skor_old = intent.getStringExtra("first_skor");
            String second_skor_old = intent.getStringExtra("second_skor");
            String third_skor_old = intent.getStringExtra("third_skor");
            String fourth_skor_old = intent.getStringExtra("fourth_skor");
            first_skor.setText(first_skor_old);
            second_skor.setText(second_skor_old);
            third_skor.setText(third_skor_old);
            fourth_skor.setText(fourth_skor_old);

        }

        Button hesap = (Button) findViewById(R.id.button5);
        /*button click event start*/
        hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int intfirst = Integer.parseInt(first.getText().toString());
                int intsecond = Integer.parseInt(second.getText().toString());
                int intthird = Integer.parseInt(third.getText().toString());
                int intfourth = Integer.parseInt(fourth.getText().toString());
                if (first_skor.getText().toString().equals("") || second_skor.getText().toString().equals("") || third_skor.getText().toString().equals("") || fourth_skor.getText().toString().equals("")){
                    first_skor.setText(first.getText().toString());
                    second_skor.setText(second.getText().toString());
                    third_skor.setText(third.getText().toString());
                    fourth_skor.setText(fourth.getText().toString());
                }else {
                   final int intfirst_skor = Integer.parseInt(first_skor.getText().toString());
                   final int intsecond_skor = Integer.parseInt(second_skor.getText().toString());
                   final int intthird_skor = Integer.parseInt(third_skor.getText().toString());
                   final int intfourth_skor = Integer.parseInt(fourth_skor.getText().toString());

                    first_skor.setText(String.valueOf(intfirst + intfirst_skor));
                    second_skor.setText(String.valueOf(intsecond + intsecond_skor));
                    third_skor.setText(String.valueOf(intthird + intthird_skor));
                    fourth_skor.setText(String.valueOf(intfourth + intfourth_skor));
                }

            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.skor, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_new) {

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //geri butonunu yakalıyoruz
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            TextView first_skor = (TextView) findViewById(R.id.textView9);
            TextView second_skor = (TextView) findViewById(R.id.textView10);
            TextView third_skor = (TextView) findViewById(R.id.textView8);
            TextView fourth_skor = (TextView) findViewById(R.id.skor);

            Intent intent = new Intent(skor_table.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("first_skor",first_skor.getText().toString());
            intent.putExtra("second_skor",second_skor.getText().toString());
            intent.putExtra("third_skor",third_skor.getText().toString());
            intent.putExtra("fourth_skor",fourth_skor.getText().toString());
            startActivity(intent);
            return true;
        }
        else {
            return super.onKeyDown(keyCode, event);
        }
    }



}
