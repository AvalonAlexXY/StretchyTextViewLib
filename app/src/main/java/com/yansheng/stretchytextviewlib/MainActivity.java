package com.yansheng.stretchytextviewlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;

import com.yansheng.expandlib.ExpandTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandTextView expandTextView =(ExpandTextView) findViewById(R.id.expand_text);
        expandTextView.setMaxLineCount(3);
        expandTextView.setContent("helloWorld! helloWorld! helloWorld! helloWorld! " +
                "helloWorld! helloWorld! helloWorld! helloWorld! helloWorld! " +
                "helloWorld! helloWorld! helloWorld! helloWorld! helloWorld! " +
                "helloWorld! helloWorld! helloWorld! helloWorld! helloWorld! ");
        expandTextView.setBottomTextGravity(Gravity.RIGHT);
        expandTextView.setContentTextSize(16);
    }
}
