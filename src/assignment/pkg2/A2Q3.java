/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author halll7908
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City town = new City();
    Robot sam = new Robot(town, 5, 5, Direction.EAST);
    
     while(sam.getDirection()!= Direction.WEST)
     {     sam.turnLeft();}
         while(sam.getAvenue()>0)
         {  
              sam.move();
         if(sam.getAvenue()==0)
            {            break;}
         }
         
     while(sam.getDirection()!= Direction.NORTH)
     {     sam.turnLeft();}
        while(sam.getStreet()>0)
         {  
              sam.move();
         if(sam.getStreet()==0)
            {            break;}
         }
}
}