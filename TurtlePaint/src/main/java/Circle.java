import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Turtle turtle, Point location, Color color, int border, int radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location.x, location.y);
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.penDown();

        int sides = 36;
        double angle = 360.0 / sides;
        double length = 2 * Math.PI * radius / sides;

        for (int i = 0; i < sides; i++) {
            turtle.forward(length);
            turtle.turnRight(angle);
        }

    }
}
