package com.thoughtworks.bridelabz;

public class Main {
    public static void main(String[] args) {
        int day;
        boolean duplicate=false;
        if (args.length == 2) {
            if (args[0].equals("--echo")){
               duplicate=true;
            }
            day = Integer.parseInt(args[1]);
        } else {
            day = Integer.parseInt(args[0]);
        }
        CumulativePoetry poet = new CumulativePoetry();
        System.out.println(poet.poetry(day, duplicate));
    }
}
