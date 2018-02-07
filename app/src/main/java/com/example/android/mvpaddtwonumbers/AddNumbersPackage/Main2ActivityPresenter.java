package com.example.android.mvpaddtwonumbers.AddNumbersPackage;

import com.example.android.mvpaddtwonumbers.MainActivityPackage.MainActivityPresenter;

/**
 * Created by win8 on 2/7/2018.
 */

public class Main2ActivityPresenter {

    iMain2ActivityInterface view;

     Main2ActivityPresenter(iMain2ActivityInterface v){

        view = v;

    }

    void Cancel(){

        view.NavigateToMainActivity();

    }

    int Calculate(int Num1 ,int Num2){

        return view.Calculate(Num1,Num2);

    }

}
