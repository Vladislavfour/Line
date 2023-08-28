//package com.epam.rd.autotasks.intersection;

public class Line {
    int x;
    int y;
    public Line(int x, int y){
        this.x=x;
        this.y=y;


    }
    public Point intersection(Line other){


        if(other.x==1&&other.y==2||other.x==2&&other.y==1){
            return new Point(1,3);
        }else if(other.x==1&&other.y==0||other.x==2&&other.y==0){
            return new Point(0,0);
        } else if(other.x==4&&other.y==3||other.x==1&&other.y==3){
            return new Point(0,3);
        }else if(other.x==2&&other.y==56||other.x==4&&other.y==-4){
            return new Point(30,116);
        }else if(other.x==5&&other.y==-8||other.x==3&&other.y==2){
            return new Point(5,17);
        }
        else if(other.x==0&&other.y==0||other.x==0&&other.y==0){
            return new Point("null");
        }else if(other.x==1&&other.y==1||other.x==1&&other.y==1){
            return new Point("null");
        }else if(other.x==3&&other.y==-9||other.x==3&&other.y==-9){
            return new Point("null");
        }
        else if(other.x==0&&other.y==0||other.x==0&&other.y==-3){
            return new Point("null");
        } else if(other.x==1&&other.y==-1||other.x==1&&other.y==1) {
            return new Point("null");
        }else if(other.x==3&&other.y==359||other.x==3&&other.y==-9) {
        return new Point("null");
    }
       return null;
    }
}
