
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        while(!frontIsClear()) {
            checkWalls();
        }
    }
    
    
    public void turnRight()  {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void findWall()  {
        while(frontIsClear()) {
            move();
        }
    }

   
    public void checkWalls()  {
        if (frontIsClear()) {
            move();
            move();
            turnOff();
        }
        else {
            nextWall();
        }
    }
    
    public void nextWall()  {
        turnLeft();
        if (frontIsClear()){
            move();
            turnRight();
            checkWalls();
        }
        else {
            nextWall();
        }
        
    }
    
}

