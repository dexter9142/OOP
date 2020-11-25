package lab6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Staff extends Person{
        Date joined;
        String[] education;
        String[] certification;
        String[] languages;
    Scanner in = new Scanner(System.in);

    public void setJoined(int Day, int Month, int Year) {
        this.joined = new Date(Year-1900, Month, Day);
    }

    public void setEducation(){
        int Counter = 0;
        do {
            this.education[Counter] = in.nextLine();
            Counter++;
        }
        while (education[Counter-1] != null);
    }

    public void setCertification(){
        int Counter = 0;
        do {
            this.certification[Counter] = in.nextLine();
            Counter++;
        }
        while (certification[Counter-1] != null);
    }

    public void setLanguages(){
        int Counter = 0;
        do {
            this.languages[Counter] = in.nextLine();
            Counter++;
        }
        while (languages[Counter-1] != null);
    }

    @Override
    public void DisplayData() {
        super.DisplayData();
        if (education.length != 0){
            System.out.println("Education :");
            for (int i = 0; i < education.length; i++) {
                System.out.println((i + 1) + " " + education[i]);
            }
        }
        if (certification.length != 0) {
            System.out.println("Сertification :");
            for (int i = 0; i < certification.length; i++) {
                System.out.println((i + 1) + " " + certification[i]);
            }
        }
        if (languages.length != 0) {
            System.out.println(" Languages :");
            for (int i = 0; i < languages.length; i++) {
                System.out.println((i + 1) + " " + languages[i]);
            }
        }
    }
}

