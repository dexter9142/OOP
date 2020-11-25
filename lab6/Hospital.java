package lab6;

import java.util.ArrayList;
import java.util.UUID;

public class Hospital {

    String Name;
    String Address;
    String Phone;
    ArrayList<Department> departments = new ArrayList<>();


    public Hospital() {
        this.Name = UUID.randomUUID().toString();
    }

    public void setAddress(String str){
        this.Address = str;
    }


    public void setPhone(String num) {
        this.Phone = num;
    }

    public void addDepartment(Department newDepartment){
        departments.add(newDepartment);
    }

    public void DisplayData(){
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Phone);
    }


}
