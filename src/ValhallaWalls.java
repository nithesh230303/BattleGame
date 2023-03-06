public class ValhallaWalls {
    private WallStat east = new WallStat(WallDirection.E);
    private WallStat west = new WallStat(WallDirection.W);
    private WallStat north = new WallStat(WallDirection.N);
    private WallStat south = new WallStat(WallDirection.S);

    public WallStat getEast() {
        return east;
    }

    public void setEast(WallStat east) {
        this.east = east;
    }

    public WallStat getWest() {
        return west;
    }

    public void setWest(WallStat west) {
        this.west = west;
    }

    public WallStat getNorth() {
        return north;
    }

    public void setNorth(WallStat north) {
        this.north = north;
    }

    public WallStat getSouth() {
        return south;
    }

    public void setSouth(WallStat south) {
        this.south = south;
    }
}
