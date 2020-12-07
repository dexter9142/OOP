package OOP8;


//public class Cube extends GeometricBody{
public class Cube implements GeometricBodyInterface{
    protected static int counter = 1;
    double length;
    String name;

    public Cube(String name, double length){
        this.length = length;
        this.name = name;
    }
    //Unused, because Interface has been implemented
    public Cube(double length){
        this.name = "Cub_" + Integer.toString(counter);
        counter++;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(length,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

    @Override
    public String getName() {
        return name;
    }
}
