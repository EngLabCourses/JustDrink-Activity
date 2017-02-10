package it.englab.androidcourse.justdrink.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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
        setContentView(R.layout.activity_main);

        textViewDrinkName = (TextView) findViewById(R.id.drink_name);
    }

    @Override
    protected void onResume() {
        super.onResume();

        final Drink randomDrink = DrinkFactory.getRandomDrink();

        textViewDrinkName.setText(randomDrink.getStrDrink());
        textViewDrinkName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Random Drink info: " + randomDrink);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.DRINK_ID_KEY, randomDrink.getIdDrink());
                startActivity(intent);
            }
        });
    }
}
