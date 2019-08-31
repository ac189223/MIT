package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO._02_DarkLandsWars;

import java.util.ArrayList;

class _012_SuperWizard extends _011_Wizard {

    _012_SuperWizard(String name) {
        super(name);
    }

    public void putFinalSpell(ArrayList<_011_Wizard> targetWizards) {
        for (_010_Dude targetWizard : targetWizards) {
            targetWizard.setHp(0);
        }
        System.out.println(getName() + " shouted The Final Spell and everyone died and will not get reborn !");
    }
}
