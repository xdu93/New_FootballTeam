public abstract class FootballPlayer extends Player{
    public String role;

    public FootballPlayer(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
}
