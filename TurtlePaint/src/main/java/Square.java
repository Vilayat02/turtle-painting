import java.awt.*;


public class Square extends Shape{
    private int size;

    public Square(Turtle turtle, Point location, Color color, int border, int size) {
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

        for (int i = 0; i < 4; i++) {
            turtle.forward(size);
            turtle.turnRight(90);
        }

        turtle.penUp();
    }

}
