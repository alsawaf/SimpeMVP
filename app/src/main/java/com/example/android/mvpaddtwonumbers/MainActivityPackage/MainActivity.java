package com.example.android.mvpaddtwonumbers.MainActivityPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.mvpaddtwonumbers.AddNumbersPackage.Main2Activity;
import com.example.android.mvpaddtwonumbers.R;

public class MainActivity extends AppCompatActivity  implements iMainActivityInterface{

    Button StartButton;
    MainActivityPresenter PresenterObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartButton = (Button)findViewById(R.id.StartButton);
        PresenterObject = new MainActivityPresenter(MainActivity.this);

        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PresenterObject.NavigateToAddNumbers();

            }
        });
    }

    @Override
    public void ClickStartButton() {
        Intent i = new Intent(MainActivity.this , Main2Activity.class);
        startActivity(i);
    }
}
