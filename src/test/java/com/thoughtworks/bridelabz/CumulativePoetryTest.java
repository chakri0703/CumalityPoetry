package com.thoughtworks.bridelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativePoetryTest {
    @Test
    void givenDayOne_WhenPoem_ThenShouldShowDayOnePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the house that Jack built\n", poetry.poetry(1,null));
    }

    @Test
    void givenDayTwo_WhenPoem_ThenShouldShowDayTwoPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the malt that lay in\nthe house that Jack built\n", poetry.poetry(2,null));
    }

    @Test
    void givenDayThree_WhenPoem_ThenShouldShowDayThreePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the rat that ate\nthe malt that lay in\nthe house that Jack built\n", poetry.poetry(3,null));
    }

    @Test
    void givenDayFour_WhenPoem_ThenShouldShowDayFourPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        assertEquals("This is the cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built\n", poetry.poetry(4,null));
    }

    @Test
    void givenDayFive_WhenPoem_ThenShouldShowDayFivePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        String poem = "This is the dog that worried\nthe cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built\n";
        assertEquals(poem, poetry.poetry(5,null));
    }

    @Test
    void givenDaySix_WhenPoem_ThenShouldShowDaySixPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        String poem = "This is that cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built\n";
        assertEquals(poem, poetry.poetry(6,null));
    }

    @Test
    void givenDaySeven_WhenPoem_ThenShouldShowDaySevenPoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        String poem = "This is the maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malt that lay in\nthe house that Jack built\n";
        assertEquals(poem, poetry.poetry(7,null));
    }
    @Test
    void givenDayTwelve_WhenPoem_ThenShouldShowDayTwelvePoem() {
        CumulativePoetry poetry = new CumulativePoetry();
        String poem = "This is the horse and the hound and the horn that belonged to\n" +
                "the farmer sowing his corn that kept\n" +
                "the rooster that crowed in the morn that woke\n" +
                "the priest all shaven and shorn that married\n" +
                "the man all tattered and torn that kissed\n" +
                "the maiden all forlorn that milked\n" +
                "that cow with the crumpled horn that tossed\n" +
                "the dog that worried\n" +
                "the cat that killed\n" +
                "the rat that ate\n" +
                "the malt that lay in\n" +
                "the house that Jack built\n";
        assertEquals(poem, poetry.poetry(12,null));
    }

    @Test
    void givenDayOneAndEchoCmd_WhenPoem_ThenShouldShowDuplicateLines() {
        CumulativePoetry poetry = new CumulativePoetry();
        String  poem="This is the house that Jack built\nthe house that Jack built\n";
        assertEquals(poem, poetry.poetry(1,"--echo"));
    }
}
