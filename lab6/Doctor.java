package lab6;

public class Doctor extends Operation_Staff{
    public String[] speciality;
    public String[] locations;

    public void setSpeciality(){
        int Counter = 0;
        do {
            this.speciality[Counter] = in.nextLine();
            Counter++;
        }
        while (speciality[Counter-1] != null);
    }

    public void setLocations(){
        int Counter = 0;
        do {
            this.locations[Counter] = in.nextLine();
            Counter++;
        }
        while (locations[Counter-1] != null);
    }

    @Override
    public void DisplayData() {
        super.DisplayData();
        if (speciality.length != 0) {
            System.out.println("Specialities :");
            for (int i = 0; i < speciality.length; i++) {
                System.out.println((i + 1) + ". " + speciality[i]);
            }
        }

        if (locations.length != 0) {
            System.out.println("Locations :");
            for (int i = 0; i < locations.length; i++) {
                System.out.println((i + 1) + ". " + locations[i]);
            }
        }
    }
}
