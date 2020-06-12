package com.example.myproject1;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class bringiton extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bring);
       // TextView textView = (TextView) findViewById(R.id.bring_it_on);
        //textView.setText("Just bring it on");
    }

}

