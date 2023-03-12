
public class Doctors extends Records
{
    public Doctors()
    {
        
    }
    
    public void add()
    {
        //creates a Doctor object
        //prompts user to enter Doctor name.
        //uses parent class's readString() method.
        Doctor doc = new Doctor(++id, readString("Please enter doctor name"));
        //adds the doctor object to the collection using the add() method in parent class
        add(doc);
    }
    
    public Doctor find(int id)
    {
        //uses parent Records class's find(id) method 
        //casts the returned Record object to the Doctor type 
        //Returns the Doctor object.
        return (Doctor) super.find(id);
    }
}
