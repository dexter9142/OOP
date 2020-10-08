package OOP2;

public class Main {
    public static void main(String[] args) {
        Boxes boxdef = new Boxes();
        Boxes box1 = new Boxes(4);
        Boxes box3 = new Boxes(5, 6, 9);


        System.out.println("Box with 1 parameter: \n" + "Depth: " + boxdef.depth + "\nWidth: " + boxdef.width + "\nHeight: " + boxdef.height + "\n");
        System.out.println("Box with 2 parameters: \n" + "Depth: " + box1.depth + "\nWidth: " + box1.width + "\nHeight: " + box1.height + "\n");
        System.out.println("Box with 3 parameters: \n" + "Depth: " + box3.depth + "\nWidth: " + box3.width + "\nHeight: " + box3.height +"\n");
        System.out.println("Area of box 1: " + boxdef.calcArea());
        System.out.println("Area of box 2: " + box1.calcArea());
        System.out.println("Area of box 3: " + box3.calcArea()+"\n");
        System.out.println("Volume of box 1: " + boxdef.calcVolume());
        System.out.println("Volume of box 2: " + box1.calcVolume());
        System.out.println("Volume of box 3: " + box3.calcVolume()+"\n");





    }
}
