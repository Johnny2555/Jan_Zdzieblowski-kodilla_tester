package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    @ParameterizedTest
    @MethodSource("personTestData")
    public void shouldCalculateCorrectBMI(PersonTestData testData) {

        Person person = new Person(testData.getHeight(), testData.getWeight());
        String bmi = person.getBMI();
        assertEquals(testData.getExpectedBMI(), bmi);
    }
    private static Stream<PersonTestData> personTestData() {
        return Stream.of(
                new PersonTestData(1.80, 40, "Very severely underweight"),
                new PersonTestData(1.80, 50, "Severely underweight"),
                new PersonTestData(1.80, 55, "Underweight"),
                new PersonTestData(1.80, 70, "Normal (healthy weight)"),
                new PersonTestData(1.80, 90, "Overweight"),
                new PersonTestData(1.80, 100, "Obese Class I (Moderately obese)"),
                new PersonTestData(1.80, 120, "Obese Class II (Severely obese)"),
                new PersonTestData(1.80, 140, "Obese Class III (Very severely obese)"),
                new PersonTestData(1.80, 150, "Obese Class IV (Morbidly Obese)"),
                new PersonTestData(1.80, 170, "Obese Class V (Super Obese)"),
                new PersonTestData(1.80, 200, "Obese Class VI (Hyper Obese)")


        );
    }
}
