package com.xyzcorp.tdd;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProgrammerTest {
    Programmer cpp = new Programmer("Bjarne", "Strousoup", LocalDate.of(1950, 12, 30), () -> LocalDate.of(2018, 6, 1));
    Programmer python = new Programmer("Guido", "Van Rossum", LocalDate.of(1956, 1, 31), () -> LocalDate.of(2018, 6, 1));
    @Test
    void testProgrammerNameCpp() {
        assertThat(cpp.getFullName()).isEqualTo("Bjarne Strousoup");
    }

    @Test
    void testProgrammerNamePython() {
        assertThat(python.getFullName()).isEqualTo("Guido Van Rossum");
    }

    @Test
    void testProgrammerAgeCpp() {
        assertThat(cpp.getAge()).isEqualTo(67);
    }

    // Fake date for unit test
    @Test
    void testProgrammerAgePython() {
        assertThat(python.getAge()).isEqualTo(62);
    }

    // Real time for integration test
    @Test
    @Tag("integration")
    void testStaticFactoryAndHideTheComplexity() {
        Programmer guido = Programmer.of("Guido", "Van Rossum", LocalDate.of(1956, 1, 31));
        assertThat(guido.getAge()).isGreaterThan(62);
    }

}
