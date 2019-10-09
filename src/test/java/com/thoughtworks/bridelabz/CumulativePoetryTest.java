package com.thoughtworks.bridelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CumulativePoetryTest {
    @Test
    void givenDayOne_WhenPoem_ThenShouldShowDayOnePoem(){
        CumulativePoetry poetry=new CumulativePoetry();
        assertEquals("This is the house that Jack built",poetry.poetry(1));
    }
    @Test
    void givenDayTwo_WhenPoem_ThenShouldShowDayTwoPoem(){
        CumulativePoetry poetry=new CumulativePoetry();
        assertEquals("This is the malt that lay in\nthe house that Jack built",poetry.poetry(2));
    }
    @Test
    void givenDayThree_WhenPoem_ThenShouldShowDayThreePoem(){
        CumulativePoetry poetry=new CumulativePoetry();
        assertEquals("This is the rat that ate\nthe malt that lay in\nthe house that Jack built",poetry.poetry(3));
    }

}
