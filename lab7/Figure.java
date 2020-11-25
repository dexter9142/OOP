package lab7;

abstract class Figure {
    public String name;
    public double length, width, height;

    public Figure (double length){
        this.length = length;
    }
    public Figure (double length, double width){
        this.length = length;
        this.width = width;
    }
    public Figure (double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height= height;

    }


    abstract double getArea();
    abstract double getPerimeter();
    abstract String getName();

    public void setName(String newName){
        this.name = newName;
    }
}
