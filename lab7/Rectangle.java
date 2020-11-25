package lab7;

public class Rectangle extends Figure{

    public Rectangle(double length, double width, String name) {
        super(length, width);
        this.name = name;
    }

    public Rectangle(double length, double width) {
        super(length, width);
        this.name = "Rectangle"; //default figure name
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    String getName(){
        return name;
    }
}
