package OOP2;


public class Boxes
{
    int height, width, depth;

    public Boxes(){
        this.width = 1;
        this.height = 1;
        this.depth =1;

    }

    public Boxes(int a){
        this.width = a;
        this.depth=a;
        this.height=a;
    }

    public Boxes(int a, int b, int c){
        this.width = a;
        this.depth=b;
        this.height=c;
    }

    public int calcArea(){
        int area = 2*(height*width + width*depth + depth*height);
        return area;
    }

    public int calcVolume(){
        int volume = height*width*depth;
        return volume;
    }
}

