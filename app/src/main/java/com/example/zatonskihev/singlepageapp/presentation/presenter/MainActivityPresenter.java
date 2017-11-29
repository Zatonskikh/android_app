package com.example.zatonskihev.singlepageapp.presentation.presenter;

import android.widget.TextView;

import com.example.zatonskihev.singlepageapp.view.mainActivity.MainActivityView;

public interface MainActivityPresenter {

    void bindView(MainActivityView mainActivityView);

    void unBindView();

    void handleSubmitButton(String text);

    void resetTextFields(String textToShow, TextView textView);
}
