package com.nonexistenware.igor.pocketmemo.view;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nonexistenware.igor.pocketmemo.R;

public class PickActivityNewMemoSecured extends AppCompatActivity {

    private ImageView toNewMemo, toSecuredMemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_new_memo_secured);

        toNewMemo = findViewById(R.id.to_new_memo);
        toSecuredMemo = findViewById(R.id.to_secured_memo);

        toNewMemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NewNoteActivity.class));
            }
        });

        toSecuredMemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), WarningSecuredActivity.class));
            }
        });
    }
}
