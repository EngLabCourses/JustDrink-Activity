package it.englab.androidcourse.justdrink.model;

import java.util.Arrays;

/**
 * Created by spawn on 07/02/2017.
 */
public class Drink {

    private String idDrink;
    private String strDrink;
    private String strCategory;
    private String strAlcoholic;
    private String strGlass;
    private String strInstructions;
    private String strDrinkThumb;
    private String[] ingredients;
    private String[] measures;

    private Drink(Builder builder) {
        idDrink = builder.idDrink;
        strDrink = builder.strDrink;
        strCategory = builder.strCategory;
        strAlcoholic = builder.strAlcoholic;
        strGlass = builder.strGlass;
        strInstructions = builder.strInstructions;
        strDrinkThumb = builder.strDrinkThumb;
        ingredients = builder.ingredients;
        measures = builder.measures;
    }

    public String getIdDrink() {
        return idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String[] getMeasures() {
        return measures;
    }

    public static final class Builder {
        private String idDrink;
        private String strDrink;
        private String strCategory;
        private String strAlcoholic;
        private String strGlass;
        private String strInstructions;
        private String strDrinkThumb;
        private String[] ingredients;
        private String[] measures;

        public Builder() {
        }

        public Builder idDrink(String val) {
            idDrink = val;
            return this;
        }

        public Builder strDrink(String val) {
            strDrink = val;
            return this;
        }

        public Builder strCategory(String val) {
            strCategory = val;
            return this;
        }

        public Builder strAlcoholic(String val) {
            strAlcoholic = val;
            return this;
        }

        public Builder strGlass(String val) {
            strGlass = val;
            return this;
        }

        public Builder strInstructions(String val) {
            strInstructions = val;
            return this;
        }

        public Builder strDrinkThumb(String val) {
            strDrinkThumb = val;
            return this;
        }

        public Builder ingredients(String[] val) {
            ingredients = val;
            return this;
        }

        public Builder measures(String[] val) {
            measures = val;
            return this;
        }

        public Drink build() {
            return new Drink(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drink{");
        sb.append("idDrink='").append(idDrink).append('\'');
        sb.append(", strDrink='").append(strDrink).append('\'');
        sb.append(", strCategory='").append(strCategory).append('\'');
        sb.append(", strAlcoholic='").append(strAlcoholic).append('\'');
        sb.append(", strGlass='").append(strGlass).append('\'');
        sb.append(", strInstructions='").append(strInstructions).append('\'');
        sb.append(", strDrinkThumb='").append(strDrinkThumb).append('\'');
        sb.append(", ingredients=").append(Arrays.toString(ingredients));
        sb.append(", measures=").append(Arrays.toString(measures));
        sb.append('}');
        return sb.toString();
    }
}