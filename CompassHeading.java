/** A CompassHeading class is designed to set initial degree,
 * check it is range between [0 ,360), and get bearing within 
 * quadrant.
 * @author Adilet Momunaliev
 *  
 */
public class CompassHeading
{
    private int heading; //direction degree
    /**
     * This is constructor CompassHeading with a specified
     * initialDegree.
     * @param initialDegree that make of the CompassHeading to be
     * constructed.
     * @throws Exception if initialDegree is out of range 
     * between 0 and 360.
     */
    
    public CompassHeading(int initialDegree) // constructor 
    {
        if (initialDegree<0 || initialDegree>=360)
        {
            throw new IllegalArgumentException();
        }
        this.heading = initialDegree;
    }
    
    
    /**
      * Get the initialDegree of this CompassHeading.
      * @return initialDegree
      */
    public int getHeading()// accessor method
    {
        
        return heading;
    }
    
    
    /**
     *  Set the degree of the CompassHeading.
     *  @param update to check condition for the range.
     *  @throws Exception if after updating degree is out of
     *  range.
     */
    public void setHeading (int update)//update (mutator) method
    {
        if (update<0 || update>=360)
        {
            throw new IllegalArgumentException();
            
        }
        else
        {
            this.heading=update;
        }
        
    }
    
    
    /**
     * Get the value of Degree and check it by condition
     * @return value of Degree based on condition.
     */
    public String getBearing()// update(mutator) method
    {
        char Symbol=176;
        String str=" ";
        if(heading==0)
        {
            str = "North("+heading+Symbol+")";
            return (str);
        }
        else if (heading==90)
        {
            str = "East("+heading+Symbol+")"; 
            return (str);
        }
        
        else if( heading > 90 && heading < 180)
        {
            heading = (180 - heading);
            str = "S"+heading+Symbol+"E";
            return (str);
        }
        else if (heading==180)
        {
            str = "South("+heading+Symbol+")";
            return (str);
        }
        else if (heading>180 && heading<270)
        {
           heading = 270 - heading ;
           str = "S"+heading+Symbol+"W";
           return (str);
        }
        else if (heading==270)
        {
            str = "West("+heading+Symbol+")";
            return (str);
        }
        else if (heading > 270 && heading < 360)
        {
            heading = 360 - heading;
            str = "N"+heading+Symbol+"W";
            return (str);
            
        }
        else
        {
            str = "North("+heading+Symbol+")";
            return (str);
        }
        
    }
    
    
    /**
     * The string version of this CompassHeading
     * @return the String representation
     */
    public String toString()
    {
        char Symbol=176;
        String str = " ";
        str=str+heading+Symbol;
        return str;
    }
    
    /*
     * Test getBearing;
     * Expected result:getBearing() is S80W when initial
     * degree is 190.
     * Actual result: S80W when initial degree 190 such that:
     * CompassHeading test = new CompassHeading(190);
     * System.out,println(test.getBearing());
     *   
     */
}
