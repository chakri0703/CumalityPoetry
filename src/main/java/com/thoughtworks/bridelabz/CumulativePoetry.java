package com.thoughtworks.bridelabz;

public class CumulativePoetry {
    private String[] poem = {"the house that Jack built\n",
            "the malt that lay in\n",
            "the rat that ate\n",
            "the cat that killed\n",
            "the dog that worried\n",
            "that cow with the crumpled horn that tossed\n",
            "the maiden all forlorn that milked\n",
            "the man all tattered and torn that kissed\n",
            "the priest all shaven and shorn that married\n",
            "the rooster that crowed in the morn that woke\n",
            "the farmer sowing his corn that kept\n",
            "the horse and the hound and the horn that belonged to\n"};

    public String poetry(int day,boolean duplicate) {
        StringBuilder temp = new StringBuilder("This is ");
        for (int i = day; i > 0; i--) {
            if (duplicate){
                temp.append(poem[i - 1]);
            }
            temp.append(poem[i - 1]);
        }
        return temp.toString();
    }
}
