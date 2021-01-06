package rtfour;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public LeagueTable(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public void addTeam(T newTeam) {
        teams.add(newTeam);
    }

    public void printLeaderBoard() {
        Collections.sort(teams);
        int place = 1;
        for (Team team : teams) {
            System.out.println("#" + place + " " + team.getName());
            place++;
        }
    }


}
