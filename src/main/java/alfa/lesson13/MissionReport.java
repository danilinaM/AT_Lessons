package alfa.lesson13;

import java.util.List;

public class MissionReport {
    private String missionName;
    private List<Alien> capturedAliens;
    private int squadSize;

    public MissionReport(String missionName, List<Alien> capturedAliens, int squadSize) {
        this.missionName = missionName;
        this.capturedAliens = capturedAliens;
        this.squadSize = squadSize;
    }

    @Override
    public String toString() {
        return "Инфо о миссии :" +
                "Миссия: " + missionName + '\'' +
                ", Поймано пришельцев: " + capturedAliens.size() +
                ", Размер отряда: " + squadSize;
    }
}
