package com.example.zatonskihev.singlepageapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainViewHolder {

        public final EditText editText;
        public final TextView textView;
        public final Button submitText;
        public final Button resetEditText;
        public final Button resetTextView;

        public MainViewHolder(View view) {
            editText = (EditText) view.findViewById(R.id.plain_text_input);
            textView = (TextView) view.findViewById(R.id.text_to_show);
            submitText = (Button) view.findViewById(R.id.button);
            resetEditText = (Button) view.findViewById(R.id.reset_edit_text);
            resetTextView =  (Button) view.findViewById(R.id.reset_state);

        }
}

