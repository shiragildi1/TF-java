

/**
 * Write a description of class Events here.
 *
 * @author (your eventType)
 * @version (a version number or a date)
 */
public class Events
{
    // instance variables - replace the example below with your own
    private String eventType;
    

    /**
     * Default constructor for objects of class Events
     * constructs eventType to "Shacharit"
     */
    public Events(String e)
    {
        // initialise instance variables
        this.eventType=e;
    }
    
    
    
    public Events(Events e)
    {
        this.eventType=e.eventType;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getEvent()
    {
        return eventType;
    }
    
    public void setEvent(String type)
    {
        
            eventType=type;
        
    }
}
