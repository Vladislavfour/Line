//package com.epam.rd.autotasks.intersection;

public class Point {
    private int x;
    private int y;
    private String name="v" ;

    public Point (int x, int y){
        this.x=x;
        this.y=y;
    }

    public Point(String name){
        this.name=name;
    }


    public String toString(){
        if(name=="null"){
            return String.format(name);
        }else  {
            return String.format("(%d;%d)", x, y);
        }
        }
    }

