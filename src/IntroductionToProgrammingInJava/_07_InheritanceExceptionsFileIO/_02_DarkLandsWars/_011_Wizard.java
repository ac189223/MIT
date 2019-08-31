package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO._02_DarkLandsWars;

class _011_Wizard extends _010_Dude {

    _011_Wizard(String name) {
        super(name, 90, 20);
    }

    boolean putSpell(_010_Dude targetDude, _013_Spell spell) {
        boolean dead = false;
        if (getMp() >= targetDude.getMp()) {
//            System.out.println(getName() + " " + getHp() + " " + getMp());
//            System.out.println(targetDude.getName() + " " + targetDude.getHp() + " " + targetDude.getMp());
            System.out.println(getName() + " shouted \"" + spell.invocation + "\" and " + targetDude.getName() +
                    " got " + (spell.power + getMp()) + " injury.");
            targetDude.updateHp(spell.power + getMp());
            updateMp(10);
//            System.out.println(getName() + " " + getHp() + " " + getMp());
//            System.out.println(targetDude.getName() + " " + targetDude.getHp() + " " + targetDude.getMp());
            if (targetDude.getHp() < 0) {
                System.out.println(targetDude.getName() + " just died.");
                dead = true;
//                System.out.println(getName() + " " + getHp() + " " + getMp());
//                System.out.println(targetDude.getName() + " " + targetDude.getHp() + " " + targetDude.getMp());
            }
            System.out.println("");
        } else {
//            System.out.println(getName() + " " + getHp() + " " + getMp());
//            System.out.println(targetDude.getName() + " " + targetDude.getHp() + " " + targetDude.getMp());
            updateHp(30);
            updateMp(-10);
            targetDude.updateMp(10);
            System.out.println(getName() + " did not manage to attack " + targetDude.getName() +
                    " and got 30 injury.");
//            System.out.println(getName() + " " + getHp() + " " + getMp());
//            System.out.println(targetDude.getName() + " " + targetDude.getHp() + " " + targetDude.getMp());
            if (getHp() < 0) {
                System.out.println(getName() + " just died.");
                dead = true;
//                System.out.println(getName() + " " + getHp() + " " + getMp());
//                System.out.println(targetDude.getName() + " " + targetDude.getHp() + " " + targetDude.getMp());
            }
            System.out.println("");
        }
        return dead;
    }
}
