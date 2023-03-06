import java.util.List;

public class BattleTime {
    public boolean setUp(String line){
        String[] attacksOnEachDay = line.split(";");
        private List<EndOfDay> endOfDays;
    }
    public int BattleStat() {
        ValhallaWalls walls = new ValhallaWalls();
        int successfulAttacks = 0;
        List<AttackedWall> attackedWalls;
        if (endOfDays.size() > 0) {
            for (EndOfDay day : endOfDays) {
                attacks = day.getAttacks();
                for (AttackedWall wall : attackedWalls) {
                    switch (wall.getDirection()) {
                        case E:
                            walls.getEast().AttackOnWall(wall.getStrength());
                            break;
                        case W:
                            walls.getWest().AttackOnWall(wall.getStrength());
                            break;
                        case N:
                            walls.getNorth().AttackOnWall(wall.getStrength());
                            break;
                        case S:
                            walls.getSouth().AttackOnWall(wall.getStrength());
                            break;
                    }
                }
                walls.getEast().WallRepair();
                walls.getWest().WallRepair();
                walls.getNorth().WallRepair();
                walls.getSouth().WallRepair();
            }
        }
        successfulAttacks = walls.getNorth().getSuccessfulAttack() + walls.getEast().getSuccessfulAttack()
                + walls.getWest().getSuccessfulAttack() + walls.getSouth().getSuccessfulAttack();
        return successfulAttacks;
    }
}
