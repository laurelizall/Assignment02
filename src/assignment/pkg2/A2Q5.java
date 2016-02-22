/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author halll7908
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City town = new City();
    Robot example = new Robot(town, 0, 2, Direction.SOUTH);
    Robot tina = new Robot(town, 0, 2, Direction.SOUTH);
    tina.setColor(Color.cyan);
    example.setColor(Color.orange);
    
    new Wall(town, 0, 0, Direction.WEST);
    new Wall(town, 1, 0, Direction.WEST);
    new Wall(town, 2, 0, Direction.WEST);
    new Wall(town, 3, 0, Direction.WEST);
    new Wall(town, 4, 0, Direction.WEST);
    new Wall(town, 5, 0, Direction.WEST);
    new Wall(town, 6, 0, Direction.WEST);
    new Wall(town, 7, 0, Direction.WEST);
    new Wall(town, 8, 0, Direction.WEST);
    new Wall(town, 9, 0, Direction.WEST); // (_,0)
    new Wall(town, 0, 1, Direction.EAST);
    new Wall(town, 1, 1, Direction.EAST);
    new Wall(town, 2, 1, Direction.EAST);
    new Wall(town, 3, 1, Direction.EAST);
    new Wall(town, 4, 1, Direction.EAST);
    new Wall(town, 5, 1, Direction.EAST);
    new Wall(town, 6, 1, Direction.EAST);
    new Wall(town, 7, 1, Direction.EAST);
    new Wall(town, 8, 1, Direction.EAST);
    new Wall(town, 9, 1, Direction.EAST); // (_,1)
    new Wall(town, 0, 2, Direction.EAST);
    new Wall(town, 3, 2, Direction.EAST); 
    new Wall(town, 3, 2, Direction.EAST);
    new Wall(town, 5, 2, Direction.EAST);
    new Wall(town, 6, 2, Direction.EAST);
    new Wall(town, 9, 2, Direction.SOUTH);
    new Wall(town, 9, 2, Direction.EAST); // (_,2)
    new Wall(town, 1, 3, Direction.NORTH);
    new Wall(town, 2, 3, Direction.SOUTH);
    new Wall(town, 4, 3, Direction.NORTH); 
    new Wall(town, 4, 3, Direction.SOUTH);
    new Wall(town, 7, 3, Direction.NORTH);
    new Wall(town, 8, 3, Direction.SOUTH); // (_,3)
    new Wall(town, 1, 4, Direction.NORTH); 
    new Wall(town, 2, 4, Direction.SOUTH);
    new Wall(town, 4, 4, Direction.NORTH); 
    new Wall(town, 4, 4, Direction.SOUTH);
    new Wall(town, 7, 4, Direction.NORTH);
    new Wall(town, 8, 4, Direction.SOUTH); // (_,4)
    new Wall(town, 1, 5, Direction.NORTH);
    new Wall(town, 2, 5, Direction.SOUTH);
    new Wall(town, 4, 5, Direction.NORTH);
    new Wall(town, 4, 5, Direction.SOUTH);
    new Wall(town, 4, 5, Direction.EAST);
    new Wall(town, 7, 5, Direction.NORTH);
    new Wall(town, 8, 5, Direction.SOUTH); // (_,5)
    new Wall(town, 1, 6, Direction.NORTH); 
    new Wall(town, 1, 6, Direction.EAST);
    new Wall(town, 2, 6, Direction.SOUTH);
    new Wall(town, 2, 6, Direction.EAST); 
    new Wall(town, 7, 6, Direction.NORTH);
    new Wall(town, 8, 6, Direction.SOUTH); // (_,6)
    new Wall(town, 7, 7, Direction.EAST);
    new Wall(town, 7, 7, Direction.NORTH); 
    new Wall(town, 8, 7, Direction.EAST);
    new Wall(town, 8, 7, Direction.SOUTH); // (_,7)
    new Thing(town, 1, 2);
    new Thing(town, 2, 2);
    new Thing(town, 4, 2);
    new Thing(town, 7, 2);
    new Thing(town, 1, 3);
    new Thing(town, 4, 3);
    new Thing(town, 7, 3);
    new Thing(town, 8, 3);
    new Thing(town, 1, 4);
    new Thing(town, 2, 4);
    new Thing(town, 4, 4);
    new Thing(town, 8, 4);
    new Thing(town, 1, 5);
    new Thing(town, 8, 6);
    new Thing(town, 7, 7);
       
    // example    
    example.move();
    example.pickThing();
    example.turnLeft();
    example.move();
    example.pickThing();
    
    while(example.frontIsClear())
    {   example.move();
        if(example.getAvenue()==2)
        {   if(example.getStreet()==2)
             { break;
             }
        }
        if(example.canPickThing())
        {   example.pickThing(); }
            while(!example.frontIsClear())
            {   example.turnLeft();
                example.turnLeft();
                example.turnLeft();
                    if(example.getAvenue()==2)
                    {   if(example.getStreet()==2)
                        { break;
                        }
                    }
            }
    }
    
    example.turnLeft();
    example.move();
    example.move();
    example.turnLeft();
    example.move();
    
    while(example.frontIsClear())
    {   example.move();
        if(example.getAvenue()==2)
        {   if(example.getStreet()==4)
             { break;
             }
        }
        if(example.canPickThing())
        {   example.pickThing(); }
            while(!example.frontIsClear())
            {   example.turnLeft();
                example.turnLeft();
                    if(example.getAvenue()==2)
                    {   if(example.getStreet()==4)
                        { break;
                        }
                    }
            }
    }
    example.pickThing();
    example.putThing();
    example.turnLeft();
    example.move();
    example.move();
    example.move();
    example.turnLeft();
    example.pickThing();
    
    while(example.frontIsClear())
    {   example.move();
        if(example.getAvenue()==2)
        {   if(example.getStreet()==8)
             { break;
             }
        }
        if(example.canPickThing())
        {   example.pickThing(); }
            while(!example.frontIsClear())
            {   example.turnLeft();
                example.turnLeft();
                example.turnLeft();
                    if(example.getAvenue()==2)
                    {   if(example.getStreet()==8)
                        { break;
                        }
                    }
            }
    }
    
    example.turnLeft();
    example.putThing();
    example.move();
    
    // tina
    while(tina.frontIsClear())
    {   tina.move();    
    if(tina.canPickThing())
    { tina.pickThing(); }
    }
}
}
