import java.awt.*;

public class Hexagon extends Shape{
    private int sideLength;

    public Hexagon(Turtle turtle, Point location, Color color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location.x, location.y);
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.penDown();

        for (int i = 0; i < 6; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(60); // В правильном шестиугольнике внутренний угол 120°, значит поворот — 60°
        }

        turtle.penUp();
    }

}
