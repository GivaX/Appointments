
public class Doctor extends Record
{
    public Doctor(int id, String name)
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
        return "Doctor: " + super.toString();
    }

}
