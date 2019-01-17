package Week11;

public class Team {
    private String teamName;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesDrawn;
    private int gamesLost;
    private int scored;
    private int conceded;
    private int pointsDifference;
    private int points;

    public Team(String teamName) {
        this.teamName = teamName;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesDrawn = 0;
        this.gamesLost = 0;
        this.scored = 0;
        this.conceded = 0;
        this.pointsDifference = 0;
        this.points = 0;
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


    @Override
    public String toString () {
        return "";
    }
}
