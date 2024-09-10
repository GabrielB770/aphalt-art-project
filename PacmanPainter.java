import org.code.neighborhood.*;

public class PacmanPainter extends PainterPlus{
/*
* Combines all methods to create Pacman
*/ 
  public void drawPacman(){
    drawBody();
    drawEyes();
  }

/*
* Draws the Red Body part of the Pacman
*/
  public void drawBody(){
    turnRight();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    paintLine("red", 4);
    move();
    turnRight();
    move();
    turnRight();
    paintLine("red", 8);
    turnLeft();
    move();
    turnLeft();
    paintLine("red", 10);
    turnRight();
    move();
    turnRight();
    paintLine("red", 12);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("red", 12);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("red", 12);
    turnLeft();
    move();
    turnLeft();
    paintLine("red", 14);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("red", 14);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("red", 14);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("red", 14);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("red", 14);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("red", 14);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("red", 2);
    move();
    paintLine("red", 4);
    move();
    paintLine("red", 1);
    paintLine("red", 1);
    paintLine("red", 1);
    move();
    paintLine("red", 2);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("red", 1);
    move();
    move();
    move();
    paintLine("red", 2);
    move();
    move();
    paintLine("red", 2);
    move();
    move();
    move();
    paintLine("red", 1);
  }
/*
* Draws Eyes and Pupils of the Pacman
*/ 
  public void drawEyes(){
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    paintLine("white", 2);
    move();
    move();
    move();
    move();
    paintLine("white", 2);
    turnRight();
    move();
    turnRight();
    paintLine("white", 4);
    move();
    move();
    paintLine("white", 4);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("white", 4);
    move();
    move();
    paintLine("white", 4);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("white", 4);
    move();
    move();
    paintLine("white", 4);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("white", 2);
    move();
    move();
    move();
    move();
    paintLine("white", 2);
    turnLeft();
    move();
    paintLine("blue", 2);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("blue", 2);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    createDotEyes();
  }
}