package com.company;

public class Monitor {
    private String model;
    private String color;
    private int diagonal;
    private String resolution;

    public Monitor(String model, String color, int diagonal, String resolution){
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public void updateColor(String color){
        this.color = color;
    }

    public void updateDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    public void updateResolution(String resolution){
        this.resolution = resolution;
    }

    public String getModel(){
        return model;
    }

    public int getDiagonal(){
        return diagonal;
    }

    public String getResolution(){
        return resolution;
    }

    public void print(){
        System.out.println("Model: "+getModel()+";\nDiagonal: "+getDiagonal()+";\nResolution: "+getResolution()+";\n");
    }

    public boolean isEqual(Monitor o){
        if((model == o.model)&& (color==o.color)&&(diagonal==o.diagonal)&& resolution==o.resolution){
            return true;
        }
        else return false;
    }
}

