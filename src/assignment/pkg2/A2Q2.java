/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author halll7908
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City town = new City();
    Robot sam = new Robot(town, 1, 0, Direction.EAST);
    
    new Wall(town, 1, 0,Direction.SOUTH);
    new Wall(town, 1, 0,Direction.EAST);
    new Wall(town, 1, 1,Direction.SOUTH);
    new Wall(town, 1, 2,Direction.EAST);
    new Wall(town, 1, 2,Direction.SOUTH);
    new Wall(town, 1, 3,Direction.SOUTH);
    new Wall(town, 1, 4,Direction.SOUTH);
    new Wall(town, 1, 4,Direction.EAST);
    new Wall(town, 1, 5,Direction.SOUTH);
    new Wall(town, 1, 6,Direction.SOUTH);
    new Wall(town, 1, 7,Direction.SOUTH);
    new Wall(town, 1, 7,Direction.EAST);
    new Wall(town, 1, 8,Direction.SOUTH);
    new Wall(town, 1, 9,Direction.SOUTH);
    new Thing(town, 1, 9);
    
    while(true){
    if(sam.frontIsClear())
        {
        sam.move();
        }
        if(!sam.frontIsClear())
            {
            sam.turnLeft();
            sam.move();
            sam.turnLeft();
            sam.turnLeft();
            sam.turnLeft();
            sam.move();
            sam.turnLeft();
            sam.turnLeft();
            sam.turnLeft();
            sam.move();
            sam.turnLeft();
            }
        else if(sam.canPickThing()){
            {
            break;
            }
        }
    }
    }
}
