
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        turnAround();
        while(!nextToABeeper() && !frontIsClear()) {
            placeBeepers();
        }
    }
    
    public void uTurn()  {
        move();
        turnRight();
        move();
        turnRight();
    }
    
    public void placeBeepers()  {
        checkWalls();
    }
    
    public void turnAround()  {
        turnLeft();
        turnLeft();
    }
    
    public void checkWalls()  {
        if (frontIsClear()) {
            uTurn();
            nextWall();
        }
        else {
            nextWall();
        }
    }
    
    public void nextWall()  {
        turnLeft();
        putBeeper();
        if (frontIsClear()&&!nextToABeeper()) {
            move();
            turnRight();
            checkWalls();
        }
        else {
            nextWall();
        }
        
    }
}

