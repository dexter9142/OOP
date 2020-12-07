package OOP8;

//public class Sphere extends GeometricBody{
public class Sphere implements GeometricBodyInterface{
    protected static int counter = 1;
    double radix;
    String name;
    public Sphere(double radix, String name){
        this.radix = radix;
        this.name = name;
    }
    //unused after interface implementation
    public Sphere(double radix){
        this.radix = radix;
        this.name = "Sphere_" + Integer.toString(counter);
        counter++;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(radix, 2);
    }

    @Override
    public double getVolume() {
        return  4 * Math.PI * Math.pow(radix, 3) / 3;
    }

    @Override
    public String getName() {
        return name;
    }
}
