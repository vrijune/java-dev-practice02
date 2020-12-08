package ictgradschool.industry.task02.question2;

public class Charmander extends Pokemon implements INoise{


    public Charmander(String name, int level) {
        super(name, level);
        type = new FireType();
    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(100 * level);
        lifePoint += 5;
        levelUp();

    }




    @Override
    public void levelUp() {
        System.out.println("Charmander never levels up");
    }




    @Override
    public String makeNoise() {
        return "Charmander Char";
    }
}
