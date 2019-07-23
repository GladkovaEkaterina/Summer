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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class var1 extends AppCompatActivity {
    Integer num;

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
        setContentView(R.layout.var1);
        num = getIntent().getExtras().getInt("num", 1);

        tv = findViewById(R.id.textView13);
        pb = findViewById(R.id.progressBar);
        bt = findViewById(R.id.button0);

        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new CountDownTimer(100000, 1000) {

                    @Override
                    public void onTick(long l) {
                        tv.setText(" " + l / 1000);
                        pb.setProgress((int) (l / 1000));
                    }

                    @Override
                    public void onFinish() {
                        tv.setText("ВРЕМЯ ВЫШЛО");
                        Toast.makeText(getBaseContext(), "Время вышло", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });

        v1 = (TextView) findViewById(R.id.header);
        v1.setText("Вариант " + num.toString());

        n1 = (TextView) findViewById(R.id.textView1);
        e1 = (EditText) findViewById(R.id.editText1);
        N1 = (TextView) findViewById(R.id.textView1_1);
        ImageView imageView1 = (ImageView) findViewById(R.id.im1);
        switch (num) {
            case 1:
                imageView1.setImageResource(R.drawable.v1im1);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.v2im1);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.v3im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 750));
                break;
            case 4:
                imageView1.setImageResource(R.drawable.v4im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 5:
                imageView1.setImageResource(R.drawable.v5im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 6:
                imageView1.setImageResource(R.drawable.v6im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 400));
                break;
            case 7:
                imageView1.setImageResource(R.drawable.v7im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 550));
                break;
            case 8:
                imageView1.setImageResource(R.drawable.v8im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 9:
                imageView1.setImageResource(R.drawable.v9im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 400));
                break;
            case 10:
                imageView1.setImageResource(R.drawable.v10im1);
                imageView1.setLayoutParams(new LinearLayout.LayoutParams(1080, 700));
                break;
        }

        n2 = (TextView) findViewById(R.id.textView2);
        e2 = (EditText) findViewById(R.id.editText2);
        N2 = (TextView) findViewById(R.id.textView2_2);
        ImageView imageView2 = (ImageView) findViewById(R.id.im2);
        switch (num) {
            case 1:
                imageView2.setImageResource(R.drawable.v1im2);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.v2im2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.v3im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1500));
                break;
            case 4:
                imageView2.setImageResource(R.drawable.v4im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
            case 5:
                imageView2.setImageResource(R.drawable.v5im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1200));
                break;
            case 6:
                imageView2.setImageResource(R.drawable.v6im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1160));
                break;
            case 7:
                imageView2.setImageResource(R.drawable.v7im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1300));
                break;
            case 8:
                imageView2.setImageResource(R.drawable.v8im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1200));
                break;
            case 9:
                imageView2.setImageResource(R.drawable.v9im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1300));
                break;
            case 10:
                imageView2.setImageResource(R.drawable.v10im2);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(1080, 1400));
                break;
        }

        n3 = (TextView) findViewById(R.id.textView3);
        e3 = (EditText) findViewById(R.id.editText3);
        N3 = (TextView) findViewById(R.id.textView3_3);
        ImageView imageView3 = (ImageView) findViewById(R.id.im3);
        switch (num) {
            case 1:
                imageView3.setImageResource(R.drawable.v1im3);
                break;
            case 2:
                imageView3.setImageResource(R.drawable.v2im3);
                break;
            case 3:
                imageView3.setImageResource(R.drawable.v3im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 450));
                break;
            case 4:
                imageView3.setImageResource(R.drawable.v4im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 800));
                break;
            case 5:
                imageView3.setImageResource(R.drawable.v5im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 6:
                imageView3.setImageResource(R.drawable.v6im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 770));
                break;
            case 7:
                imageView3.setImageResource(R.drawable.v7im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 8:
                imageView3.setImageResource(R.drawable.v8im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 550));
                break;
            case 9:
                imageView3.setImageResource(R.drawable.v9im3);
                imageView3.setLayoutParams(new LinearLayout.LayoutParams(1080, 600));
                break;
            case 10:
                imageView3.setImageResource(R.drawable.v10im3);
                break;
        }

        n4 = (TextView) findViewById(R.id.textView4);
        e4 = (EditText) findViewById(R.id.editText4);
        N4 = (TextView) findViewById(R.id.textView4_4);
        ImageView imageView4 = (ImageView) findViewById(R.id.im4);
        switch (num) {
            case 1:
                imageView4.setImageResource(R.drawable.v1im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1090, 580));
                break;
            case 2:
                imageView4.setImageResource(R.drawable.v2im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 400));
                break;
            case 3:
                imageView4.setImageResource(R.drawable.v3im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 4:
                imageView4.setImageResource(R.drawable.v4im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 900));
                break;
            case 5:
                imageView4.setImageResource(R.drawable.v5im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 6:
                imageView4.setImageResource(R.drawable.v6im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
            case 7:
                imageView4.setImageResource(R.drawable.v7im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 550));
                break;
            case 8:
                imageView4.setImageResource(R.drawable.v8im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 9:
                imageView4.setImageResource(R.drawable.v9im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 770));
                break;
            case 10:
                imageView4.setImageResource(R.drawable.v10im4);
                imageView4.setLayoutParams(new LinearLayout.LayoutParams(1080, 900));
                break;
        }

        n5 = (TextView) findViewById(R.id.textView5);
        e5 = (EditText) findViewById(R.id.editText5);
        N5 = (TextView) findViewById(R.id.textView5_5);
        ImageView imageView5 = (ImageView) findViewById(R.id.im5);
        switch (num) {
            case 1:
                imageView5.setImageResource(R.drawable.v1im5);
                break;
            case 2:
                imageView5.setImageResource(R.drawable.v2im5);
                break;
            case 3:
                imageView5.setImageResource(R.drawable.v3im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 4:
                imageView5.setImageResource(R.drawable.v4im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 200));
                break;
            case 5:
                imageView5.setImageResource(R.drawable.v5im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
            case 6:
                imageView5.setImageResource(R.drawable.v6im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 200));
                break;
            case 7:
                imageView5.setImageResource(R.drawable.v7im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 250));
                break;
            case 8:
                imageView5.setImageResource(R.drawable.v8im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 9:
                imageView5.setImageResource(R.drawable.v9im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 150));
                break;
            case 10:
                imageView5.setImageResource(R.drawable.v10im5);
                imageView5.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
        }

        n6 = (TextView) findViewById(R.id.textView6);
        e6 = (EditText) findViewById(R.id.editText6);
        N6 = (TextView) findViewById(R.id.textView6_6);
        ImageView imageView6 = (ImageView) findViewById(R.id.im6);
        switch (num) {
            case 1:
                imageView6.setImageResource(R.drawable.v1im6);
                break;
            case 2:
                imageView6.setImageResource(R.drawable.v2im6);
                break;
            case 3:
                imageView6.setImageResource(R.drawable.v3im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 4:
                imageView6.setImageResource(R.drawable.v4im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 600));
                break;
            case 5:
                imageView6.setImageResource(R.drawable.v5im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 6:
                imageView6.setImageResource(R.drawable.v6im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 250));
                break;
            case 7:
                imageView6.setImageResource(R.drawable.v7im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 600));
                break;
            case 8:
                imageView6.setImageResource(R.drawable.v8im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 900));
                break;
            case 9:
                imageView6.setImageResource(R.drawable.v9im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 660));
                break;
            case 10:
                imageView6.setImageResource(R.drawable.v10im6);
                imageView6.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
        }

        n7 = (TextView) findViewById(R.id.textView7);
        e7 = (EditText) findViewById(R.id.editText7);
        N7 = (TextView) findViewById(R.id.textView7_7);
        ImageView imageView7 = (ImageView) findViewById(R.id.im7);
        switch (num) {
            case 1:
                imageView7.setImageResource(R.drawable.v1im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 800));
                break;
            case 2:
                imageView7.setImageResource(R.drawable.v2im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 400));
                break;
            case 3:
                imageView7.setImageResource(R.drawable.v3im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
            case 4:
                imageView7.setImageResource(R.drawable.v4im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 5:
                imageView7.setImageResource(R.drawable.v5im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 900));
                break;
            case 6:
                imageView7.setImageResource(R.drawable.v6im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 7:
                imageView7.setImageResource(R.drawable.v7im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
            case 8:
                imageView7.setImageResource(R.drawable.v8im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
            case 9:
                imageView7.setImageResource(R.drawable.v9im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 1200));
                break;
            case 10:
                imageView7.setImageResource(R.drawable.v10im7);
                imageView7.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
        }

        n8 = (TextView) findViewById(R.id.textView8);
        e8 = (EditText) findViewById(R.id.editText8);
        N8 = (TextView) findViewById(R.id.textView8_8);
        ImageView imageView8 = (ImageView) findViewById(R.id.im8);
        switch (num) {
            case 1:
                imageView8.setImageResource(R.drawable.v1im8);
                break;
            case 2:
                imageView8.setImageResource(R.drawable.v2im8);
                break;
            case 3:
                imageView8.setImageResource(R.drawable.v3im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 750));
                break;
            case 4:
                imageView8.setImageResource(R.drawable.v4im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 550));
                break;
            case 5:
                imageView8.setImageResource(R.drawable.v5im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
            case 6:
                imageView8.setImageResource(R.drawable.v6im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 700));
                break;
            case 7:
                imageView8.setImageResource(R.drawable.v7im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 900));
                break;
            case 8:
                imageView8.setImageResource(R.drawable.v8im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 500));
                break;
            case 9:
                imageView8.setImageResource(R.drawable.v9im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 1100));
                break;
            case 10:
                imageView8.setImageResource(R.drawable.v10im8);
                imageView8.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
        }

        n9 = (TextView) findViewById(R.id.textView9);
        e9 = (EditText) findViewById(R.id.editText9);
        N9 = (TextView) findViewById(R.id.textView9_9);
        ImageView imageView9 = (ImageView) findViewById(R.id.im9);
        switch (num) {
            case 1:
                imageView9.setImageResource(R.drawable.v1im9);
                break;
            case 2:
                imageView9.setImageResource(R.drawable.v2im9);
                break;
            case 3:
                imageView9.setImageResource(R.drawable.v3im9);
                imageView9.setLayoutParams(new LinearLayout.LayoutParams(1080, 200));
                break;
            case 4:
                imageView9.setImageResource(R.drawable.v4im9);
                imageView9.setLayoutParams(new LinearLayout.LayoutParams(1080, 250));
                break;
            case 5:
                imageView9.setImageResource(R.drawable.v5im9);
                imageView9.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
            case 6:
                imageView9.setImageResource(R.drawable.v6im9);
                imageView9.setLayoutParams(new LinearLayout.LayoutParams(1080, 250));
                break;
            case 7:
                imageView9.setImageResource(R.drawable.v7im9);
                break;
            case 8:
                imageView9.setImageResource(R.drawable.v8im9);
                imageView9.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 9:
                imageView9.setImageResource(R.drawable.v9im9);
                imageView9.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
            case 10:
                imageView9.setImageResource(R.drawable.v10im9);
                break;
        }

        n10 = (TextView) findViewById(R.id.textView10);
        e10 = (EditText) findViewById(R.id.editText10);
        N10 = (TextView) findViewById(R.id.textView10_10);
        ImageView imageView10 = (ImageView) findViewById(R.id.im10);
        switch (num) {
            case 1:
                imageView10.setImageResource(R.drawable.v1im10);
                break;
            case 2:
                imageView10.setImageResource(R.drawable.v2im10);
                break;
            case 3:
                imageView10.setImageResource(R.drawable.v3im10);
                break;
            case 4:
                imageView10.setImageResource(R.drawable.v4im10);
                break;
            case 5:
                imageView10.setImageResource(R.drawable.v5im10);
                break;
            case 6:
                imageView10.setImageResource(R.drawable.v6im10);
                imageView10.setLayoutParams(new LinearLayout.LayoutParams(1080, 1000));
                break;
            case 7:
                imageView10.setImageResource(R.drawable.v7im10);
                imageView10.setLayoutParams(new LinearLayout.LayoutParams(1080, 1300));
                break;
            case 8:
                imageView10.setImageResource(R.drawable.v8im10);
                imageView10.setLayoutParams(new LinearLayout.LayoutParams(1080, 1200));
                break;
            case 9:
                imageView10.setImageResource(R.drawable.v9im10);
                break;
            case 10:
                imageView10.setImageResource(R.drawable.v10im10);
                break;
        }

        n11 = (TextView) findViewById(R.id.textView11);
        e11 = (EditText) findViewById(R.id.editText11);
        N11 = (TextView) findViewById(R.id.textView11_11);
        ImageView imageView11 = (ImageView) findViewById(R.id.im11);
        switch (num) {
            case 1:
                imageView11.setImageResource(R.drawable.v1im11);
                break;
            case 2:
                imageView11.setImageResource(R.drawable.v2im11);
                break;
            case 3:
                imageView11.setImageResource(R.drawable.v3im11);
                imageView11.setLayoutParams(new LinearLayout.LayoutParams(1080, 600));
                break;
            case 4:
                imageView11.setImageResource(R.drawable.v4im11);
                imageView11.setLayoutParams(new LinearLayout.LayoutParams(1080, 650));
                break;
            case 5:
                imageView11.setImageResource(R.drawable.v5im11);
                break;
            case 6:
                imageView11.setImageResource(R.drawable.v6im11);
                break;
            case 7:
                imageView11.setImageResource(R.drawable.v7im11);
                break;
            case 8:
                imageView11.setImageResource(R.drawable.v8im11);
                imageView11.setLayoutParams(new LinearLayout.LayoutParams(1080, 600));
                break;
            case 9:
                imageView11.setImageResource(R.drawable.v9im11);
                break;
            case 10:
                imageView11.setImageResource(R.drawable.v10im11);
                imageView11.setLayoutParams(new LinearLayout.LayoutParams(1080, 600));
                break;
        }

        n12 = (TextView) findViewById(R.id.textView12);
        e12 = (EditText) findViewById(R.id.editTex12);
        N12 = (TextView) findViewById(R.id.textView12_12);
        ImageView imageView12 = (ImageView) findViewById(R.id.im12);
        switch (num) {
            case 1:
                imageView12.setImageResource(R.drawable.v1im12);
                break;
            case 2:
                imageView12.setImageResource(R.drawable.v2im12);
                break;
            case 3:
                imageView12.setImageResource(R.drawable.v3im12);
                imageView12.setLayoutParams(new LinearLayout.LayoutParams(1080, 400));
                break;
            case 4:
                imageView12.setImageResource(R.drawable.v4im12);
                break;
            case 5:
                imageView12.setImageResource(R.drawable.v5im12);
                imageView12.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
            case 6:
                imageView12.setImageResource(R.drawable.v6im12);
                imageView12.setLayoutParams(new LinearLayout.LayoutParams(1080, 400));
                break;
            case 7:
                imageView12.setImageResource(R.drawable.v7im12);
                imageView12.setLayoutParams(new LinearLayout.LayoutParams(1080, 300));
                break;
            case 8:
                imageView12.setImageResource(R.drawable.v8im12);
                break;
            case 9:
                imageView12.setImageResource(R.drawable.v9im12);
                imageView12.setLayoutParams(new LinearLayout.LayoutParams(1080, 350));
                break;
            case 10:
                imageView12.setImageResource(R.drawable.v10im12);
                break;
        }

        button = (Button) findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (e1.getText().toString().length() > 0 & e2.getText().toString().length() > 0 &
                        e3.getText().toString().length() > 0 & e4.getText().toString().length() > 0 &
                        e5.getText().toString().length() > 0 & e6.getText().toString().length() > 0 &
                        e7.getText().toString().length() > 0 & e8.getText().toString().length() > 0 &
                        e9.getText().toString().length() > 0 & e10.getText().toString().length() > 0 &
                        e11.getText().toString().length() > 0 & e12.getText().toString().length() > 0
                ) {
                    switch (num) {
                        case 1:
                            N1.setText("Правильный ответ: 8");
                            N2.setText("Правильный ответ: 10");
                            N3.setText("Правильный ответ: 10,5");
                            N4.setText("Правильный ответ: 0,0296");
                            N5.setText("Правильный ответ: 13");
                            N6.setText("Правильный ответ: 2");
                            N7.setText("Правильный ответ: 8");
                            N8.setText("Правильный ответ: 2");
                            N9.setText("Правильный ответ: -3");
                            N10.setText("Правильный ответ: 4000");
                            N11.setText("Правильный ответ: 4");
                            N12.setText("Правильный ответ: 2");
                            break;
                        case 2:
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
                            break;
                        case 3:
                            N1.setText("Правильный ответ: 9");
                            N2.setText("Правильный ответ: 3");
                            N3.setText("Правильный ответ: 1");
                            N4.setText("Правильный ответ: 0,5");
                            N5.setText("Правильный ответ: 4");
                            N6.setText("Правильный ответ: 7");
                            N7.setText("Правильный ответ: -2");
                            N8.setText("Правильный ответ: 2");
                            N9.setText("Правильный ответ: 22");
                            N10.setText("Правильный ответ: 30");
                            N11.setText("Правильный ответ: 59");
                            N12.setText("Правильный ответ: -16,5");
                            break;
                        case 4:
                            N1.setText("Правильный ответ: 15");
                            N2.setText("Правильный ответ: 1");
                            N3.setText("Правильный ответ: 68");
                            N4.setText("Правильный ответ: 0,35");
                            N5.setText("Правильный ответ: -0,4");
                            N6.setText("Правильный ответ: 150");
                            N7.setText("Правильный ответ: 8");
                            N8.setText("Правильный ответ: 198");
                            N9.setText("Правильный ответ: 10");
                            N10.setText("Правильный ответ: 400");
                            N11.setText("Правильный ответ: 400");
                            N12.setText("Правильный ответ: 1");
                            break;
                        case 5:
                            N1.setText("Правильный ответ: 90");
                            N2.setText("Правильный ответ: -7");
                            N3.setText("Правильный ответ: 135");
                            N4.setText("Правильный ответ: 0,02");
                            N5.setText("Правильный ответ: -0,5");
                            N6.setText("Правильный ответ: 1");
                            N7.setText("Правильный ответ: 9");
                            N8.setText("Правильный ответ: 1,5");
                            N9.setText("Правильный ответ: 1");
                            N10.setText("Правильный ответ: 30");
                            N11.setText("Правильный ответ: 8,4");
                            N12.setText("Правильный ответ: 0,5");
                            break;
                        case 6:
                            N1.setText("Правильный ответ: 20");
                            N2.setText("Правильный ответ: 4");
                            N3.setText("Правильный ответ: 8");
                            N4.setText("Правильный ответ: 0,5");
                            N5.setText("Правильный ответ: 21");
                            N6.setText("Правильный ответ: 141,75");
                            N7.setText("Правильный ответ: 7");
                            N8.setText("Правильный ответ: 9,5");
                            N9.setText("Правильный ответ: 6");
                            N10.setText("Правильный ответ: 0,625");
                            N11.setText("Правильный ответ: 8");
                            N12.setText("Правильный ответ: -10");
                            break;
                        case 7:
                            N1.setText("Правильный ответ: 6840");
                            N2.setText("Правильный ответ: 7");
                            N3.setText("Правильный ответ: 2,5");
                            N4.setText("Правильный ответ: 0,3");
                            N5.setText("Правильный ответ: 0,3");
                            N6.setText("Правильный ответ: -0,25");
                            N7.setText("Правильный ответ: 4");
                            N8.setText("Правильный ответ: 1,5");
                            N9.setText("Правильный ответ: 20");
                            N10.setText("Правильный ответ: 1,25");
                            N11.setText("Правильный ответ: 21");
                            N12.setText("Правильный ответ: -1");
                            break;
                        case 8:
                            N1.setText("Правильный ответ: 25850");
                            N2.setText("Правильный ответ: 465");
                            N3.setText("Правильный ответ: 40");
                            N4.setText("Правильный ответ: 0,07");
                            N5.setText("Правильный ответ: 4");
                            N6.setText("Правильный ответ: 6");
                            N7.setText("Правильный ответ: 6");
                            N8.setText("Правильный ответ: 96");
                            N9.setText("Правильный ответ: 10");
                            N10.setText("Правильный ответ: 30");
                            N11.setText("Правильный ответ: 38,4");
                            N12.setText("Правильный ответ: 10");
                            break;
                        case 9:
                            N1.setText("Правильный ответ: 163");
                            N2.setText("Правильный ответ: 16");
                            N3.setText("Правильный ответ: 10");
                            N4.setText("Правильный ответ: 0,225");
                            N5.setText("Правильный ответ: 3");
                            N6.setText("Правильный ответ: 6");
                            N7.setText("Правильный ответ: 3");
                            N8.setText("Правильный ответ: 6,5");
                            N9.setText("Правильный ответ: 1");
                            N10.setText("Правильный ответ: 7200");
                            N11.setText("Правильный ответ: 320000");
                            N12.setText("Правильный ответ: -5");
                            break;
                        case 10:
                            N1.setText("Правильный ответ: 211,2");
                            N2.setText("Правильный ответ: 13400");
                            N3.setText("Правильный ответ: 6");
                            N4.setText("Правильный ответ: 0,25");
                            N5.setText("Правильный ответ: 8");
                            N6.setText("Правильный ответ: 105");
                            N7.setText("Правильный ответ: 59");
                            N8.setText("Правильный ответ: 184");
                            N9.setText("Правильный ответ: 4");
                            N10.setText("Правильный ответ: 2");
                            N11.setText("Правильный ответ: 9");
                            N12.setText("Правильный ответ: -54");
                            break;
                    }
                } else {
                    Toast.makeText(getBaseContext(), "Заполните все ответы", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}