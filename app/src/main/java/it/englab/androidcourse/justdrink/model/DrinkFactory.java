package it.englab.androidcourse.justdrink.model;

/**
 * Created by spawn on 08/02/17.
 */

public class DrinkFactory {
/*
    {

    },
    {
    },
    {
        "strDrink": "Manhattan",
            "strDrinkThumb": "http://www.thecocktaildb.com/images/media/drink/tppwwx1439906584.jpg",
            "idDrink": "13839"
    },
    {
        "strDrink": "Martinez Cocktail",
            "strDrinkThumb": "http://www.thecocktaildb.com/images/media/drink/wwxwvr1439906452.jpg",
            "idDrink": "11720"
    },
    {
        "strDrink": "Martini (Dry) (5-to-1)",
            "strDrinkThumb": "http://www.thecocktaildb.com/images/media/drink/vryutq1477140858.jpg",
            "idDrink": "11728"
    },
    {
        "strDrink": "Miami Vice",
            "strDrinkThumb": "http://www.thecocktaildb.com/images/media/drink/qvuyqw1441208955.jpg",
            "idDrink": "13936"
    },
    {
        "strDrink": "Mojito",
            "strDrinkThumb": "http://www.thecocktaildb.com/images/media/drink/rxtqps1478251029.jpg",
            "idDrink": "13427"
    }*/

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
                    .measures(new String[]{"2 tsp ", "1 ", "2 1/2 oz"}).build()

    };
}
