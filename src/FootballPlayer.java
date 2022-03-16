public abstract class FootballPlayer extends Player{
    String role;
    String skillOfFotballer;

    public FootballPlayer(String name, int age, String role, String skillOfFotballer) {
        super(name, age);
        this.role = role;
        this.skillOfFotballer = skillOfFotballer;
    }

    public String getSkillOfFotballer() {
        return skillOfFotballer;
    }
    public void printSkill(){
        System.out.println(name + " skill: " + getSkillOfFotballer());
    }
}
