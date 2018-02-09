package com.example.android.mvpaddtwonumbers.AddNumbersPackage;

import com.example.android.mvpaddtwonumbers.Calculator;
import com.example.android.mvpaddtwonumbers.MainActivityPackage.MainActivityPresenter;

/**
 * Created by win8 on 2/7/2018.
 */

public class Main2ActivityPresenter {

    iMain2ActivityInterface view;
    Calculator c;

     Main2ActivityPresenter(iMain2ActivityInterface v){

        view = v;

    }

    void Cancel(){

        view.NavigateToMainActivity();

    }

    int Calculate(int Num1 ,int Num2){

        return c.AddTwoNumbers(Num1, Num2);

    }

    void DisplayResult(int Result){

        view.DisplayResult(Result);

    }
}
