package com.mihail.mycam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mCatName;
    private TextView mHelloTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.textView);
        mCatName = (EditText)findViewById(R.id.editText);
    }

    public void OnClick(View view) {
        mHelloTextView.setText(getString(R.string.Hello) + mCatName.getText());
    }
}
