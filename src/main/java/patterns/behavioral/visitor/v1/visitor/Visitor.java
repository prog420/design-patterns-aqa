package patterns.behavioral.visitor.v1.visitor;

import patterns.behavioral.visitor.v1.shapes.Circle;
import patterns.behavioral.visitor.v1.shapes.CompoundShape;
import patterns.behavioral.visitor.v1.shapes.Dot;
import patterns.behavioral.visitor.v1.shapes.Rectangle;

public interface Visitor {
    String visit(Dot dot);
    String visit(Circle circle);
    String visit(Rectangle rectangle);
    String visit(CompoundShape compoundShape);
}
