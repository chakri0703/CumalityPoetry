package com.thoughtworks.bridelabz;

public class CumulativePoetry {
    private String[] poem = {"the house that Jack built", "the malt that lay in\n", "the rat that ate\n", "the cat that killed\n","the dog that worried\n","that cow with the crumpled horn that tossed\n"};

    public static void main(String[] args) {
        CumulativePoetry poet = new CumulativePoetry();
        int day = Integer.parseInt(args[0]);
        StringBuilder temp = new StringBuilder("This is ");
        for (int i = day; i > 0; i--) {
            temp.append(poet.poem[i - 1]);
        }
        System.out.println(temp);
    }

    public String poetry(int day) {
        StringBuilder temp = new StringBuilder("This is ");
        for (int i = day; i > 0; i--) {
            temp.append(poem[i - 1]);
        }
        return temp.toString();
    }
}
