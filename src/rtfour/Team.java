package rtfour;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int points;
    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addMember(T newMember) {
        if (members.contains(newMember)) {
            System.out.println(newMember.getName() + " is already in the team");
        } else {
            members.add(newMember);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.points < team.getPoints()) {
            return 1;
        } else if (this.points > team.getPoints()) {
            return -1;

        }
        return 0;
    }
}
