package it.englab.androidcourse.justdrink.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import it.englab.androidcourse.justdrink.R;

public class DetailActivityForResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_for_result);

        findViewById(R.id.button_success).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });

        findViewById(R.id.button_error).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextResponse = (EditText) findViewById(R.id.edit_text_response);
                String message = editTextResponse.getText().toString();

                Intent result = new Intent();
                result.putExtra("ERR_DESCRIPTION", message);
                setResult(RESULT_CANCELED, result);
                finish();
            }
        });
    }


}
