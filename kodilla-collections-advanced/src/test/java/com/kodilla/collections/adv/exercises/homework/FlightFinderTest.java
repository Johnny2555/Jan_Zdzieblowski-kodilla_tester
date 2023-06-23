package com.kodilla.collections.adv.exercises.homework;
import org.junit.jupiter.api.Test;


import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class FlightFinderTest {
    @Test
    void testFindFlightsFrom() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flightsTable = flightRepository.getFlightsTable();
        String departure = "Warsaw";

        // When
        List<Flight> flightsFrom = flightFinder.findFlightsFrom(departure);

        // Then
        assertEquals(1, flightsFrom.size());
        for (Flight flight : flightsFrom) {
            assertEquals(departure, flight.getDeparture());
        }
    }

    @Test
    void testFindFlightsTo() {
        // Given
        FlightFinder flightFinder = new FlightFinder();
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flightsTable = flightRepository.getFlightsTable();
        String arrival = "London";

        // When
        List<Flight> flightsTo = flightFinder.findFlightsTo(arrival);

        // Then
        assertEquals(1, flightsTo.size());
        for (Flight flight : flightsTo) {
            assertEquals(arrival, flight.getArrival());
        }
    }


}