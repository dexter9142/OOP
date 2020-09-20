package OOP;

import java.util.Scanner;
import java.lang.String;
import java.lang.Double;

public class lab1 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Monitor[] DBM = new Monitor[100];

        int i = 0;
        int max;
        Monitor tmp;

        System.out.print("Monitors #: ");
        byte e = in.nextByte();

        while (i < e) {
            String a = in.nextLine();
            DBM[i] = new Monitor(a);

            System.out.print("Input Color: ");
            String c = in.nextLine();
            DBM[i].SetColor(c);

            System.out.println("Input Dimensions: (in millimeters)");
            System.out.print("Height: ");
            int q = in.nextInt();
            System.out.print("Width: ");
            int w = in.nextInt();
            DBM[i].SetDimensions(q, w);

            System.out.println("Input Resolution: ");
            System.out.print("Height: ");
            q = in.nextInt();
            System.out.print("Width: ");
            w = in.nextInt();
            DBM[i].SetResolution(q, w);



            System.out.println("==================================");
            i++;
            System.out.println();
        }

        //sort by dimensions
        System.out.println("sort by dimensions");
        for(i = 0; i < e-1; i++)
        {
            max = i;
            for(int n = i+1; n < e; n++)
            {
                if (DBM[n].getMonitorArea() > DBM[max].getMonitorArea())
                    max = n;
            }

            tmp = DBM[i];
            DBM[i] = DBM[max];
            DBM[max] = tmp;
        }

        for (i = e-1; i >= 0; i--)
            DBM[i].DisplayInfo();
        System.out.println();
        System.out.println();
    }
}

 class Monitor
{
    //monitor parameters

    String Model;
    int Height, Width; // in millimetres
    int ResHeight;
    int ResWidth;
    int Res;
    long Area;
    //we introduce resolution in such way : 720 1080; so we need two variables(or an array) to save them
    String Color;

    public Monitor(String SetModel)
    {
        this.Model = SetModel;
    }



    public void SetResolution(int SetResHeight, int SetResWidth)
    {
        ResHeight = SetResHeight;
        ResWidth = SetResWidth;
        Res = ResHeight * ResWidth;
    }

    public void SetDimensions(int SetHeight, int SetWidth)
    {
        Width = SetWidth;
        Height = SetHeight;
        Area = Height * Width;
    }

  /*  public void SetPPI()
    {
        PPI = 1.0* (ResHeight*ResWidth) / (Height*Width);
    }*/

    public long getMonitorArea()
    {
        return Area;
    }


    public void SetColor(String SetColor)
    {
        Color = SetColor;
    }

    public void DisplayInfo()
    {
        System.out.println("==================================");
        System.out.println("Color: " + Color );
        System.out.println("Dimensions: " + Height + "×" + Width + " mm");
        System.out.println("Resolution: " + ResWidth + "×" + ResWidth);
        System.out.println("==================================");
    }

}
