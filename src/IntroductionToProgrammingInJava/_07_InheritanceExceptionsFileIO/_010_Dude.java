package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO;

public class _010_Dude {
    public String name;
    public int hp = 100;
    public int mp = 0;

    public void sayName() {
        System.out.println(name);
    }

    public void punchFace(_010_Dude target) {
        target.hp -= 10;
    }
}
