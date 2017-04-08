package com.amiao.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.amiao.text.view.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_main);
        FrameLayout fr= (FrameLayout) findViewById(R.id.root);
        fr.addView(new MyView(MainActivity.this));*/
      //  setContentView(R.layout.second);
        setContentView(R.layout.three);
    }
}
