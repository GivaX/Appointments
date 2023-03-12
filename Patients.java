public class Patients extends Records
{
    public Patients()
    {
        
    }
    
    public void add()
    {
        //creates a Patient object
        //prompts user to enter Patient name.
        //uses parent class's readString() method.
        Patient patient = new Patient(++id, readString("Please enter patient name"));
        //adds the patient object to the collection
        add(patient);
    }
    
    public Patient find(int id)
    {
        //uses parent Records class's find(id) method 
        //casts the returned Record object to the Patient type 
        //Returns the Patient object.
        return (Patient) super.find(id);
    }
}