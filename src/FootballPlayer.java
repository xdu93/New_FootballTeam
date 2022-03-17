public abstract class FootballPlayer extends Player{
    String role;
    String footballSkill;

    public FootballPlayer(String name, int age, String role, String footballSkill) {
        super(name, age);
        this.role = role;
        this.footballSkill = footballSkill;
    }

    @Override
    public void printSkill() {
        System.out.println("I can " + footballSkill + '\n'
                            + "////////////////////////////////////");
    }

    @Override
    public String toString() {
        return "My name is "+ name  + ", I'm " + role + " and I'm " + age + " years old.";
    }
}
