package ru.itpark.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class InitialsServiceTest {
    // TDD
    @ParameterizedTest
    @CsvFileSource(resources = "/initials.csv", numLinesToSkip = 1)
    void getInitials(String input, String expected) {
        InitialsService service = new InitialsService();

        String actual = service.getInitials(input);

        assertEquals(expected, actual);
    }

    // Ivan Petrov -> IV
    // Ivan -> I
    // Huan Pedro Rodriges -> HR
    // ivan petrov -> iv
}