package lab7;
class Hospital{
    Patient[] patient;
}

class Patient{
    int patientId;
    String name;
    static int  cnt=1;
    
    Patient(String name){
        this.name=name;
        patientId=cnt++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPatientId(){
        return patientId;
    }
    
    @Override
    public String toString(){
        return "name: "+name+"; id: "+patientId;
    }
}

public class Lab7 {

    
    public static void main(String[] args) {

        Patient[] patients = new Patient[]{
            new Patient("Tadic"),
            new Patient("Dzeko"),
            new Patient("Fred"),
            new Patient("Ferdi")
        };
       Hospital hospital=new Hospital();
       hospital.patient=patients;
       
       for(Patient patient : hospital.patient){
        System.out.printf("Name: %-7s  ID: %d%n", patient.getName(), patient.getPatientId());
       }
        
    }
    
}
