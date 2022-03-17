import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        FootballTeam newTeam = new FootballTeam("Arsenal");

        //Варатарь
        newTeam.addPlayer(new Goalkeeper("Buffon", 46));

        //Защитники
        newTeam.addPlayer(new Defender("Sanga", 23));
        newTeam.addPlayer(new Defender("White", 26));
        newTeam.addPlayer(new Defender("Gabi", 28));
        newTeam.addPlayer(new Defender("Tierny", 30));

        //Полузащитники
        newTeam.addPlayer(new Midefielder("Saka", 20));
        newTeam.addPlayer(new Midefielder("Ozil", 19));
        newTeam.addPlayer(new Midefielder("Partey", 23));

        //Нападающие
        newTeam.addPlayer(new Striker("Marty", 28));
        newTeam.addPlayer(new Striker("Laca", 12));
        newTeam.addPlayer(new Striker("Calum", 28));

        System.out.println("____________");
        System.out.println(newTeam);

        System.out.println("____________");
        System.out.println("INTRODUCE THE TEAM");

        for (Object player : newTeam.getPlayersOfTheTeam()) {
            System.out.println(player);
            if (player instanceof Skillable){
                ((Skillable)player).printSkill();
            }
        }
    }
}
