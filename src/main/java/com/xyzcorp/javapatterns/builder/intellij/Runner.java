package com.xyzcorp.javapatterns.builder.intellij;

public class Runner {
    public static void main(String[] args) {
        Country country = Country.builder()
                .setCapital("Lima")
                .setName("Peru")
                .setDemonym("Limans").build();

        System.out.println(country);
    }
}
