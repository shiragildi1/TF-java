
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.String;
public class Driver
{
    
    
    public static void main(String[]args)
    {
        
        Scanner scan = new Scanner(System.in);
        boolean flag=false;
        Shul [] shuls=new Shul[1000];
        int numOfShuls=0;       
        //הוספת בתי כנסת
        
        shuls[0]=new Shul("זופניק","מלכי ישראל",7,"אשכנז");
        numOfShuls++;
        shuls[0].addEvent("שחרית");
        shuls[0].addEvent("מנחה");
        shuls[0].addEvent("ערבית");
        shuls[1]=new Shul("זכרון משה","מלכי ישראל",17,"ספרד");
        numOfShuls++;
        shuls[1].addEvent("שחרית");
        shuls[1].addEvent("מנחה");
        shuls[2]=new Shul("שמש צדקה","חגי",6,"ספרד");
        numOfShuls++;
        shuls[2].addEvent("מנחה");
        shuls[2].addEvent("ערבית");
        shuls[3]=new Shul("היכל יוסף","עמוס",13,"עדות המזרח");
        numOfShuls++;
        shuls[3].addEvent("שחרית");
        shuls[3].addEvent("מנחה");
        shuls[3].addEvent("ערבית");
        shuls[4]=new Shul("היכל יוסף","עמוס",13,"אשכנז");
        numOfShuls++;
        shuls[4].addEvent("שחרית");
        shuls[4].addEvent("מנחה");
        shuls[4].addEvent("ערבית");
        System.out.println("הקש תפילה: שחרית מנחה או ערבית");
        String yourEvent = scan.next();
        System.out.println("הקש נוסח: ספרד, אשכנז או עדות המזרח");
        String yourNusach = scan.next();
        System.out.println("האם תרצה להתפלל מול העמוד? הקש כן או לא");
        String amud=scan.next();
        
        for(int i=0;i<numOfShuls;i++)
        {
            if(shuls[i].getNusach().equals(yourNusach) && shuls[i].searchEvent(yourEvent)==true) 
                {
                    System.out.println(shuls[i]);
                    flag=true;
                }
        }
        if(!flag)
            System.out.println("מצטערים, לא מצאנו אף מניין המתאים לך");
        
        
        
    }
}
