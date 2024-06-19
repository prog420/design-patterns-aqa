package patterns.creational.prototype.npc;

public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "moraleBoost";
    }

    @Override
    public String toString() {
        return "General %s @ (%s, %s)".formatted(state, getLocation().getX(), getLocation().getY());
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset is not supported");
    }
}
