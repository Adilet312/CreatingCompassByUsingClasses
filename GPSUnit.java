import java.util.*;
/**
 * A GPSUnit object knows its location and its heading,so it 
 * calculates movement along th x and y coordinates and update
 * degree from old data to new one.
 * @author Adilet Momunaliev
 */
public class GPSUnit
{
    private CompassHeading direction; //coordinates direction
    private CSC142Point location;     // and location
    /**
     * Create a GPSUnit defined  by two  given data such as 
     * location and direction
     * @param direction the CompassHeading and
     * location CSC142Point
     * @throws throw a NullPointerException if either 
     * parameter is null
     */
    public GPSUnit(CompassHeading direction, CSC142Point location)
    {
        if(direction == null || location==null)
        {
            throw new NullPointerException();
        }
        else
        {
            this.direction = direction;
            this.location = location;
            
        }
    }
    /**
     *  Calculate delta_x and delta_y coordintes based on given
     *  units and angle to set x and y points
     *  @param units is magnitude of x and y coordinates 
     *  @throw if units<0 , throw an IllegalArgumentEXception 
     */
     
    
    public void  move (double units )
    {
        if (units<0)
        {
            throw new IllegalArgumentException();
            
        }
        else
        {
            
            double angle = Math.toRadians(direction.getHeading());
            double delta_x = units * Math.sin(angle);
            double delta_y = units * Math.cos(angle);
            location.setPoint(location.getX()+delta_x,location.getY()+delta_y);
            
            
        }
    }
    /**
     * Change direction from old degree to new given data by
     * updating
     * @param degree is new given degree to update
     * @throw if degree is out of [-180 && 180], 
     * throw IllegalArgumentException
     */ 
    
    public void turn (int degree)
    {
        int updateDegree=0;
        if (degree<-180 || degree>180)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            updateDegree = direction.getHeading() + degree;
            if (updateDegree<0)
            {
                updateDegree += 360;
                
            }
            
            else if (updateDegree>360) 
            {
                updateDegree -= 360;
            }
        }
        direction.setHeading(updateDegree);
        
        
    }
    /**
     * Get the CompassHeading direction
     * @return direction of the CompassHeading
     */
    public CompassHeading getHeading()
    {
        return direction;
    }
    
    /**
     *  Get location of this CSC142Point
     *  @return location of the CSC142Point
     */
     public CSC142Point getLocation()
    {
        return location;
    }
    
    /**
     *  The string version of this GPSUnit
     *  @return string representation
     */
     public String toString()
    {
        String st = " ";
        
        st=direction+""+location;
        return st;
        
    }
    
    /*
     * Test 1:Turn method;
     * Starting direction:350 degree;
     * Turn amount: 50 degree;
     * Expected result: 40 degree;
     * Actual result: 40 degree;
     * +-----------------------+
     * Test 2: move method;
     * Starting coordinates (6,8);
     * Move by 2;
     * Expected result (8,8) when direction 90 degree;
     * Actual result (8,8) when direction 90 degree;
     * +---------------------------------------------+
     * Extra Credit:
     * Documented test cases are for the supplier since 
     * we are checking how properly our supplier code work.
     */
}
