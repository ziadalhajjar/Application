package com.example.it.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void clickfun(View view){
    Toast.makeText(this, "Hi there" , Toast.LENGTH_LONG).show();
    EditText editText = (EditText) findViewById(R.id.editText1);
    Log.i("info" , editText.getText().toString());
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
