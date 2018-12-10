package com.company;

public class Main {

    public static void main(String[] args) {
        Paralelipiped paralelipiped = new Paralelipiped(2, 3, 4);
        Sphere sphere = new Sphere(5);
        Cub cub = new Cub(7);
        GeometricBody[] geometricBodies = {paralelipiped, sphere, cub};
        GeometricBodyController geometricBodyController = new GeometricBodyController(geometricBodies);

        System.out.println("biggest volume: "+ geometricBodyController.getBiggestVolumebody(geometricBodies).getVolume());
        System.out.println("biggest surface: "+ geometricBodyController.getBiggestSurfacebody(geometricBodies).getSurface());
    }
}
