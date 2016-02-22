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
public class A2Q1 {
    private static boolean frontIsClear;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City town = new City();
    Robot sam = new Robot(town, 1, 1, Direction.EAST);
    new Thing(town, 1, 2);
    new Thing(town, 1, 3);
    new Thing(town, 1, 4);
    new Thing(town, 1, 5);
    new Thing(town, 1, 6);
    new Thing(town, 1, 7);
    new Thing(town, 1, 8);
    new Thing(town, 1, 9);
    new Thing(town, 1, 10);
    new Thing(town, 1, 11);
    
    while(sam.frontIsClear()){ 
        sam.move();
        sam.pickThing();
        if(sam.countThingsInBackpack()==7){
            break;
        }       
        }
    sam.move();
    sam.move();
    sam.move();
    sam.move();
    }
}