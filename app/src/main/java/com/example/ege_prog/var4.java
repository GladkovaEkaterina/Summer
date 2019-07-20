package com.example.ege_prog;


import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class var4 extends AppCompatActivity {

    public TextView tv;
    public ProgressBar pb;
    public Button bt;

    private TextView v1;

    private TextView n1;
    private EditText e1;
    private ImageView im1;

    private TextView n2;
    private EditText e2;
    private ImageView im2;

    private TextView n3;
    private EditText e3;
    private ImageView im3;

    private TextView n4;
    private EditText e4;
    private ImageView im4;

    private TextView n5;
    private EditText e5;
    private ImageView im5;

    private TextView n6;
    private EditText e6;
    private ImageView im6;

    private TextView n7;
    private EditText e7;
    private ImageView im7;

    private TextView n8;
    private EditText e8;
    private ImageView im8;

    private TextView n9;
    private EditText e9;
    private ImageView im9;

    private TextView n10;
    private EditText e10;
    private ImageView im10;

    private TextView n11;
    private EditText e11;
    private ImageView im11;

    private TextView n12;
    private EditText e12;
    private ImageView im12;

    private Button button;


    private TextView N1;
    private TextView N2;
    private TextView N3;
    private TextView N4;
    private TextView N5;
    private TextView N6;
    private TextView N7;
    private TextView N8;
    private TextView N9;
    private TextView N10;
    private TextView N11;
    private TextView N12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.var4);

        tv = findViewById(R.id.textView13);
        pb = findViewById(R.id.progressBar);
        bt = findViewById(R.id.button4);

        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new CountDownTimer(100000, 1000) {

                    @Override
                    public void onTick(long l) {
                        tv.setText(" " + l/1000);
                        pb.setProgress((int) (l/1000));
                    }

                    @Override
                    public void onFinish() {
                        tv.setText("ВРЕМЯ ВЫШЛО");
                        Toast.makeText(getBaseContext(), "Время вышло" , Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });

        v1 = (TextView) findViewById(R.id.textView);

        n1 = (TextView) findViewById(R.id.textView1);
        e1=(EditText)findViewById(R.id.editText1);
        N1 = (TextView) findViewById(R.id.textView1_1);
        ImageView imageView1 = (ImageView) findViewById(R.id.v3im1);
        imageView1.setImageResource(R.drawable.v3im1);

        n2 = (TextView) findViewById(R.id.textView2);
        e2=(EditText)findViewById(R.id.editText2);
        N2 = (TextView) findViewById(R.id.textView2_2);
        ImageView imageView2 = (ImageView) findViewById(R.id.v3im2);
        imageView2.setImageResource(R.drawable.v3im2);

        n3 = (TextView) findViewById(R.id.textView3);
        e3=(EditText)findViewById(R.id.editText3);
        N3 = (TextView) findViewById(R.id.textView3_3);
        ImageView imageView3 = (ImageView) findViewById(R.id.v2im3);
        imageView3.setImageResource(R.drawable.v2im3);

        n4 = (TextView) findViewById(R.id.textView4);
        e4=(EditText)findViewById(R.id.editText4);
        N4 = (TextView) findViewById(R.id.textView4_4);
        ImageView imageView4 = (ImageView) findViewById(R.id.v2im4);
        imageView4.setImageResource(R.drawable.v2im4);

        n5 = (TextView) findViewById(R.id.textView5);
        e5=(EditText)findViewById(R.id.editText5);
        N5 = (TextView) findViewById(R.id.textView5_5);
        ImageView imageView5 = (ImageView) findViewById(R.id.v2im5);
        imageView5.setImageResource(R.drawable.v2im5);

        n6 = (TextView) findViewById(R.id.textView6);
        e6=(EditText)findViewById(R.id.editText6);
        N6 = (TextView) findViewById(R.id.textView6_6);
        ImageView imageView6 = (ImageView) findViewById(R.id.v2im6);
        imageView6.setImageResource(R.drawable.v2im6);

        n7 = (TextView) findViewById(R.id.textView7);
        e7=(EditText)findViewById(R.id.editText7);
        N7 = (TextView) findViewById(R.id.textView7_7);
        ImageView imageView7 = (ImageView) findViewById(R.id.v2im7);
        imageView7.setImageResource(R.drawable.v2im7);

        n8 = (TextView) findViewById(R.id.textView8);
        e8=(EditText)findViewById(R.id.editText8);
        N8 = (TextView) findViewById(R.id.textView8_8);
        ImageView imageView8 = (ImageView) findViewById(R.id.v2im8);
        imageView8.setImageResource(R.drawable.v2im8);

        n9 = (TextView) findViewById(R.id.textView9);
        e9=(EditText)findViewById(R.id.editText9);
        N9 = (TextView) findViewById(R.id.textView9_9);
        ImageView imageView9 = (ImageView) findViewById(R.id.v2im9);
        imageView9.setImageResource(R.drawable.v2im9);

        n10 = (TextView) findViewById(R.id.textView10);
        e10=(EditText)findViewById(R.id.editText10);
        N10 = (TextView) findViewById(R.id.textView10_10);
        ImageView imageView10 = (ImageView) findViewById(R.id.v2im10);
        imageView10.setImageResource(R.drawable.v2im10);

        n11 = (TextView) findViewById(R.id.textView11);
        e11=(EditText)findViewById(R.id.editText11);
        N11 = (TextView) findViewById(R.id.textView11_11);
        ImageView imageView11 = (ImageView) findViewById(R.id.v2im11);
        imageView11.setImageResource(R.drawable.v2im11);

        n12 = (TextView) findViewById(R.id.textView12);
        e12=(EditText)findViewById(R.id.editTex12);
        N12 = (TextView) findViewById(R.id.textView12_12);
        ImageView imageView12 = (ImageView) findViewById(R.id.v2im12);
        imageView12.setImageResource(R.drawable.v2im12);

        button = (Button)findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(e1.getText().toString().length()>0 & e2.getText().toString().length()>0 &
                        e3.getText().toString().length()>0 & e4.getText().toString().length()>0 &
                        e5.getText().toString().length()>0 & e6.getText().toString().length()>0 &
                        e7.getText().toString().length()>0 & e8.getText().toString().length()>0 &
                        e9.getText().toString().length()>0 & e10.getText().toString().length()>0 &
                        e11.getText().toString().length()>0 & e12.getText().toString().length()>0
                ) {

                    N1.setText("Правильный ответ: 8");
                    N2.setText("Правильный ответ: 7");
                    N3.setText("Правильный ответ: 5");
                    N4.setText("Правильный ответ: 0,027");
                    N5.setText("Правильный ответ: 5");
                    N6.setText("Правильный ответ: 4,8");
                    N7.setText("Правильный ответ: -0,25");
                    N8.setText("Правильный ответ: 4");
                    N9.setText("Правильный ответ: 5");
                    N10.setText("Правильный ответ: 18");
                    N11.setText("Правильный ответ: 88");
                    N12.setText("Правильный ответ: 4");
                }
                else{
                    Toast.makeText(getBaseContext(), "Заполните все ответы" , Toast.LENGTH_SHORT).show();

                }

            }

        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){


        switch(item.getItemId()){
            case R.id.action_settings:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
