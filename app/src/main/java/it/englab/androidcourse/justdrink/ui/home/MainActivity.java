package it.englab.androidcourse.justdrink.ui.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import it.englab.androidcourse.justdrink.R;
import it.englab.androidcourse.justdrink.model.Drink;
import it.englab.androidcourse.justdrink.model.DrinkFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textViewDrinkName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDrinkName = (TextView) findViewById(R.id.drink_name);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Drink randomDrink = DrinkFactory.getRandomDrink();
        Log.d(TAG, "Random Drink info: " + randomDrink);
        textViewDrinkName.setText(randomDrink.getStrDrink());
    }
}
