package com.itzs.testhook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            ClipHelper.binder();
        } catch (Exception e) {
            e.printStackTrace();
        }
        EditText editText = new EditText(this);
        setContentView(editText);
    }
}
