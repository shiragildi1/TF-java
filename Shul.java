
/**
 * Write a description of class Nusach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shul
{
    private String nameShul;
    private String street;
    private int numStreet;
    private String nusach;
    private Events[] events=new Events[3];
    private int numOfEvents=0;
   
    
    public Shul()
    {
    }
    
    public Shul(String nameShul,String street,int numStreet,String nusach)
    {
        this.nameShul=nameShul;
        this.street=street;
        this.numStreet=numStreet;
        this.nusach=nusach;        
    }
    
    public void addEvent(String e)
    { 
        events[numOfEvents]=new Events(e);
        numOfEvents++;
    }
    
    public boolean searchEvent(String nameE)
    {
        for(int i=0;i<numOfEvents;i++)
        {
            if(events[i].getEvent().equals(nameE))
                return true;
            
        }
        return false;
    }
    public String getNameShul()
    {
        return this.nameShul;
    }
    
    public String getStreet()
    {
        return this.street;
    }
    
    public int getNumStreet()
    {
        return this.numStreet;
    }
    
    public String getNusach()
    {
        return this.nusach;
    }
    public void setNameShul(String nameNusach)
    {
        this.nameShul=nameShul;
    }
    
    public void setStreet(String street)
    {
        this.street=street;
    }
    
    public void setNumStreet(int numStreet)
    {
        this.numStreet=numStreet;
    }
    
    public void setNusach(String nusach)
    {
        this.nusach=nusach;
    }
    
    public String toString()
    {
        return ("שם: " + this.nameShul+"\n"+"כתובת: "+this.street+"  "+this.numStreet);
        
    }
}
