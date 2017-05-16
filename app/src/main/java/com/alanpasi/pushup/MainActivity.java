package com.alanpasi.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void TestUpLoad() {
        int i = 0;
        i += i;

        i = 2 + i;

        i = 3 + 1;
    }
}
