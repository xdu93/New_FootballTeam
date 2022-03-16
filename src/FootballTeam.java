public class FootballTeam {
    public String teamName;
    private FootballPlayer[] playersOfTheTeam;
    private int numberOfPlayers = 11;

    public FootballTeam(String teamName) {
        this.teamName = teamName;
        this.playersOfTheTeam = new FootballPlayer[11];
    }

    public void addPlayer(FootballPlayer footballPlayer) {
        playersOfTheTeam[numberOfPlayers - 1] = footballPlayer;
        numberOfPlayers--;
        if (numberOfPlayers < 0) numberOfPlayers = 11;
    }

    public void print() {
        System.out.println("Team: " + teamName + ". " + "Starting XI");
        System.out.println("___________________");

        for (int i = 0; i < playersOfTheTeam.length; i++) {
            if (playersOfTheTeam[i] != null) {
                System.out.print(playersOfTheTeam[i].name + " - "
                        + "Age: " + playersOfTheTeam[i].age + ". "
                        + "Role: " + playersOfTheTeam[i].role + ".");
                System.out.println("");
            } else System.out.println("empty");
        }
    }

}
