package it.englab.androidcourse.justdrink.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

import it.englab.androidcourse.justdrink.R;
import it.englab.androidcourse.justdrink.model.Drink;
import it.englab.androidcourse.justdrink.model.DrinkFactory;

public class DetailActivity extends AppCompatActivity {

    public static final String DRINK_ID_KEY = "COCKATIL_ID";
    private TextView info, ingredients, instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        info = (TextView) findViewById(R.id.detail_cocktail_info);
        ingredients = (TextView) findViewById(R.id.detail_cocktail_ingredients);
        instructions = (TextView) findViewById(R.id.detail_cocktail_instructions);

        Drink drink = DrinkFactory.getDrinkById(getIntent().getExtras().getString(DRINK_ID_KEY));

        setTitle(drink.getStrDrink());

        StringBuilder infoBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(drink.getStrCategory()))
            infoBuilder.append(drink.getStrCategory());
        if (!TextUtils.isEmpty(drink.getStrAlcoholic()))
            infoBuilder.append(", ").append(drink.getStrAlcoholic());

        info.setText(infoBuilder.toString());

    }

}
