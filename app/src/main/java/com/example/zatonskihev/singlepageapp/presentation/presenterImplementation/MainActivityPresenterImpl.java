package com.example.zatonskihev.singlepageapp.presentation.presenterImplementation;

import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.zatonskihev.singlepageapp.model.mainActivity.MainActivityModel;
import com.example.zatonskihev.singlepageapp.presentation.presenter.MainActivityPresenter;
import com.example.zatonskihev.singlepageapp.view.mainActivity.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityModel mainActivityModel;
    @Nullable
    private MainActivityView mainActivityView;

    public MainActivityPresenterImpl(MainActivityModel mainActivityModel) {
        this.mainActivityModel = mainActivityModel;
    }

    @Override
    public void bindView(MainActivityView mainActivityView) {

        this.mainActivityView = mainActivityView;
    }

    @Override
    public void unBindView() {
        mainActivityView = null;
    }

    @Override
    public void handleSubmitButton(String text) {
        mainActivityModel.setText(text);
        if (mainActivityView != null) {
            mainActivityView.showText(mainActivityModel.getText());
        }
    }

    @Override
    public void resetTextFields(String textToShow, TextView textView) {
        if (mainActivityView != null){
            mainActivityView.resetText(textToShow, textView);
        }
    }

}
