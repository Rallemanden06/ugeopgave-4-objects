// Opgave 4
import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Player> players;

    public Team(String teamName, ArrayList<Player> players){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p){
        players.add(p);
        System.out.println(p.name + " is on " + teamName);
    }

    public double getAverageSkill(){
        if (players.size() == 0){
            return 0;
        }

        int average = 0;
        for(Player p : players){
            average += p.skillLevel;
        }
        average = average/ players.size();

        return average;
    }

    public void printTeam() {
        System.out.println(teamName);
        for (Player p : players)
        System.out.println(p);
    }

    public void compete(Team opponent){
        double team1 = getAverageSkill();
        double team2 = opponent.getAverageSkill();

        if (team1 < team2){
            System.out.println("Winner: " + teamName);
        } else {
            System.out.println("Winner: " + opponent.teamName);
        }
    }

}

