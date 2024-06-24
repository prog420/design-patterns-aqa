package patterns.creational.prototype.v1.npc;

public class Swordsman extends GameUnit {
    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman %s @ (%s, %s)".formatted(state, getLocation().getX(), getLocation().getY());
    }

    @Override
    public void reset() {
        state = "idle";
        super.reset();
    }
}
