public class Services extends Records
{
    public Services()
    {
        
    }
    
    public void add()
    {
        //creates a Service object
        //prompts user to enter name and price of the Service.
        //uses parent class's readString() and readInt() method.
        Service service = new Service(++id, readString("Please enter service name"), readInt("Please enter service price"));
        //adds the patient object to the collection
        add(service);
    }
    
    public Service find(int id)
    {
        //uses parent Records class's find(id) method 
        //casts the returned Record object to the Service type 
        //Returns the Service object.
        return (Service) super.find(id);
    }
}