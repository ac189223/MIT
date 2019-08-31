package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO._01_DarkLandsWars;

class _011_Wizard extends _010_Dude {

    _011_Wizard(String name) {
        super(name, 90, 20);
    }

    void putSpell(_010_Dude targetDude, _013_Spell spell) {
        if (getMp() >= targetDude.getMp()) {
            targetDude.updateHp(spell.power + getMp());
            updateMp(10);
            System.out.println(getName() + " shouted \"" + spell.invocation + "\" and " + targetDude.getName() +
                    " got " + spell.power + " injury.");
            if (targetDude.getHp() < 0) {
                System.out.println(targetDude.getName() + " just died and got reborn.");
                targetDude.setHp(50);
            }
            System.out.println("");
        } else {
            updateHp(30);
            updateMp(-10);
            System.out.println(getName() + " did not manage to attack " + targetDude.getName() +
                    " and got 30 injury.");
            if (getHp() < 0) {
                System.out.println(getName() + " just died and got reborn.");
                setHp(50);
            }
            System.out.println("");
        }
    }
}
