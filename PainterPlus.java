import org.code.neighborhood.*;

public class PainterPlus extends Painter{
  

/*
* This method helps contribute to the overall project since it is a method that paints blue eyes
*/ 
  public void createDotEyes(){
    paintLine("blue", 2);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("blue", 2);
    turnRight();
    moveFast();
    turnRight();
    moveFast();
    turnLeft(); 
  }
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
    
  }

  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
    
  }
  public void moveFast(){
    while(canMove()){
      move();
    }
  }
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
  }
  public void paintDonut(String color){
    while(hasPaint()){
      turnRight();
      paint(color);
      move();
      paint(color);
      move();
    }
  }
   public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }
}