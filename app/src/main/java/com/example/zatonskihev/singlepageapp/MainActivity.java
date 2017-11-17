package com.example.zatonskihev.singlepageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private AppCompatImageButton mReset;
    private AppCompatImageButton mResetEdit;
    private EditText mEdit;
    private TextView mTextView;
    private String storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button);
        mReset = (AppCompatImageButton) findViewById(R.id.reset_state);
        mResetEdit = (AppCompatImageButton) findViewById(R.id.reset_edit_text);
        mEdit   = (EditText)findViewById(R.id.plain_text_input);
        mTextView = (TextView)findViewById(R.id.text_to_show);

        View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    switch(view.getId()){
                        case (R.id.button):

                            if (!mEdit.getText().toString().isEmpty()){
                                mTextView.setText(mEdit.getText().toString());
                                break;
                            }
                            else{
                                mTextView.setText(getString(R.string.string_to_show));
                                break;
                            }
                        case(R.id.reset_state):
                            mTextView.setText(getString(R.string.string_to_show));
                            break;
                        case(R.id.reset_edit_text):
                            mEdit.setText(null);
                            break;
                    }
                }
            };

        mButton.setOnClickListener(onClickListener);
        mReset.setOnClickListener(onClickListener);
        mResetEdit.setOnClickListener(onClickListener);

    }


}
