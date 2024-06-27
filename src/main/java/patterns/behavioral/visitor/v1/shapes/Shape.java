package patterns.behavioral.visitor.v1.shapes;

import patterns.behavioral.visitor.v1.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
