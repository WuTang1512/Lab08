package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    private CustomList list;
    private City calgary;
    private City edmonton;
    private City vancouver;


    @BeforeEach
    public void setUp() {
        list = new CustomList();

        calgary = new City("Calgary", "AB");
        edmonton = new City("Edmonton", "AB");
        vancouver = new City("Vancouver", "BC");

        list.addCity(calgary);
        list.addCity(edmonton);
        list.addCity(vancouver);
    }

    @Test
    public void testHasCity() {
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        // delete city from CustomList
        list.deleteCity(edmonton);

        // checks to see if city has been deleted from list
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        assertEquals(3, list.countCities(list));
    }
}
