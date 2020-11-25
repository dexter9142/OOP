package lab6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
        String title;
        String givenName;
        String middleName;
        String familyName;
        String name;
        char gender;
        String HomeAddress;
        String Phone;
        Date BirthDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");


        public void setName(String Name, String mName, String fName){
            this.givenName = Name;
            this.familyName = fName;
            this.middleName = mName;
            this.name = Name+ " " + mName + " " + fName;
        }

        public void Address(String str){
            this.HomeAddress = str;
        }

    public void setGender(char g) {
        if (g == 'M') this.gender = g;
        else if (g == 'F') {
            this.gender = g;
        } else this.gender = '*';
    }

        public void setPhone(String num){
            this.Phone = num;
        }

        public void setDate(int Day, int Month, int Year){
            BirthDate = new Date(Year-1900, Month, Day);
        }

        public void setTitle(String title){
            this.title = title;
        }

        public void DisplayData(){
            if (title != null)
                System.out.println("Title: " + title);

            System.out.println("Name: "+name);
            System.out.println("Birth date: "+ formatter.format(BirthDate));
            System.out.println("Gender: " + gender);
            System.out.println("Address: "+HomeAddress);
            System.out.println("Phone: " + Phone);
        }
}
