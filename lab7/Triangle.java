package lab7;


public class Triangle extends Figure{

    public Triangle(double length, double width, double height, String name) {
        super(length, width, height);
        this.name = name;
    }
    public Triangle(double length, double width, double height) {
        super(length, width, height);
        this.name = "Triangle"; //default figure name
    }
    @Override
    double getPerimeter() {
        return length + width + height;
    }

    @Override
    double getArea() {
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter - length) * (halfPerimeter - width) * (halfPerimeter - height));
    }

    @Override
    String getName(){
        return name;
    }
}
