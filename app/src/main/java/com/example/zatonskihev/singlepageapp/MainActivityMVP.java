package com.example.zatonskihev.singlepageapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zatonskihev.singlepageapp.model.mainActivity.MainActivityModelImpl;
import com.example.zatonskihev.singlepageapp.presentation.presenter.MainActivityPresenter;
import com.example.zatonskihev.singlepageapp.presentation.presenterImplementation.MainActivityPresenterImpl;
import com.example.zatonskihev.singlepageapp.view.mainActivity.MainActivityView;

public class MainActivityMVP extends AppCompatActivity implements MainActivityView, View.OnClickListener {

    MainActivityPresenter mainActivityPresenter = new MainActivityPresenterImpl(new MainActivityModelImpl());

    private EditText editText;
    private TextView textView;
    private Button submitText;
    private AppCompatImageButton resetEditText;
    private AppCompatImageButton resetTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.plain_text_input);
        textView = (TextView) findViewById(R.id.text_to_show);
        submitText = (Button) findViewById(R.id.button);
        resetEditText = (AppCompatImageButton) findViewById(R.id.reset_edit_text);
        resetTextView = (AppCompatImageButton) findViewById(R.id.reset_state);
        submitText.setOnClickListener(this);
        resetEditText.setOnClickListener(this);
        resetTextView.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainActivityPresenter.bindView(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainActivityPresenter.unBindView();
    }

    @Override
    public void showText(String textToShow) {
        if (!textToShow.isEmpty()){
            textView.setText(textToShow);
        }
    }

    @Override
    public void resetText(String textToReplace, TextView textView) {
        textView.setText(textToReplace);
    }


    @Override
    public void onClick(View view)
    {
        switch(view.getId()){
            case (R.id.button):
                mainActivityPresenter.handleSubmitButton(editText.getText().toString().trim());
                break;
            case(R.id.reset_state):
                mainActivityPresenter.resetTextFields(getString(R.string.string_to_show), textView);
                break;
            case(R.id.reset_edit_text):
                mainActivityPresenter.resetTextFields(null, editText);
                break;
        }
    }
}
