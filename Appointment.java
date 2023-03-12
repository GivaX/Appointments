
public class Appointment
{
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Service service;
    
    public Appointment(int id, Doctor doctor, Patient patient, Service service)
    {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.service = service;
    }
    
    public void show()
    {
        System.out.println(toString());
    }
    
    public String toString()
    {
        return id + " " + doctor.toString() + " " + patient.toString() + " " + service.toString();
    }
}
