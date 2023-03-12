
public class Patient extends Record
{
    public Patient(int id, String name)
    {
        //inherits from the parent Record class constructor. 
        super(id,name);
    }
    
    //accessors
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        //inherits the parent class's toString() method
        return "Patient: " + super.toString();
    }
}
