package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Supplier;

public class Programmer {
    private String firstName;
    private String lastName;
    private LocalDate birtDate;
    private Supplier<LocalDate> localDateSupplier;

    protected Programmer(String firstName, String lastName, LocalDate birthDate,
                      Supplier<LocalDate> localDateSupplier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDate = birthDate;
        this.localDateSupplier = localDateSupplier;
    }

    // Hide the "Supplier" complexity with a static factory
    public static Programmer of(String first, String last, LocalDate birtDate) {
        return new Programmer(first, last, birtDate, () -> LocalDate.now());
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public int getAge() {
        return Period.between(birtDate, localDateSupplier.get()).getYears();
    }

}
