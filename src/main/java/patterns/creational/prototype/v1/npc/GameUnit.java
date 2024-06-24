package patterns.creational.prototype.v1.npc;

import patterns.creational.prototype.v1.geometry.Point2D;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
    private Point2D location;

    public GameUnit() {
        initialize();
    }

    /** Initalize required properties and reset them if needed */
    public void initialize() {
        location = new Point2D();
        reset();
    }

    public void reset() {
        location.setLocation(0, 0);
    };

    public void setLocation(double x, double y) {
        location.setLocation(x, y);
    }

    public Point2D getLocation() {
        return location;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }
}
