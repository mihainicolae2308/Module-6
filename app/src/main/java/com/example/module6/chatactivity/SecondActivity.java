package com.example.module6.chatactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.module6.R;

public class SecondActivity extends AppCompatActivity {

    public static final String INPUT_A2 = "input_second_activity";

    private EditText mEditTextMessage;
    private TextView mTextViewMessageReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();

        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                String valueSent = bundle.getString(FirstActivity.INPUT_A1);
                mTextViewMessageReceived.setText(valueSent);
            }
        }


    }

    private void initView() {
        mEditTextMessage = findViewById(R.id.edit_text_message_a2);
        mTextViewMessageReceived = findViewById(R.id.text_view_message_received_a2);
    }

    public void sendMessageToFirstActivity(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra(INPUT_A2, mEditTextMessage.getText().toString());
        startActivity(intent);
    }
}
