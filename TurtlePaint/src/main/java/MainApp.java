import java.awt.*;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
     /*   // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);*/
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world);
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.println("1.Add Shape\n2.Save Image\n3.Exit");
            int choice = sc.nextInt();
            //sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("1.Square  2.Triangle  3.Circle  4.Back");
                    int shape = sc.nextInt();
                    sc.nextLine();
                    switch (shape){
                        case 1:
                            System.out.print("X: ");
                            int x = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Y: ");
                            int y = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Border: ");
                            int border = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Size: ");
                            int size = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Color (RGB ex 11 22 33): ");
                            int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
                            Color color = new Color(r,g,b);
                            Shape square = new Square(turtle, new Point(x, y), color, border, size);
                            square.paint();
                            break;
                        case 2:
                            System.out.print("X: ");
                            int x1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Y: ");
                            int y1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Border: "); //Line border (Bald lvl)
                            int border1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Size: ");
                            int size1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Color (RGB ex 11 22 33): ");
                            int r1 = sc.nextInt(), g1 = sc.nextInt(), b1 = sc.nextInt();
                            Color color1 = new Color(r1,g1,b1);
                            Shape triangle = new Triangle(turtle, new Point(x1, y1), color1, border1, size1);
                            triangle.paint();
                            break;
                        case 3:
                            System.out.print("X: ");
                            int x2 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Y: ");
                            int y2 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Border: ");
                            int border2 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Size: ");
                            int size2 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Color (RGB ex 11 22 33): ");
                            int r2 = sc.nextInt(), g2 = sc.nextInt(), b2 = sc.nextInt();
                            Color color2 = new Color(r2,g2,b2);
                            Shape circle = new Circle(turtle, new Point(x2, y2), color2, border2, size2);
                            circle.paint();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    world.saveAs("canvas.png");
                    System.out.println("Image saved as canvas.png");
                    break;
                case 3:
                    run = false;
                    System.exit(0);
                    break;
            }
        }
    }
}
