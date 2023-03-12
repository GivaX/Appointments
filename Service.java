
public class Service extends Record
{
    private int cost;
    public Service(int id, String name, int cost)
    {
        //inherits from the parent Record class constructor. 
        super(id,name);
        this.cost = cost; //assigns the cost to the object's cost attribute
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
    
    public int getCost()
    {
        return cost;
    }
    
    public String toString()
    {
        //inherits the parent class's toString() method and returns the cost
        return "Service: " + super.toString() + " Cost: $" + cost;
    }
}
