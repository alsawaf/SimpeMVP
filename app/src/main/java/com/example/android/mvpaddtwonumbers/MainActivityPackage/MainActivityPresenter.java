package com.example.android.mvpaddtwonumbers.MainActivityPackage;

import android.content.Context;
import android.view.View;

/**
 * Created by win8 on 2/6/2018.
 */

public class MainActivityPresenter {

    iMainActivityInterface view;


    MainActivityPresenter(iMainActivityInterface v){

        view = v;

    }


    void NavigateToAddNumbers(){

        view.ClickStartButton();

    }
}
