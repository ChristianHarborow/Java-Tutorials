package Week11;

public class LeagueTable {
    public static void main(String[] args) {
        League rugbyLeague = new League();
        rugbyLeague.addTeam(new Team("Leeds Rhinos"));
        rugbyLeague.addTeam(new Team("Huddersfield Giants"));
        rugbyLeague.addTeam(new Team("Wigan Warriors"));
        rugbyLeague.addTeam(new Team("Hull FC"));

        rugbyLeague.getTeam(0).playMatch(22, 12);
        rugbyLeague.getTeam(1).playMatch(12, 22);

        rugbyLeague.getTeam(2).playMatch(18, 12);
        rugbyLeague.getTeam(1).playMatch(12, 18);

        rugbyLeague.getTeam(2).playMatch(34, 0);
        rugbyLeague.getTeam(3).playMatch(0, 34);

        rugbyLeague.getTeam(0).playMatch(10, 10);
        rugbyLeague.getTeam(2).playMatch(10, 10);

        rugbyLeague.printTable();
        rugbyLeague.sortTable();
        rugbyLeague.printTable();
    }
}
