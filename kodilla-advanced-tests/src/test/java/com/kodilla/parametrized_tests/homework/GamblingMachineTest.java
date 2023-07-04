package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTest {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @MethodSource(value = "InvalidNumbersException")
    void howManyWins(Set<Integer> input) {
        assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(input));
    }
    private static Stream<Arguments> InvalidNumbersException () {
        return Stream.of(
                Arguments.of(Set.of(55,46,70,53)),
                Arguments.of(Set.of(100,230,450,121)),
                Arguments.of(Set.of(99,0,77,88)),
                Arguments.of(Set.of(1000,2000,2500,3000)),
                Arguments.of(Set.of(400,500,600,770)
                ));
    }

    }




