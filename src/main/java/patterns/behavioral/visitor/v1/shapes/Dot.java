package patterns.behavioral.visitor.v1.shapes;

import patterns.behavioral.visitor.v1.visitor.Visitor;

public class Dot implements Shape {
    private int id;
    private int x;
    private int y;

    public Dot() {}

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Dot");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dot");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}
