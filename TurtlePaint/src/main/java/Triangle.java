import java.awt.*;

public class Triangle extends Shape{
    private int size;

    public Triangle(Turtle turtle, Point location, Color color, int border, int size) {
        super(turtle, location, color, border);
        this.size = size;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location.x, location.y);
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.penDown();

        for (int i = 0; i < 3; i++) {
            turtle.forward(size);
            turtle.turnRight(120);
        }

        turtle.penUp();
    }

}
