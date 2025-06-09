public class Knight implements CharacterType{
    @Override
    public void attack() {
        SwingSword swingingSword = new SwingSword();
        System.out.println("Knight "+ swingingSword.attack());
    }

    @Override
    public void defend() {
        Shield shieldDefense = new Shield();
        CreateMagic createMagicDefense = new CreateMagic();
        Dodge dodgeDefense = new Dodge();

        System.out.println("Knight " + shieldDefense.defend());
        System.out.println("Knight " + createMagicDefense.defend());
        System.out.println("Knight" +  dodgeDefense.defend());

    }
}