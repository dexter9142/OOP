package lab6;

import java.util.ArrayList;

public class Operation_Staff extends Staff{

    ArrayList<Patient> PatientList = new ArrayList<>();
    public void addDepartment(Patient newPatient){
        PatientList.add(newPatient);
    }

    @Override
    public void DisplayData() {
        super.DisplayData();
        if (!PatientList.isEmpty()){
            System.out.println("Patients List: ");
            for (int i = 0; i < PatientList.size(); i++) {
                System.out.println((i+1) + ". " + PatientList.get(i).name);
            }
        }
    }
}
