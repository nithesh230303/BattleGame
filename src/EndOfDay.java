import java.util.List;

public class EndOfDay {
    private String dayNumber;
    private List<AttackedWall> attacks;

    public EndOfDay(String dayNumber, List<AttackedWall> attacks) {
        this.dayNumber = dayNumber;
        this.attacks = attacks;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public List<AttackedWall> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<AttackedWall> attacks) {
        this.attacks = attacks;
    }
}
