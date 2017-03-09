package it.englab.androidcourse.justdrink.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import it.englab.androidcourse.justdrink.JustDrinkApplication;
import it.englab.androidcourse.justdrink.R;
import it.englab.androidcourse.justdrink.model.Drink;
import it.englab.androidcourse.justdrink.model.DrinkFactory;
import it.englab.androidcourse.justdrink.ui.detail.DetailActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textViewDrinkName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate");

        setContentView(R.layout.activity_main);

        //TODO 1
        textViewDrinkName = (TextView) findViewById(R.id.drink_name);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        JustDrinkApplication application = ((JustDrinkApplication) getApplication());
        application.increment();
        int count = application.getIncrementValue();
        Toast.makeText(this, "Activity mostrate: " + count, Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onResume");

        final Drink randomDrink = DrinkFactory.getRandomDrink();

        //TODO 1
        textViewDrinkName.setText(randomDrink.getStrDrink());
        //TODO 2
        textViewDrinkName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO 2
                Log.d(TAG, "Random Drink info: " + randomDrink);
                //TODO 3
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.DRINK_ID_KEY, randomDrink.getIdDrink());
                startActivity(intent);

                //TODO 4 - Activity for result example
                //Intent intent = new Intent(MainActivity.this, TestContextActivity.class);
                //startActivity(intent);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}









