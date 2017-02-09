package it.englab.androidcourse.justdrink.model;

/**
 * Created by spawn on 08/02/17.
 */

public class DrinkFactory {
/*
    {

    },
    {
        "strDrink": "Dark Caipirinha",
            "strDrinkThumb": "http://www.thecocktaildb.com/images/media/drink/uwstrx1472406058.jpg",
            "idDrink": "17177"
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
                    .measures(new String[]{"1/2 oz ", "1 oz ", "Juice of 1/2 ", "1 splash "}).build()

    };
}
