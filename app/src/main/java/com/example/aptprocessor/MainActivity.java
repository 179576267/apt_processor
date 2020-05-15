package com.example.aptprocessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.annotation.BindView;
import com.example.inject.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button btn;

    @BindView(R.id.btn2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, btn2.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
