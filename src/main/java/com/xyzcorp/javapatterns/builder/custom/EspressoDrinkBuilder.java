package com.xyzcorp.javapatterns.builder.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:47 PM
 */
public class EspressoDrinkBuilder {

    private boolean decaf;
    private boolean whip;
    private boolean sprinkles;
    private Dairy dairy;
    private int shots;

    public EspressoDrinkBuilder(int shots) {
        this.shots = shots;
    }

    public EspressoDrinkBuilder addWhip() {
        this.whip = true;
        return this;
    }

    public EspressoDrinkBuilder addSprinkles() {
        this.sprinkles = true;
        return this;
    }

    public EspressoDrinkBuilder addDairy(Dairy dairy) {
        this.dairy = dairy;
        return this;
    }

    public EspressoDrinkBuilder setDecaf() {
        this.decaf = true;
        return this;
    }
    
    public EspressoDrink build() {
        return new EspressoDrink(this);
    }

    public boolean isDecaf() {
        return decaf;
    }

    public boolean isWhip() {
        return whip;
    }

    public boolean isSprinkles() {
        return sprinkles;
    }

    public Dairy dairy() {
        return this.dairy;
    }

    public int getShots() {
        return shots;
    }
}
