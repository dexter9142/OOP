package lab6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import  java.util.*;


public class Patient extends Person {
    Scanner in = new Scanner(System.in);
    String id;
    int age;
    Date accepted;
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    String[] allergies;
    String[] prescriptions;
    String[] specialRegs;

    ArrayList<Operation_Staff> OperationStaffList = new ArrayList<>();
    public void addOperationStaff(Operation_Staff newOP){
        OperationStaffList.add(newOP);
    }

    @Override
    public void setName(String Name, String mName, String fName) {
        super.setName(Name, mName, fName);
        setId();
    }

    @Override
    public void setDate(int Day, int Month, int Year) {
        super.setDate(Day, Month, Year);
        setAge(Day, Month, Year);
        setAccepted();
    }

    private void setAge(int Day, int Month, int Year){
        Date CurrentDate = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int date1 = Integer.parseInt(formatter.format(BirthDate));
        int date2 = Integer.parseInt(formatter.format(CurrentDate));
        age = (date2 - date1)/10000;
    }

    protected void setId() {
        this.id = UUID.randomUUID().toString();
    }

    private void setAccepted() {
        accepted = new Date();
    }

    public void setAllergies(){
        int Counter = 0;
        do {
            this.allergies[Counter] = in.nextLine();
            Counter++;
        }
        while (allergies[Counter-1] != null);
    }

    public void setSpecialRegs(){
        int Counter = 0;
        do {
            this.specialRegs[Counter] = in.nextLine();
            Counter++;
        }
        while (specialRegs[Counter-1] != null);
    }

    public void setPrescriptions(){
        int Counter = 0;
        do {
            this.prescriptions[Counter] = in.nextLine();
            Counter++;
        }
        while (prescriptions[Counter-1] != null);
    }


    @Override
    public void DisplayData() {
        System.out.println("Personal id: " + id);
        super.DisplayData();
        System.out.println("Age: " + age);
        System.out.println("Enrollment date: " + formatter.format(accepted));
        if (prescriptions.length != 0){
            System.out.println("Patient prescriptions :");
            for (int i = 0; i < prescriptions.length; i++) {
                System.out.println((i + 1) + ". " + prescriptions[i]);
            }
        }
        if (allergies.length != 0) {
            System.out.println("Patient allergies :");
            for (int i = 0; i < allergies.length; i++) {
                System.out.println((i + 1) + ". " + allergies[i]);
            }
        }
        if (specialRegs.length != 0) {
            System.out.println("Patient specialRegs :");
            for (int i = 0; i < specialRegs.length; i++) {
                System.out.println((i + 1) + ". " + specialRegs[i]);
            }
        }
        if (!OperationStaffList.isEmpty()){
            System.out.println("Operational Staff: ");
            for (int i = 0; i < OperationStaffList.size(); i++) {
                System.out.println((i+1) + ". " + OperationStaffList.get(i).name);
            }
        }
    }
}