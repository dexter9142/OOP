package lab7;

import java.util.*;

public class FigureControl {
    List<Figure> FiguresList = new ArrayList<>();


    public int GetMaxArea(){
        double maxArea = Math.max(FiguresList.get(0).getArea(), FiguresList.get(1).getArea());
        for (int i = 2; i < FiguresList.size(); i++) {
            maxArea = Math.max(maxArea, FiguresList.get(i).getArea());
        }

        for (int i = 0; i < FiguresList.size(); i++) {
            if (FiguresList.get(i).getArea() == maxArea)
                return i;
        }
        return -1;
    }

    public int GetMaxPerimeter(){
        double maxPerimeter = Math.max(FiguresList.get(0).getPerimeter(), FiguresList.get(1).getPerimeter());
        for (int i = 2; i < FiguresList.size(); i++) {
            maxPerimeter = Math.max(maxPerimeter, FiguresList.get(i).getPerimeter());
        }
        for (int i = 0; i < FiguresList.size(); i++) {
            if (FiguresList.get(i).getPerimeter() == maxPerimeter)
                    return i;
        }
        return -1;
    }
}
