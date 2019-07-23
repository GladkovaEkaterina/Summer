package com.example.ege_prog;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private TextView text;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {// метод onCreate() – он вызывается, когда приложение создаёт и отображает разметку активности
        super.onCreate(savedInstanceState);//конструктор родительского класса, выполняющий необходимые операции для работы активности
        setContentView(R.layout.activity_main);//Метод setContentView(int) подключает содержимое из файла разметки. В качестве аргумента мы указываем имя файла без расширения из папки res/layout


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);




        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 1);
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 2);
                startActivity(intent1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 3);
                startActivity(intent1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 4);
                startActivity(intent1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 5);
                startActivity(intent1);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 6);
                startActivity(intent1);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 7);
                startActivity(intent1);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 8);
                startActivity(intent1);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 9);
                startActivity(intent1);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, var1.class);
                intent1.putExtra("num", 10);
                startActivity(intent1);
            }
        });

    }
    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Выйти из программы?");
        builder.setCancelable(true);
        builder.setNegativeButton("нет", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}