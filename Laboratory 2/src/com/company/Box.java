package com.company;

public class Box {
    private double height;
    private double width;
    private double depth;

    public Box(){
        height = 1;
        width = 1;
        depth =1;
    }

    public Box(double oneVar){
        height = oneVar;
        width = oneVar;
        depth = oneVar;
    }

    public Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getSurface(){
        return 2*height*width+2*height*depth+2*width*depth;
    }

    public double getVolume() {
        return width*height*depth;
    }

}

