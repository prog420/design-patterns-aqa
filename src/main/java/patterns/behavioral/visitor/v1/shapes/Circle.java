package patterns.behavioral.visitor.v1.shapes;

import patterns.behavioral.visitor.v1.visitor.Visitor;

public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
