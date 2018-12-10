package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monitor ACER = new Monitor("ACER SA270bid", "black", 27, "1920 x 1080");
        Monitor SAMSUNG = new Monitor("SAMSUNG C27F390FHI", "blue",28, "1920 x 1080");
        Monitor SAMSUNG2 = new Monitor("SAMSUNG C27F390FHI", "blue",28, "1920 x 1080");
        System.out.println("Created monitors:");
        ACER.print();
        SAMSUNG.print();
        System.out.println("The monitor with a bigger resolution is:");
        if(SAMSUNG.getDiagonal()>ACER.getDiagonal()){
            SAMSUNG.print();
        }
        else{
            ACER.print();
        }
        System.out.println("Are the 2 monitors equal?");
        if (SAMSUNG.isEqual(SAMSUNG2)){
            System.out.println("YES!");
        }
        else{
            System.out.println("NO!");
        }

    }
}
