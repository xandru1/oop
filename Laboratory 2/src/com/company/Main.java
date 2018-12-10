package com.company;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(1,2,3);

        System.out.println("Surface: \n1.Box1: "+box1.getSurface()+"\n2.Box2: "+box2.getSurface()+"\n3.Box3: "+box3.getSurface());
        System.out.println("Area: \n1.Box1: "+box1.getVolume()+"\n2.Box2: "+box2.getVolume()+"\n3.Box3: "+box3.getVolume());
    }
}
