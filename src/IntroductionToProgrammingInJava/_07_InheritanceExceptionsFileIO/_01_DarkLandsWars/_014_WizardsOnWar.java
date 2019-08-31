package IntroductionToProgrammingInJava._07_InheritanceExceptionsFileIO._01_DarkLandsWars;

import java.util.ArrayList;
import java.util.Random;

public class _014_WizardsOnWar {

    public static void main(String[] args) {
        ArrayList<_011_Wizard> wizards = new ArrayList<>();
        ArrayList<_013_Spell> spells = new ArrayList<>();

        wizards.add(new _011_Wizard("Behreim"));
        wizards.add(new _011_Wizard("Derghor"));
        wizards.add(new _011_Wizard("Gemeneroth"));
        wizards.add(new _011_Wizard("Imereth"));
        wizards.add(new _011_Wizard("Niyago"));
        wizards.add(new _012_SuperWizard("Oxenoth"));

        _012_SuperWizard oxenoth = (_012_SuperWizard) wizards.get(wizards.size() - 1);

        Random random = new Random();
        spells.add(new _013_Spell(10*(random.nextInt(5)+1), "Alarte Ascendare"));
        spells.add(new _013_Spell(10*(random.nextInt(5)+1), "Conjunctivitis"));
        spells.add(new _013_Spell(10*(random.nextInt(5)+1), "Harmonia Nectere Passus"));
        spells.add(new _013_Spell(10*(random.nextInt(5)+1), "Lacarnum Inflamari"));
        spells.add(new _013_Spell(10*(random.nextInt(5)+1), "Mucus ad Nauseaam"));
        spells.add(new _013_Spell(10*(random.nextInt(5)+1), "Scribblifors"));
        int numSpells = spells.size();

        for (int rounds = 1; rounds <= (random.nextInt(10) +20); rounds++) {
            int wiz = random.nextInt(wizards.size());
            int targetWiz = random.nextInt(wizards.size());
            int spell = random.nextInt(numSpells + 1);
            if (spell == numSpells) {
                wizards.get(wiz).punchFace(wizards.get(targetWiz));
            } else {
                wizards.get(wiz).putSpell(wizards.get(targetWiz), spells.get(spell));
            }
        }
        oxenoth.putFinalSpell(wizards);
    }
}

