package com.example.module6.chatactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.module6.R;

public class FirstActivity extends AppCompatActivity {

    public static final String INPUT_A1 = "input_first_activity";

    private EditText mEditTextMessage;
    private TextView mTextViewMessageReceived;
    private TextView mTextViewReplyReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initView();

        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                String valueSent = bundle.getString(SecondActivity.INPUT_A2);
                mTextViewMessageReceived.setText(valueSent);
                mTextViewReplyReceived.setVisibility(View.VISIBLE);
            }
        }
    }

    private void initView() {
        mEditTextMessage = findViewById(R.id.edit_text_message_a1);
        mTextViewMessageReceived = findViewById(R.id.text_view_message_received_a1);
        mTextViewReplyReceived = findViewById(R.id.text_view_reply_received);
    }

    public void sendMessageToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(INPUT_A1, mEditTextMessage.getText().toString());
        startActivity(intent);
    }
}
