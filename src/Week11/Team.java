package Week11;

public class Team implements Comparable <Team>{
    private String TEAM_NAME;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesDrawn;
    private int gamesLost;
    private int scored;
    private int conceded;
    private int pointsDifference;
    private int points;

    public Team(String teamName) {
        this.TEAM_NAME = teamName;
    }

    public int getPointsDifference() {
        return pointsDifference;
    }

    public int getPoints() {
        return points;
    }

    public void playMatch(int scored, int conceded){
        this.gamesPlayed++;
        this.scored += scored;
        this.conceded += conceded;
        this.pointsDifference = this.scored - this.conceded;

        if (scored > conceded){
            this.gamesWon++;
            this.points += 2;
        }
        else if (scored == conceded){
            this.gamesDrawn++;
            this.points++;
        }
        else{
            this.gamesLost++;
        }
    }

    public void printFormatted () {
        String formatString = "%-25s %7s %4s %6s %5s %4s %8s %9s %7s";
        System.out.println (String.format (formatString, this.TEAM_NAME, this.gamesPlayed, this.gamesWon,
                this.gamesDrawn, this.gamesLost, this.scored, this.conceded, this.pointsDifference, this.points));
    }

    @Override
    public int compareTo (Team team) {
        if (team.getPoints() > this.points) {
            return 1;
        }
        else if (team.getPoints() == this.points) {
            if (team.getPointsDifference() > this.pointsDifference){
                return 1;
            }
            else if (team.getPointsDifference() < this.pointsDifference){
                return -1;
            }
            else {
                return 0;
            }
        }
        else {
            return -1;
        }
    }
}
