package OOP8;

import java.util.ArrayList;
import java.util.List;

public class GeometricBodyController {

    public List <OOP8.GeometricBodyInterface> GemetricBodyControllerList = new ArrayList<>();


    public GeometricBodyController(List<GeometricBodyInterface> Control){
        GemetricBodyControllerList = Control;
    }


    public int GetMaxSurface(){
        double maxSurface = Math.max(GemetricBodyControllerList.get(0).getSurface(), GemetricBodyControllerList.get(1).getSurface());
        for (int i = 2; i < GemetricBodyControllerList.size(); i++) {
            maxSurface = Math.max(maxSurface, GemetricBodyControllerList.get(i).getSurface());
        }

        for (int i = 0; i < GemetricBodyControllerList.size(); i++) {
            if (GemetricBodyControllerList.get(i).getSurface() == maxSurface)
                return i;
        }
        return -1;
    }

    public int GetMaxVolume(){
        double maxVolume = Math.max(GemetricBodyControllerList.get(0).getVolume(), GemetricBodyControllerList.get(1).getVolume());
        for (int i = 2; i < GemetricBodyControllerList.size(); i++) {
            maxVolume = Math.max(maxVolume, GemetricBodyControllerList.get(i).getVolume());
        }
        for (int i = 0; i < GemetricBodyControllerList.size(); i++) {
            if (GemetricBodyControllerList.get(i).getVolume() == maxVolume)
                return i;
        }
        return -1;
    }
}
