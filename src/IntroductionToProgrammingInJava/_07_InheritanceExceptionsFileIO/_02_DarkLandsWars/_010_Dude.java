package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO._02_DarkLandsWars;

public class _010_Dude {
    private String name;
    private int hp = 100;
    private int mp = 0;

    _010_Dude(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getHp() { return hp; }

    public void setHp(int hp) { this.hp = hp; }

    public void updateHp(int hp) { this.hp = this.hp - hp; }

    public int getMp() { return mp; }

    public void setMp(int mp) { this.mp = mp; }

    public void updateMp(int mp) { this.mp = this.mp + mp; }

    public void sayName() {
        System.out.println(getName());
    }

    public boolean punchFace(_010_Dude targetDude) {
        boolean dead = false;
        System.out.println(getName() + " punched " + targetDude.getName() +
                " in a face so he got 10 injury.");
        targetDude.updateHp(10);
        if (targetDude.getHp() < 0) {
            System.out.println(targetDude.getName() + " just died.");
            dead = true;
        }
        System.out.println("");
        return dead;
    }
}
