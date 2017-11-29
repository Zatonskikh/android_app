package com.example.zatonskihev.singlepageapp.model.mainActivity;

public class MainActivityModelImpl implements MainActivityModel {

    private String textToSHow;

    @Override
    public void setText(String text) {
        textToSHow = text;
    }

    public String getText(){
        return textToSHow;
    }
}
