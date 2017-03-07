package it.englab.androidcourse.justdrink.ui.detail;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import it.englab.androidcourse.justdrink.R;

public class TestContextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_context);

        getApplicationContext().setTheme(R.style.AppTheme);

        TextView textViewAppContext = new TextView(getApplicationContext());
        textViewAppContext.setTextSize(20);
        textViewAppContext.setText("Application Context");

        TextView textViewActivityContext = new TextView(this);
        textViewActivityContext.setTextSize(20);
        textViewActivityContext.setText("Activity Context");

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        linearLayout.addView(textViewAppContext);
        linearLayout.addView(textViewActivityContext);

    }
}
