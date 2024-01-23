package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        // draw a rectangle
        // Rectangle rectangle = new Rectangle(2, 3);
        Shape rectangle = new Rectangle(2, 3);
        Renderer renderer = new Renderer(rectangle);

        // draw a circle
        Shape circle = new Circle(4);
        Renderer renderer2 = new Renderer(circle);

        renderer.draw();
        renderer2.draw();
    }
}
