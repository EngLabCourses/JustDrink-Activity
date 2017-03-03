package it.englab.androidcourse.justdrink.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import it.englab.androidcourse.justdrink.JustDrinkApplication;
import it.englab.androidcourse.justdrink.R;
import it.englab.androidcourse.justdrink.model.Drink;
import it.englab.androidcourse.justdrink.model.DrinkFactory;

public class DetailActivity extends AppCompatActivity {

    public static final String DRINK_ID_KEY = "COCKTAIL_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView info = (TextView) findViewById(R.id.detail_cocktail_info);
        TextView ingredients = (TextView) findViewById(R.id.detail_cocktail_ingredients);
        TextView instructions = (TextView) findViewById(R.id.detail_cocktail_instructions);

        String drinkId;
        if (getIntent().getData() != null) {
            drinkId = getIntent().getData().getLastPathSegment();
        } else {
            drinkId = getIntent().getExtras().getString(DRINK_ID_KEY);
        }
        Drink drink = DrinkFactory.getDrinkById(drinkId);

        StringBuilder infoBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(drink.getStrCategory())) {
            infoBuilder.append(drink.getStrCategory());
        }
        if (!TextUtils.isEmpty(drink.getStrAlcoholic())) {
            infoBuilder.append(", ").append(drink.getStrAlcoholic());
        }

        info.setText(infoBuilder.toString());
        instructions.setText(drink.getStrInstructions());
        ingredients.setText(getIngredientsString(drink));
        setTitle(drink.getStrDrink());
    }

    @Override
    protected void onResume() {
        super.onResume();

        JustDrinkApplication application = ((JustDrinkApplication) getApplication());
        application.increment();
        int count = application.getIncrementValue();
        Toast.makeText(this, "Activity mostrate: " + count, Toast.LENGTH_SHORT).show();
    }

    private String getIngredientsString(Drink drink) {
        StringBuilder ingredientsBuilder = new StringBuilder();

        String[] ingredients = drink.getIngredients();
        String[] measures = drink.getMeasures();
        for (int i = 0; i < ingredients.length; i++) {
            ingredientsBuilder.append(ingredients[i]).append(" (").append(measures[i]).append(") ");
        }
        return ingredientsBuilder.toString();
    }
}
