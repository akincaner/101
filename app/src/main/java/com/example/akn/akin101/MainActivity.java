package com.example.akn.akin101;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Definetion of layout xml*/
        setContentView(R.layout.activity_main);



        /**definetion of EditTexts start**/
        final EditText ucper = (EditText) findViewById(R.id.second);
        final EditText dortper = (EditText) findViewById(R.id.first);
        final EditText sıralıbas = (EditText) findViewById(R.id.editText3);
        final EditText sıralıson = (EditText) findViewById(R.id.editText4);
        final EditText arti = (EditText) findViewById(R.id.editText5);
        final EditText Toplam = (EditText) findViewById(R.id.editText6);
        /**definetion of EditTexts end**/
        /*button for 3 per definetion*/
        Button fab = (Button) findViewById(R.id.button);
        /*button click event start*/
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int sayi1 = Integer.parseInt(ucper.getText().toString());
                final int sayi2 = Integer.parseInt(Toplam.getText().toString());

                /*if we have not number*/
                if (ucper.getText().equals(null)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Lütfen Bir Sayı Giriniz");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.create().show();
                }
                /*add to get int*/
                Toplam.setText(String.valueOf(sayi1 * 3 + sayi2));
                ucper.setText("");

                /*if toplam = 101, end the game*/
                if (Integer.parseInt(Toplam.getText().toString()) >= 101) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Toplam sayı = " + Toplam.getText().toString() + ", Açabilirsiniz.");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toplam.setText(String.valueOf(sayi1 * 3 + sayi2));

                        }
                    });
                    builder.create().show();
                }

            }
        });
        /*button click end*/

        /*button for 4 per definetion*/
        Button fab2 = (Button) findViewById(R.id.button2);
        /*button click start*/
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int sayi1 = Integer.parseInt(dortper.getText().toString());
                final int sayi2 = Integer.parseInt(Toplam.getText().toString());
                /*if we have not number*/
                if (dortper.getText().equals(null)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Lütfen Bir Sayı Giriniz");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.create().show();
                }

                /*add to get int*/
                Toplam.setText(String.valueOf(sayi1 * 4 + sayi2));
                dortper.setText("");

                /*if toplam = 101, end the game*/
                if (Integer.parseInt(Toplam.getText().toString()) >= 101) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Toplam sayı = " + Toplam.getText().toString() + ", Açabilirsiniz.");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toplam.setText(String.valueOf(sayi1 * 4 + sayi2));
                        }
                    });
                    builder.create().show();
                }

            }
        });
        /*button click end*/

        /*button for sıralı definetion*/
        Button fab3 = (Button) findViewById(R.id.button3);
        /*click event start*/
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int sayi1 = Integer.parseInt(sıralıbas.getText().toString());
                final int sayi2 = Integer.parseInt(sıralıson.getText().toString());
                final int sayi3 = Integer.parseInt(Toplam.getText().toString());
                /*if we have not number*/
                if (sıralıbas.getText().equals(null) || sıralıson.getText().equals(null)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Lütfen Bir Sayı Giriniz");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.create().show();
                }

                /*add to get int*/
                Toplam.setText(String.valueOf(((sayi1 + sayi2) * (sayi2 - sayi1 + 1) / 2) + sayi3));
                sıralıbas.setText("");
                sıralıson.setText("");
                /*if toplam = 101, end the game*/
                if (Integer.parseInt(Toplam.getText().toString()) >= 101) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Toplam sayı = " + Toplam.getText().toString() + ", Açabilirsiniz.");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toplam.setText(String.valueOf(((sayi1 + sayi2) * (sayi2 - sayi1 + 1) / 2) + sayi3));

                        }
                    });
                    builder.create().show();
                }
            }
        });
            /*click event end*/


        /*button artı definition*/
        Button fab4 = (Button) findViewById(R.id.button4);
        /*click event start*/
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int sayi1 = Integer.parseInt(arti.getText().toString());
                final int sayi3 = Integer.parseInt(Toplam.getText().toString());
                /*if we have not number*/
                if (arti.getText().equals(null)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Lütfen Bir Sayı Giriniz");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {


                        }
                    });
                    builder.create().show();
                }
                /*add to get int*/
                Toplam.setText(String.valueOf(sayi1 + sayi3));
                arti.setText("");
                /*if toplam = 101, end the game*/
                if (Integer.parseInt(Toplam.getText().toString()) >= 101) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setMessage("Toplam sayı = " + Toplam.getText().toString() + ", Açabilirsiniz.");
                    builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            Toplam.setText(String.valueOf(sayi1 + sayi3));
                        }
                    });
                    builder.create().show();
                }
            }
        });
        /*click event end*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.order, menu);
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
                /*new game action*/
            EditText Toplam = (EditText) findViewById(R.id.editText6);
            Toplam.setText("0");

        } else if (id == R.id.action_skor) {
            Intent intent = getIntent();
            Intent intent2 = new Intent(MainActivity.this, skor_table.class);
            if(intent.getStringExtra("first_skor") != null || intent.getStringExtra("second_skor") != null || intent.getStringExtra("third_skor") != null || intent.getStringExtra("fourth_skor") != null) {
                String first_skor = intent.getStringExtra("first_skor");
                String second_skor = intent.getStringExtra("second_skor");
                String third_skor = intent.getStringExtra("third_skor");
                String fourth_skor = intent.getStringExtra("fourth_skor");
                intent2.putExtra("first_skor", first_skor);
                intent2.putExtra("second_skor", second_skor);
                intent2.putExtra("third_skor", third_skor);
                intent2.putExtra("fourth_skor", fourth_skor);
            }
            startActivity(intent2);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //geri butonunu yakalıyoruz
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            //Programdan çıkmak isteyip istemediğini soruyoruz
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Çıkış")
                    .setMessage("Çıkmak istediğinize eminmisiniz?")
                    .setPositiveButton("Çıkış", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            //Aktiviteyi durduruyoruz
                            finish();
                        }
                    })
                    .setNegativeButton("İptal", null)
                    .show();

            return true;
        }
        else {
            return super.onKeyDown(keyCode, event);
        }
    }


}
