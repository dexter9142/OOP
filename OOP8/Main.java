package OOP8;

import java.util.*;

public class Main {



    public static void main(String[] args) {


        //Geometric body with interface implementation (basic level)
        List<GeometricBodyInterface> GeometricBodyList = new ArrayList<>();
        GeometricBodyList.add(new Cube("Cube",15));
        GeometricBodyList.add(new Cuboid(15, 25, 18, "Cuboid"));
        GeometricBodyList.add(new Sphere(7, "Sphere"));

        for (int i = 0; i < GeometricBodyList.size(); i++) {
            System.out.println("/ / / / / / / /");
            System.out.println("Shape: " + GeometricBodyList.get(i).getName());
            System.out.println("Area: " + GeometricBodyList.get(i).getSurface());
            System.out.println("Volume: " + GeometricBodyList.get(i).getVolume() + "\n");
        }
        System.out.println("/ / / / / / / /");

        //Part Two with GeometricBodyInterface implementation (intermediate level)
        GeometricBodyController GBC = new GeometricBodyController(GeometricBodyList);
        int BS = GBC.GetMaxSurface(); //BS == Biggest Surface
        System.out.println("Shape with largest surface: "+ GeometricBodyList.get(BS).getName());
        System.out.println("Area value: " + GeometricBodyList.get(BS).getSurface());

        int BV = GBC.GetMaxVolume();
        System.out.println("\nShape with largest volume:"+ GeometricBodyList.get(BV).getName());
        System.out.println("Volume: "+ GeometricBodyList.get(BV).getVolume());
    }
}
