package lab6;

import java.util.ArrayList;
import java.util.UUID;

public class Department {

    String Id;
    String Name;
    String Address;
    String Phone;
    ArrayList<Staff> StaffList = new ArrayList<>();

    public Department(String name, String str, String num) {
        this.Id = UUID.randomUUID().toString();
        setName(name);
        setAddress(str);
        setPhone(num);
    }

    public void setName(String name){
        this.Name = name;
    }

    public void setAddress(String str){
        this.Address = str;
    }


    public void setPhone(String num) {
        this.Phone = num;
    }

    public void addStaff(Staff newStaff){
        StaffList.add(newStaff);
    }

    public void DisplayData(){
        System.out.println("Department Id: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Phone);
    }

}
