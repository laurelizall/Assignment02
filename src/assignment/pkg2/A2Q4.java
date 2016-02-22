/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author halll7908
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City town = new City();
    Robot sam = new Robot(town, 2, 0, Direction.NORTH);
    
      new Wall(town, 1, 1, Direction.NORTH);
      new Wall(town, 1, 1, Direction.SOUTH);
      new Wall(town, 1, 1, Direction.WEST);
      new Wall(town, 1, 1, Direction.EAST); // top left square
      new Wall(town, 1, 4, Direction.NORTH);
      new Wall(town, 1, 4, Direction.SOUTH);
      new Wall(town, 1, 4, Direction.WEST);
      new Wall(town, 1, 4, Direction.EAST); // top right square
      new Wall(town, 4, 1, Direction.NORTH);
      new Wall(town, 4, 1, Direction.SOUTH);
      new Wall(town, 4, 1, Direction.WEST);
      new Wall(town, 4, 1, Direction.EAST); // bottom left square
      new Wall(town, 4, 4, Direction.NORTH);
      new Wall(town, 4, 4, Direction.SOUTH);
      new Wall(town, 4, 4, Direction.WEST);
      new Wall(town, 4, 4, Direction.EAST); // bottom right square
      new Wall(town, 2, 2, Direction.NORTH);
      new Wall(town, 2, 2, Direction.WEST);
      new Wall(town, 3, 2, Direction.WEST);
      new Wall(town, 2, 3, Direction.NORTH);
      new Wall(town, 2, 3, Direction.EAST);
      new Wall(town, 3, 2, Direction.SOUTH);
      new Wall(town, 3, 3, Direction.SOUTH);
      new Wall(town, 3, 3, Direction.EAST); // large square
      
      while(true)
      {
      sam.move();
      sam.move();
      sam.turnLeft();
      sam.turnLeft();
      sam.turnLeft();
      sam.move();
      sam.move();
      sam.turnLeft();
      sam.turnLeft();
      sam.turnLeft();
      sam.move();
      sam.turnLeft();
      sam.move();
      sam.turnLeft();
      sam.move();
      sam.turnLeft();
      sam.turnLeft();
      sam.turnLeft();
       }
    }
}
