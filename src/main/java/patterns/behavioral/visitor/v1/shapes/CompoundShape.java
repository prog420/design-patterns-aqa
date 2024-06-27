package patterns.behavioral.visitor.v1.shapes;

import patterns.behavioral.visitor.v1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Compound Shape");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Compound Shape");
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
