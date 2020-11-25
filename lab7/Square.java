package lab7;


public class Square extends Figure{

    public Square(double length, String name) {
        super(length);
        this.name = name;
    }
    public Square(double length) {
        super(length);
        this.name = "Square"; //default figure name
    }

    @Override
    double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    double getPerimeter() {
        return 4 * length;
    }

    @Override
    String getName(){
        return name;
    }
}
