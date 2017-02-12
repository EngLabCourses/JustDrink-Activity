package it.englab.androidcourse.justdrink.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by spawn on 08/02/17.
 */
public class DrinkFactory {

    private static final Map<String, Drink> drinksMap = new HashMap<>(4);

    static {
        drinksMap.put("14107", new Drink.Builder()
                .idDrink("14107").strDrink("Absolut Summertime").strCategory("Cocktail")
                .strGlass("Collins glass").strInstructions("Add all ingredients except lemon to shaker filled with ice. Cover and shake vigorously. Strain contents into ice filled collins glass. Garnish with lemon.")
                .ingredients(new String[]{"Absolut Citron", "Sweet and sour", "Sprite", "Soda water", "Lemon"})
                .measures(new String[]{"1 1/2 oz ", "3/4 oz ", "1/2 oz ", "3 oz ", "1 slice "}).build());
        drinksMap.put("14133", new Drink.Builder()
                .idDrink("14133").strDrink("Cosmopolitan Martini").strCategory("Cocktail")
                .strGlass("vote").strInstructions("Pour all ingredients in mixing glass half filled with ice, shake and strain into chilled Martini glass.")
                .ingredients(new String[]{"Cointreau", "Vodka", "Lime", "Cranberry juice"})
                .measures(new String[]{"1/2 oz ", "1 oz ", "Juice of 1/2 ", "1 splash "}).build());
        drinksMap.put("17177", new Drink.Builder()
                .idDrink("17177").strDrink("Dark Caipirinha").strCategory("Cocktail")
                .strGlass("Highball glass").strInstructions("Muddle the sugar into the lime wedges in an old-fashioned glass.\\r\\nFill the glass with ice cubes.\\r\\nPour the cachaca into the glass.\\r\\nStir well.")
                .ingredients(new String[]{"demerara Sugar", "Lime", "Cachaca"})
                .measures(new String[]{"2 tsp ", "1 ", "2 1/2 oz"}).build());
        drinksMap.put("13427", new Drink.Builder()
                .idDrink("13427").strDrink("Mojito").strCategory("Cocktail")
                .strGlass("Highball glass").strInstructions("Lightly muddle the mint and sugar with a splash of soda water in a mixing glass until the sugar dissolve and you smell the mint. Squeeze the lime into the glass, add rum and shake with ice. Strain over cracked ice in a highball glass. Top with soda water, garnish with mint sprig and serve.")
                .ingredients(new String[]{"Light rum", "Lime", "Sugar", "Mint", "Soda water"})
                .measures(new String[]{"2-3 oz ", "Juice of 1 ", "2 tsp ", "2-4"}).build());
    }

    public static Drink getDrinkById(String drinkId) {
        return drinksMap.get(drinkId);
    }

    public static Drink getRandomDrink() {
        Object[] drinks = getDrinks();
        return (Drink) drinks[new Random().nextInt(4)];
    }

    private static Object[] getDrinks() {
        return drinksMap.values().toArray();
    }

}
