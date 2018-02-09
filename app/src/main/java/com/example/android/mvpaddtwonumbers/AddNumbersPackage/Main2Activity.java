package com.example.android.mvpaddtwonumbers.AddNumbersPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.mvpaddtwonumbers.MainActivityPackage.MainActivity;
import com.example.android.mvpaddtwonumbers.R;

public class Main2Activity extends AppCompatActivity implements iMain2ActivityInterface{

    EditText Num1EditText;
    EditText Num2EditText;
    Button CancelButton;
    Button CalculateButton;
    TextView ResultTextView;
    Main2ActivityPresenter PresenterObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Num1EditText = (EditText)findViewById(R.id.Num1EditText);
        Num2EditText = (EditText)findViewById(R.id.Num2EditText);
        CalculateButton = (Button)findViewById(R.id.CalculateButton);
        CancelButton = (Button)findViewById(R.id.CancelButton);
        ResultTextView = (TextView)findViewById(R.id.ResultTextView);
        PresenterObject = new Main2ActivityPresenter(Main2Activity.this);


        CalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PresenterObject.DisplayResult(PresenterObject.Calculate(
                        Integer.valueOf((Num1EditText.getText().toString()))
                        ,Integer.valueOf((Num2EditText.getText().toString()))));

            }
        });

        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PresenterObject.Cancel();
            }
        });
    }

    @Override
    public void NavigateToMainActivity() {

        Intent i = new Intent(Main2Activity.this , MainActivity.class);
        startActivity(i);

    }

    @Override
    public void DisplayResult(int Result) {
        ResultTextView.setText(String.valueOf(Result));
    }
}
