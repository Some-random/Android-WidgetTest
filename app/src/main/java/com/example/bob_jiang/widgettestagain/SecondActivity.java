package com.example.bob_jiang.widgettestagain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.widgettestagain.R;

/**
 * Created by Bob_JIANG on 10/5/2015.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle bundle) {
        Intent it = getIntent();
        setContentView(R.layout.activity_second);
        final EditText et = (EditText) findViewById(R.id.edittext1);
        et.setSelection(et.getText().toString().length());
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        Button bt = (Button) findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("text", et.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        super.onCreate(bundle);
    }
}
