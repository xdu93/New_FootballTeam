import java.util.Arrays;

public class FootballTeam {
    public String teamName;
    private FootballPlayer[] playersOfTheTeam;
    public int numberOfPlayers = 11;

    public FootballTeam(String teamName) {
        this.teamName = teamName;
        this.playersOfTheTeam = new FootballPlayer[11];
    }

    public void addPlayer(FootballPlayer footballPlayer) {
        playersOfTheTeam[numberOfPlayers - 1] = footballPlayer;
        numberOfPlayers--;
        if (numberOfPlayers < 0) numberOfPlayers = 11;
    }

//    public void print() {
//        System.out.println("Team: " + teamName + ". " + "Starting XI");
//        System.out.println("___________________");
//
//        for (int i = 0; i < playersOfTheTeam.length; i++) {
//            if (playersOfTheTeam[i] != null) {
//                System.out.print(playersOfTheTeam[i].name + " - "
//                        + "Age: " + playersOfTheTeam[i].age + ". "
//                        + "Role: " + playersOfTheTeam[i].role + ".");
//                System.out.println("");
//            } else System.out.println("empty");
//        }
//    }

//    @Override
//    public String toString() {
//        String str;
//        for (int i = 0; i < playersOfTheTeam.length; i++) {
//            if (playersOfTheTeam[i] != null) {
//                str = playersOfTheTeam[i].name + " - "
//                        + "Age: " + playersOfTheTeam[i].age + ". "
//                        + "Role: " + playersOfTheTeam[i].role + "." + '/n';
//            } else str = "empty";
//        return str;
//    }

        @Override
        public String toString() {
            String str ="Team: " +  teamName +'\n';
            str +=  "Squad: ";
            for (FootballPlayer n: playersOfTheTeam) {
                str += n.name + ", ";
            }
            return str +'\n';
        }

    public FootballPlayer[] getPlayersOfTheTeam() {
        return playersOfTheTeam;
    }
}
