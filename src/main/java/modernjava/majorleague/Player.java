package modernjava.majorleague;

public class Player {
    private int year;
    private String team;
    private String league;
    private String playerId;
    private long salary;

    public Player(int year, String team, String league, String playerId, long salary) {
        this.year = year;
        this.team = team;
        this.league = league;
        this.playerId = playerId;
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }
    public String getTeam() {
        return team;
    }
    public String getLeague() {
        return league;
    }
    public String getPlayerId() {
        return playerId;
    }
    public long getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Player{" +
                "year=" + year +
                ", team='" + team + '\'' +
                ", league='" + league + '\'' +
                ", playerId='" + playerId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
