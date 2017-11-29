package com.example.zatonskihev.singlepageapp;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityViewHolder {

        public final EditText editText;
        public final TextView textView;
        public final Button submitText;
        public final Button resetEditText;
        public final Button resetTextView;


        public MainActivityViewHolder(EditText editText, TextView textView, Button) {
            this.editText = editText;
            this.textView = textView;}
}

