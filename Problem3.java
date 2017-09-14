 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem1
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        turnLeft();
        while(!frontIsClear()) {
            checkWalls();
        }
    }
    
    public void checkWalls()  {
        if (frontIsClear()) {
            putBeeper();
            nextWall();
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

