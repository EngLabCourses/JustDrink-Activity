package it.englab.androidcourse.justdrink.model;

/**
 * Created by spawn on 08/02/17.
 */

public class DrinkFactory {

    private static final Drink[] drinks = {
            new Drink.Builder()
                    .idDrink("14107").strDrink("Absolut Summertime").strCategory("Cocktail")
                    .strGlass("Collins glass").strInstructions("Add all ingredients except lemon to shaker filled with ice. Cover and shake vigorously. Strain contents into ice filled collins glass. Garnish with lemon.")
                    .ingredients(new String[]{"Absolut Citron", "Sweet and sour", "Sprite", "Soda water", "Lemon"})
                    .measures(new String[]{"1 1/2 oz ", "3/4 oz ", "1/2 oz ", "3 oz ", "1 slice "}).build(),
            new Drink.Builder()
                    .idDrink("14133").strDrink("Cosmopolitan Martini").strCategory("Cocktail")
                    .strGlass("vote").strInstructions("Pour all ingredients in mixing glass half filled with ice, shake and strain into chilled Martini glass.")
                    .ingredients(new String[]{"Cointreau", "Vodka", "Lime", "Cranberry juice"})
                    .measures(new String[]{"1/2 oz ", "1 oz ", "Juice of 1/2 ", "1 splash "}).build(),
            new Drink.Builder()
                    .idDrink("17177").strDrink("Dark Caipirinha").strCategory("Cocktail")
                    .strGlass("Highball glass").strInstructions("Muddle the sugar into the lime wedges in an old-fashioned glass.\\r\\nFill the glass with ice cubes.\\r\\nPour the cachaca into the glass.\\r\\nStir well.")
                    .ingredients(new String[]{"demerara Sugar", "Lime", "Cachaca"})
                    .measures(new String[]{"2 tsp ", "1 ", "2 1/2 oz"}).build(),
            new Drink.Builder()
                    .idDrink("17177").strDrink("Dark Caipirinha").strCategory("Cocktail")
                    .strGlass("Highball glass").strInstructions("Muddle the sugar into the lime wedges in an old-fashioned glass.\\r\\nFill the glass with ice cubes.\\r\\nPour the cachaca into the glass.\\r\\nStir well.")
                    .ingredients(new String[]{"demerara Sugar", "Lime", "Cachaca"})
                    .measures(new String[]{"2 tsp ", "1 ", "2 1/2 oz"}).build(),
            new Drink.Builder()
                    .idDrink("13427").strDrink("Mojito").strCategory("Cocktail")
                    .strGlass("Highball glass").strInstructions("Lightly muddle the mint and sugar with a splash of soda water in a mixing glass until the sugar dissolve and you smell the mint. Squeeze the lime into the glass, add rum and shake with ice. Strain over cracked ice in a highball glass. Top with soda water, garnish with mint sprig and serve.")
                    .ingredients(new String[]{"Light rum", "Lime", "Sugar", "Mint", "Soda water"})
                    .measures(new String[]{"2-3 oz ", "Juice of 1 ", "2 tsp ", "2-4"}).build()

    };
}
