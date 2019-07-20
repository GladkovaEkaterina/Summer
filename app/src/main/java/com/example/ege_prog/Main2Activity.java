package com.example.ege_prog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private static class Model {
        final String title;
        final String text;
        final String btnText;

        public Model(String title, String text, String btnText) {
            this.title = title;
            this.text = text;
            this.btnText = btnText;
        }
    }

    private final Model mdl = new Model("Title", "text text lorem ipsum", "clikme");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ((TextView) findViewById(R.id.title)).setText(R.string.textView);
    }
}
