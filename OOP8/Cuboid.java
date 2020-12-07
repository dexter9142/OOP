package OOP8;


public class Cuboid implements GeometricBodyInterface{
    protected static int counter = 1;

    double length;
    double width;
    double height;
    String name;

    public Cuboid(double length, double width, double height, String name){
        this.length = length;
        this.width = width;
        this.height= height;
        this.name = name;
    }
        //unused after interface implementation
    public Cuboid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height= height;
        this.name = "Cuboid" + Integer.toString(counter);
        counter++;
    }
    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public double getSurface() {
        return 2 * (length * width + length * height + width * length);
    }

    @Override
    public String getName() {
        return name;
    }
}
