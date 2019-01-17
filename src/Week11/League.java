package Week11;

import java.util.ArrayList;
import java.util.Collections;

public class League {
    private ArrayList<Team> league;

    public League() {
        league = new ArrayList<>();
    }

    public void addTeam(Team team) {
        this.league.add(team);
    }

    public Team getTeam(int index) {
        Team team = this.league.get(index);
        return team;
    }

    public void sortTable() {
        Collections.sort(this.league);
    }

    public void printTable() {
        String formatString = "%-25s %7s %4s %6s %5s %4s %8s %9s %7s";
        System.out.println("League Table");
        System.out.println(String.format(formatString, "Team Name", "Played", "Won",
                "Drawn", "Lost", "For", "Against", "Pts Diff", "Points"));
        for (Team team : league) {
            team.printFormatted();
        }
    }

    public static void main(String[] args) {
        League rugbyLeague = new League();
        rugbyLeague.addTeam(new Team("Huddersfield"));
        rugbyLeague.addTeam(new Team("Leeds"));
        rugbyLeague.printTable();
    }
}
