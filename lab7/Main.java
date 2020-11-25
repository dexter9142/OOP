package lab7;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n");

        Square square_1 = new Square(15, "square 1");
        System.out.println(square_1.name + "'s Perimeter : " + square_1.getPerimeter());
        System.out.println(square_1.name + "'s Area : " + square_1.getArea());

        System.out.println("\n");

        Rectangle rectangle_1 = new Rectangle(15, 25, "rectangle 1");
        System.out.println(rectangle_1.name + "'s Perimeter : " + rectangle_1.getPerimeter());
        System.out.println(rectangle_1.name + "'s Area : " + rectangle_1.getArea());

        System.out.println("\n");

        Triangle triangle_1 = new Triangle(15, 25, 35, "triangle 1");
        System.out.println(triangle_1.name + "'s Perimeter : " + triangle_1.getPerimeter());
        System.out.println(triangle_1.name + "'s Area : " + triangle_1.getArea());

        System.out.println("\n");
                    //Third part//
        Figure circle_1 = new Figure(10) {

            @Override
            double getArea() {
                return Math.PI * Math.pow(length, 2);
            }

            @Override
            double getPerimeter() {
                return Math.PI * 2 * length;
            }

            @Override
            String getName() {
                return name;
            }

            @Override
            public void setName(String newName){
                this.name = newName;
            }
        };
        circle_1.setName("circle_1");


        System.out.println(circle_1.name + "'s Perimeter : " + circle_1.getPerimeter());
        System.out.println(circle_1.name + "'s Area : " + circle_1.getArea());
        System.out.println("\n");


        FigureControl figures_check = new FigureControl();
        figures_check.FiguresList.add(square_1);
        figures_check.FiguresList.add(rectangle_1);
        figures_check.FiguresList.add(triangle_1);
        figures_check.FiguresList.add(circle_1);


        int FigureWithTheBiggestArea = figures_check.GetMaxArea();
        System.out.println(figures_check.FiguresList.get(FigureWithTheBiggestArea).getName() + " has the biggest area");
        System.out.println("Area = " + figures_check.FiguresList.get(FigureWithTheBiggestArea).getArea());
        int FigureWithTheBiggestPerimeter = figures_check.GetMaxPerimeter();
        System.out.println(figures_check.FiguresList.get(FigureWithTheBiggestPerimeter).getName() + " has the biggest perimeter");
        System.out.println("Perimeter = " + figures_check.FiguresList.get(FigureWithTheBiggestArea).getPerimeter());

    }
}
