package ictgradschool.industry.task02.question2;

public class Psyduck extends Pokemon implements INoise {
    private IType type;

    public Psyduck(String name, int level) {
        super(name, level);
        type = new WaterType();
    }


    @Override
    public boolean attack(Pokemon other) {
        other.loseLifePoints(20 * level);
        lifePoint += 1;
        levelUp();
        return false;
    }



    @Override
    public void levelUp() {
        if (lifePoint >= 10 * level) {
            level++;
            System.out.println("Psyduck levelled up!");
        } else {
            System.out.println("Not enough experience for Psyduck!");
        }
    }


    @Override
    public String makeNoise() {
        return "Psy~~~Duck";
    }
}


