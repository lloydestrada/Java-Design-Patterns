public class Wizard implements CharacterType {
    @Override
    public void attack() {
        CastSpell castSpellAttack = new CastSpell();
        System.out.println("Wizard " + castSpellAttack.attack());

    }

        @Override
        public void defend () {
            CreateMagic createMagicDefense = new CreateMagic();
            System.out.println("Wizard " + createMagicDefense.defend());

        }
    }
