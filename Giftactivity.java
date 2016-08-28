package com.example.vibhor.birthdaygift;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiftActivity extends AppCompatActivity {
    public Button bnext;

    public void init(){
        bnext= (Button)findViewById(R.id.bnext);
        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(GiftActivity.this, Gift2.class);
                startActivity(toy);
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
        init();
    }
}
