package com.thoughtworks.bridelabz;

public class CumulativePoetry {
    String[]  poem={"the house that Jack built","the malt that lay in\n","the rat that ate\n"};

    public static void main(String[] args) {
        CumulativePoetry poet=new CumulativePoetry();
        int day=Integer.parseInt(args[0]);
        String temp="This is ";
      for (int i=day;i>0;i--){
          temp+=poet.poem[i-1];
      }
        System.out.println(temp);
    }
    public String poetry(int day) {
        String temp="This is ";
       for (int i=day;i>0;i--){
           temp+=poem[i-1];
       }
       return temp;
    }
}
