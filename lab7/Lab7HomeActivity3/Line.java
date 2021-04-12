package com.company;

public class Line {
    private double startPoint;
    public double endPoint;
    private Point point;
    double length;

    public Line(double startPoint,double endPoint,Point point){
        this.endPoint = endPoint;
        this.point = point;
        this.startPoint = startPoint;
    }

    public double Calculate(){
        length = Math.sqrt((Math.pow(startPoint-point.getX_cord(),2))+(Math.pow(endPoint-point.getY_cord(),2)));
        return length;
    }
}
