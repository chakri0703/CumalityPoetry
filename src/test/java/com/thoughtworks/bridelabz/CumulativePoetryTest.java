package com.thoughtworks.bridelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativePoetryTest {
    @Test
    void givenDayOne_WhenPoem_ThenShouldShowDayOnePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the house that Jack built", poetry.poetry(1));
    }

    @Test
    void givenDayTwo_WhenPoem_ThenShouldShowDayTwoPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the malt that lay in\nthe house that Jack built", poetry.poetry(2));
    }

    @Test
    void givenDayThree_WhenPoem_ThenShouldShowDayThreePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the rat that ate\nthe malt that lay in\nthe house that Jack built", poetry.poetry(3));
    }

    @Test
    void givenDayFour_WhenPoem_ThenShouldShowDayFourPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built", poetry.poetry(4));
    }
    @Test
    void givenDayFive_WhenPoem_ThenShouldShowDayFivePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        String poem="This is the dog that worried\nthe cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built";
        assertEquals(poem, poetry.poetry(5));
    }
    @Test
    void givenDaySix_WhenPoem_ThenShouldShowDaySixPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        String poem="This is that cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built";
        assertEquals(poem, poetry.poetry(6));
    }
}
