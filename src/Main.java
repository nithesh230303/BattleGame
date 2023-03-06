import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,Enum<String,Integer>> input = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
//        String[] attacksOnEachDay = line.split(";");
//        private List<EndOfDay> endOfDays;
//        if(attacksOnEachDay.length>0){
//            AttackedWall attackedWall = null;
//            EndOfDay endOfDay = null;
//            endOfDays = new ArrayList<EndOfDay>();
//            for(String s: attacksOnEachDay){
//                String[] eachAttackinDay = s.split(":");
//                if(eachAttackinDay.length>0){
//                    List<AttackedWall> attackedWalls = new ArrayList<>();
//                    WallDirection direction = null;
//                    String
//                }
//            }
//        }
        BattleTime battleTime = new BattleTime();
        if(battleTime.setUp(line)){
            System.out.println(battleTime.BattleStat());
        }
    }
}