import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

// This painter paints the background 
    backgroundPainter gabe = new backgroundPainter();
    gabe.paintBackground("black", 16);
// This Painter panints the actual desing 
    PacmanPainter coop = new PacmanPainter();
    coop.drawPacman();
  }
}