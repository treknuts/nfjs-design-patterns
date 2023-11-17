package com.xyzcorp.javapatterns.builder.intellij;

public class Country {
    private final String name;
    private final String capital;
    private final String demonym;

    private final int population;

    private final String currency;

    protected Country(String name, String capital, String demonym,
                   int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.demonym = demonym;
        this.population = population;
        this.currency = currency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String capital;
        private String demonym;
        private int population;
        private String currency;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCapital(String capital) {
            this.capital = capital;
            return this;
        }

        public Builder setDemonym(String demonym) {
            this.demonym = demonym;
            return this;
        }

        public Builder setPopulation(int population) {
            this.population = population;
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Country build() {
            return new Country(name, capital, demonym, population, currency);
        }
    }
}
