public class Archer implements CharacterType{
    @Override
    public void attack() {
        ShootArrow shootArrow = new ShootArrow();
        System.out.println("Archer" + shootArrow.attack());
    }

    @Override
    public void defend() {
        Dodge dodgeDefense = new Dodge();
        System.out.println("Archer" + dodgeDefense.defend());

    }
}