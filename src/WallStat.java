public class WallStat {
    private WallDirection direction;
    private int strength=0;
    private int successfulAttack=0;
    private int minWallStrength=0;
    public WallStat(WallDirection direction){
        this.direction = direction;
    }

    public void WallRepair(){
        this.strength= this.minWallStrength;
    }

    public WallDirection getDirection(){
        return direction;
    }

    public void setDirection(WallDirection direction){
        this.direction=direction;
    }

    public int getSuccessfulAttack(){
        return successfulAttack;
    }

    public void setSuccessfulAttack(int successfulAttack){
        this.successfulAttack = successfulAttack;
    }

    public boolean AttackOnWall(int strength){
        if(this.strength>strength){
            this.minWallStrength = strength;
            successfulAttack++;
            return true;
        }
        return false;
    }

}
