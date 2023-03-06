public class AttackedWall {
    private int direction;
    private int strength;
    public AttackedWall(WallDirection direction, int strength) {
        this.direction = direction;
        this.strength = strength;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
