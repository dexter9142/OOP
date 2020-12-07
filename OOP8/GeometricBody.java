package OOP8;

public abstract class GeometricBody {
    public String name;
    public double length, width, height;

    public GeometricBody (double length){
        this.length = length;
    }

    public GeometricBody (double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height= height;
    }

    public abstract double getVolume();
    public abstract double getSurface();
    public abstract String getName();
}
